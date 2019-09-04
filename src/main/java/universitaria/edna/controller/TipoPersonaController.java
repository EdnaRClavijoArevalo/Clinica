package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.TipoPersonaEntity;
import universitaria.edna.form.TipoPersonaForm;
import universitaria.edna.repository.ITipoPersonaRepository;
import universitaria.edna.repository.SqlTipoPersonaService;

import java.util.List;
import javax.inject.Inject;

@Controller("/tipopersona")
public class TipoPersonaController {

  private ITipoPersonaRepository tipoPersonaService;

  @Inject
  public TipoPersonaController(SqlTipoPersonaService service) {
    this.tipoPersonaService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<TipoPersonaEntity>> findAll() {
    List<TipoPersonaEntity> allTipoPersona = this.tipoPersonaService.fetch();
    return HttpResponse.ok(allTipoPersona);
  }

  @Get()
  @View("/tipopersona")
  public HttpResponse index() {
    List<TipoPersonaEntity> allTipoPersona = this.tipoPersonaService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allTipoPersona
    ));
  }

  @Get("/create")
  @View("/tipopersona_create")
  public HttpResponse createView() {
    TipoPersonaForm TipoPersona = new TipoPersonaForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", TipoPersona
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<TipoPersonaEntity> create(@Body final TipoPersonaForm creating) {
    boolean created = this.tipoPersonaService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<TipoPersonaEntity> update(@Body final TipoPersonaForm updating) {
    boolean updated = this.tipoPersonaService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<TipoPersonaEntity> get(final long id) {
    TipoPersonaEntity entry = this.tipoPersonaService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/tipopersona_details")
  public HttpResponse detailsView(long id) {
    TipoPersonaEntity TipoPersona = this.tipoPersonaService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", TipoPersona
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    TipoPersonaEntity TipoPersona = this.tipoPersonaService.get(id);
    this.tipoPersonaService.delete(TipoPersona);
    return HttpResponse.ok();
  }
}
