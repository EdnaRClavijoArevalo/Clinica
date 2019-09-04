package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.HabitacionEntity;
import universitaria.edna.form.HabitacionForm;
import universitaria.edna.repository.IHabitacionRepository;
import universitaria.edna.repository.SqlHabitacionService;

import java.util.List;
import javax.inject.Inject;

@Controller("/habitacion")
public class HabitacionController {

  private IHabitacionRepository habitacionService;

  @Inject
  public HabitacionController(SqlHabitacionService service) {
    this.habitacionService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<HabitacionEntity>> findAll() {
    List<HabitacionEntity> allHabitacion = this.habitacionService.fetch();
    return HttpResponse.ok(allHabitacion);
  }

  @Get()
  @View("/habitacion")
  public HttpResponse index() {
    List<HabitacionEntity> allHabitacion = this.habitacionService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allHabitacion
    ));
  }

  @Get("/create")
  @View("/habitacion_create")
  public HttpResponse createView() {
    HabitacionForm Habitacion = new HabitacionForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", Habitacion
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<HabitacionEntity> create(@Body final HabitacionForm creating) {
    boolean created = this.habitacionService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<HabitacionEntity> update(@Body final HabitacionForm updating) {
    boolean updated = this.habitacionService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<HabitacionEntity> get(final long id) {
    HabitacionEntity entry = this.habitacionService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/habitacion_details")
  public HttpResponse detailsView(long id) {
    HabitacionEntity Habitacion = this.habitacionService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", Habitacion
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    HabitacionEntity Habitacion = this.habitacionService.get(id);
    this.habitacionService.delete(Habitacion);
    return HttpResponse.ok();
  }
}
