package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.IngresoPacienteEntity;
import universitaria.edna.form.IngresoPacienteForm;
import universitaria.edna.repository.IIngresoPacienteRepository;
import universitaria.edna.repository.SqlIngresoPacienteService;

import java.util.List;
import javax.inject.Inject;

@Controller("/ingresopaciente")
public class IngresoPacienteController {

  private IIngresoPacienteRepository ingresoPacienteService;

  @Inject
  public IngresoPacienteController(SqlIngresoPacienteService service) {
    this.ingresoPacienteService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<IngresoPacienteEntity>> findAll() {
    List<IngresoPacienteEntity> allIngresoPaciente = this.ingresoPacienteService.fetch();
    return HttpResponse.ok(allIngresoPaciente);
  }

  @Get()
  @View("/ingresopaciente")
  public HttpResponse index() {
    List<IngresoPacienteEntity> allIngresoPaciente = this.ingresoPacienteService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allIngresoPaciente
    ));
  }

  @Get("/create")
  @View("/ingresopaciente_create")
  public HttpResponse createView() {
    IngresoPacienteForm IngresoPaciente = new IngresoPacienteForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", IngresoPaciente
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<IngresoPacienteEntity> create(@Body final IngresoPacienteForm creating) {
    boolean created = this.ingresoPacienteService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<IngresoPacienteEntity> update(@Body final IngresoPacienteForm updating) {
    boolean updated = this.ingresoPacienteService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<IngresoPacienteEntity> get(final long id) {
    IngresoPacienteEntity entry = this.ingresoPacienteService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/ingresopaciente_details")
  public HttpResponse detailsView(long id) {
    IngresoPacienteEntity IngresoPaciente = this.ingresoPacienteService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", IngresoPaciente
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    IngresoPacienteEntity IngresoPaciente = this.ingresoPacienteService.get(id);
    this.ingresoPacienteService.delete(IngresoPaciente);
    return HttpResponse.ok();
  }
}
