package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.ExamenRealizadoEntity;
import universitaria.edna.form.ExamenRealizadoForm;
import universitaria.edna.repository.IExamenRealizadoRepository;
import universitaria.edna.repository.SqlExamenRealizadoService;

import java.util.List;
import javax.inject.Inject;

@Controller("/examenrealizado")
public class ExamenRealizadoController {

  private IExamenRealizadoRepository examenRealizadoService;

  @Inject
  public ExamenRealizadoController(SqlExamenRealizadoService service) {
    this.examenRealizadoService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<ExamenRealizadoEntity>> findAll() {
    List<ExamenRealizadoEntity> allExamenRealizado = this.examenRealizadoService.fetch();
    return HttpResponse.ok(allExamenRealizado);
  }

  @Get()
  @View("/examenrealizado")
  public HttpResponse index() {
    List<ExamenRealizadoEntity> allExamenRealizado = this.examenRealizadoService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allExamenRealizado
    ));
  }

  @Get("/create")
  @View("/examenrealizado_create")
  public HttpResponse createView() {
    ExamenRealizadoForm ExamenRealizado = new ExamenRealizadoForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ExamenRealizado
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ExamenRealizadoEntity> create(@Body final ExamenRealizadoForm creating) {
    boolean created = this.examenRealizadoService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ExamenRealizadoEntity> update(@Body final ExamenRealizadoForm updating) {
    boolean updated = this.examenRealizadoService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<ExamenRealizadoEntity> get(final long id) {
    ExamenRealizadoEntity entry = this.examenRealizadoService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/examenrealizado_details")
  public HttpResponse detailsView(long id) {
    ExamenRealizadoEntity ExamenRealizado = this.examenRealizadoService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ExamenRealizado
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    ExamenRealizadoEntity ExamenRealizado = this.examenRealizadoService.get(id);
    this.examenRealizadoService.delete(ExamenRealizado);
    return HttpResponse.ok();
  }
}
