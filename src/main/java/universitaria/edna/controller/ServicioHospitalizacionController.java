package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.ServicioHospitalizacionEntity;
import universitaria.edna.form.ServicioHospitalizacionForm;
import universitaria.edna.repository.IServicioHospitalizacionRepository;
import universitaria.edna.repository.SqlServicioHospitalizacionService;

import java.util.List;
import javax.inject.Inject;

@Controller("/serviciohospitalizacion")
public class ServicioHospitalizacionController {

  private IServicioHospitalizacionRepository servicioHospitalizacionService;

  @Inject
  public ServicioHospitalizacionController(SqlServicioHospitalizacionService service) {
    this.servicioHospitalizacionService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<ServicioHospitalizacionEntity>> findAll() {
    List<ServicioHospitalizacionEntity> allServicioHospitalizacion = this.servicioHospitalizacionService.fetch();
    return HttpResponse.ok(allServicioHospitalizacion);
  }

  @Get()
  @View("/serviciohospitalizacion")
  public HttpResponse index() {
    List<ServicioHospitalizacionEntity> allServicioHospitalizacion = this.servicioHospitalizacionService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allServicioHospitalizacion
    ));
  }

  @Get("/create")
  @View("/serviciohospitalizacion_create")
  public HttpResponse createView() {
    ServicioHospitalizacionForm ServicioHospitalizacion = new ServicioHospitalizacionForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ServicioHospitalizacion
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ServicioHospitalizacionEntity> create(@Body final ServicioHospitalizacionForm creating) {
    boolean created = this.servicioHospitalizacionService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ServicioHospitalizacionEntity> update(@Body final ServicioHospitalizacionForm updating) {
    boolean updated = this.servicioHospitalizacionService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<ServicioHospitalizacionEntity> get(final long id) {
    ServicioHospitalizacionEntity entry = this.servicioHospitalizacionService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/serviciohospitalizacion_details")
  public HttpResponse detailsView(long id) {
    ServicioHospitalizacionEntity ServicioHospitalizacion = this.servicioHospitalizacionService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ServicioHospitalizacion
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    ServicioHospitalizacionEntity ServicioHospitalizacion = this.servicioHospitalizacionService.get(id);
    this.servicioHospitalizacionService.delete(ServicioHospitalizacion);
    return HttpResponse.ok();
  }
}
