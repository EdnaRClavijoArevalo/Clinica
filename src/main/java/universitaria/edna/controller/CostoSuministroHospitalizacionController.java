package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.CostoSuministroHospitalizacionEntity;
import universitaria.edna.form.CostoSuministroHospitalizacionForm;
import universitaria.edna.repository.ICostoSuministroHospitalizacionRepository;
import universitaria.edna.repository.SqlCostoSuministroHospitalizacionService;

import java.util.List;
import javax.inject.Inject;

@Controller("/costosuministrohospitalizacion")
public class CostoSuministroHospitalizacionController {

  private ICostoSuministroHospitalizacionRepository costoSuministroHospitalizacionService;

  @Inject
  public CostoSuministroHospitalizacionController(SqlCostoSuministroHospitalizacionService service) {
    this.costoSuministroHospitalizacionService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<CostoSuministroHospitalizacionEntity>> findAll() {
    List<CostoSuministroHospitalizacionEntity> allCostoSuministroHospitalizacion = this.costoSuministroHospitalizacionService.fetch();
    return HttpResponse.ok(allCostoSuministroHospitalizacion);
  }

  @Get()
  @View("/costosuministrohospitalizacion")
  public HttpResponse index() {
    List<CostoSuministroHospitalizacionEntity> allCostoSuministroHospitalizacion = this.costoSuministroHospitalizacionService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allCostoSuministroHospitalizacion
    ));
  }

  @Get("/create")
  @View("/costosuministrohospitalizacion_create")
  public HttpResponse createView() {
    CostoSuministroHospitalizacionForm CostoSuministroHospitalizacion = new CostoSuministroHospitalizacionForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", CostoSuministroHospitalizacion
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<CostoSuministroHospitalizacionEntity> create(@Body final CostoSuministroHospitalizacionForm creating) {
    boolean created = this.costoSuministroHospitalizacionService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<CostoSuministroHospitalizacionEntity> update(@Body final CostoSuministroHospitalizacionForm updating) {
    boolean updated = this.costoSuministroHospitalizacionService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<CostoSuministroHospitalizacionEntity> get(final long id) {
    CostoSuministroHospitalizacionEntity entry = this.costoSuministroHospitalizacionService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/costosuministrohospitalizacion_details")
  public HttpResponse detailsView(long id) {
    CostoSuministroHospitalizacionEntity CostoSuministroHospitalizacion = this.costoSuministroHospitalizacionService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", CostoSuministroHospitalizacion
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    CostoSuministroHospitalizacionEntity CostoSuministroHospitalizacion = this.costoSuministroHospitalizacionService.get(id);
    this.costoSuministroHospitalizacionService.delete(CostoSuministroHospitalizacion);
    return HttpResponse.ok();
  }
}
