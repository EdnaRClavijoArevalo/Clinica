package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.HistoriaClinicaEntity;
import universitaria.edna.form.HistoriaClinicaForm;
import universitaria.edna.repository.IHistoriaClinicaRepository;
import universitaria.edna.repository.SqlHistoriaClinicaService;

import java.util.List;
import javax.inject.Inject;

@Controller("/historiaclinica")
public class HistoriaClinicaController {

  private IHistoriaClinicaRepository historiaClinicaService;

  @Inject
  public HistoriaClinicaController(SqlHistoriaClinicaService service) {
    this.historiaClinicaService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<HistoriaClinicaEntity>> findAll() {
    List<HistoriaClinicaEntity> allHistoriaClinica = this.historiaClinicaService.fetch();
    return HttpResponse.ok(allHistoriaClinica);
  }

  @Get()
  @View("/historiaclinica")
  public HttpResponse index() {
    List<HistoriaClinicaEntity> allHistoriaClinica = this.historiaClinicaService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allHistoriaClinica
    ));
  }

  @Get("/create")
  @View("/historiaclinica_create")
  public HttpResponse createView() {
    HistoriaClinicaForm HistoriaClinica = new HistoriaClinicaForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", HistoriaClinica
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<HistoriaClinicaEntity> create(@Body final HistoriaClinicaForm creating) {
    boolean created = this.historiaClinicaService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<HistoriaClinicaEntity> update(@Body final HistoriaClinicaForm updating) {
    boolean updated = this.historiaClinicaService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<HistoriaClinicaEntity> get(final long id) {
    HistoriaClinicaEntity entry = this.historiaClinicaService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/historiaclinica_details")
  public HttpResponse detailsView(long id) {
    HistoriaClinicaEntity HistoriaClinica = this.historiaClinicaService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", HistoriaClinica
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    HistoriaClinicaEntity HistoriaClinica = this.historiaClinicaService.get(id);
    this.historiaClinicaService.delete(HistoriaClinica);
    return HttpResponse.ok();
  }
}
