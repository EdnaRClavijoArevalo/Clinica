package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.ServicioHospitalEntity;
import universitaria.edna.form.ServicioHospitalForm;
import universitaria.edna.repository.IServicioHospitalRepository;
import universitaria.edna.repository.SqlServicioHospitalService;

import java.util.List;
import javax.inject.Inject;

@Controller("/serviciohospital")
public class ServicioHospitalController {

  private IServicioHospitalRepository servicioHospitalService;

  @Inject
  public ServicioHospitalController(SqlServicioHospitalService service) {
    this.servicioHospitalService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<ServicioHospitalEntity>> findAll() {
    List<ServicioHospitalEntity> allServicioHospital = this.servicioHospitalService.fetch();
    return HttpResponse.ok(allServicioHospital);
  }

  @Get()
  @View("/serviciohospital")
  public HttpResponse index() {
    List<ServicioHospitalEntity> allServicioHospital = this.servicioHospitalService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allServicioHospital
    ));
  }

  @Get("/create")
  @View("/serviciohospital_create")
  public HttpResponse createView() {
    ServicioHospitalForm ServicioHospital = new ServicioHospitalForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ServicioHospital
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ServicioHospitalEntity> create(@Body final ServicioHospitalForm creating) {
    boolean created = this.servicioHospitalService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ServicioHospitalEntity> update(@Body final ServicioHospitalForm updating) {
    boolean updated = this.servicioHospitalService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<ServicioHospitalEntity> get(final long id) {
    ServicioHospitalEntity entry = this.servicioHospitalService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/serviciohospital_details")
  public HttpResponse detailsView(long id) {
    ServicioHospitalEntity ServicioHospital = this.servicioHospitalService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ServicioHospital
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    ServicioHospitalEntity ServicioHospital = this.servicioHospitalService.get(id);
    this.servicioHospitalService.delete(ServicioHospital);
    return HttpResponse.ok();
  }
}
