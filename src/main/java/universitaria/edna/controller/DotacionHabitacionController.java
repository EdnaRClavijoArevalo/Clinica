package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.DotacionHabitacionEntity;
import universitaria.edna.form.DotacionHabitacionForm;
import universitaria.edna.repository.IDotacionHabitacionRepository;
import universitaria.edna.repository.SqlDotacionHabitacionService;

import java.util.List;
import javax.inject.Inject;

@Controller("/dotacionhabitacion")
public class DotacionHabitacionController {

  private IDotacionHabitacionRepository dotacionHabitacionService;

  @Inject
  public DotacionHabitacionController(SqlDotacionHabitacionService service) {
    this.dotacionHabitacionService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<DotacionHabitacionEntity>> findAll() {
    List<DotacionHabitacionEntity> allDotacionHabitacion = this.dotacionHabitacionService.fetch();
    return HttpResponse.ok(allDotacionHabitacion);
  }

  @Get()
  @View("/dotacionhabitacion")
  public HttpResponse index() {
    List<DotacionHabitacionEntity> allDotacionHabitacion = this.dotacionHabitacionService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allDotacionHabitacion
    ));
  }

  @Get("/create")
  @View("/dotacionhabitacion_create")
  public HttpResponse createView() {
    DotacionHabitacionForm DotacionHabitacion = new DotacionHabitacionForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", DotacionHabitacion
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<DotacionHabitacionEntity> create(@Body final DotacionHabitacionForm creating) {
    boolean created = this.dotacionHabitacionService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<DotacionHabitacionEntity> update(@Body final DotacionHabitacionForm updating) {
    boolean updated = this.dotacionHabitacionService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<DotacionHabitacionEntity> get(final long id) {
    DotacionHabitacionEntity entry = this.dotacionHabitacionService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/dotacionhabitacion_details")
  public HttpResponse detailsView(long id) {
    DotacionHabitacionEntity DotacionHabitacion = this.dotacionHabitacionService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", DotacionHabitacion
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    DotacionHabitacionEntity DotacionHabitacion = this.dotacionHabitacionService.get(id);
    this.dotacionHabitacionService.delete(DotacionHabitacion);
    return HttpResponse.ok();
  }
}
