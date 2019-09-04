package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.PersonaEntity;
import universitaria.edna.form.PersonaForm;
import universitaria.edna.repository.IPersonaRepository;
import universitaria.edna.repository.SqlPersonaService;

import java.util.List;
import javax.inject.Inject;

@Controller("/persona")
public class PersonaController {

  private IPersonaRepository personaService;

  @Inject
  public PersonaController(SqlPersonaService service) {
    this.personaService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<PersonaEntity>> findAll() {
    List<PersonaEntity> allPersona = this.personaService.fetch();
    return HttpResponse.ok(allPersona);
  }

  @Get()
  @View("/persona")
  public HttpResponse index() {
    List<PersonaEntity> allPersona = this.personaService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allPersona
    ));
  }

  @Get("/create")
  @View("/persona_create")
  public HttpResponse createView() {
    PersonaForm Persona = new PersonaForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", Persona
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<PersonaEntity> create(@Body final PersonaForm creating) {
    boolean created = this.personaService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<PersonaEntity> update(@Body final PersonaForm updating) {
    boolean updated = this.personaService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<PersonaEntity> get(final long id) {
    PersonaEntity entry = this.personaService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/persona_details")
  public HttpResponse detailsView(long id) {
    PersonaEntity Persona = this.personaService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", Persona
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    PersonaEntity Persona = this.personaService.get(id);
    this.personaService.delete(Persona);
    return HttpResponse.ok();
  }
}
