package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.CaracteristicaPersonaEntity;
import universitaria.edna.form.CaracteristicaPersonaForm;
import universitaria.edna.repository.ICaracteristicaPersonaRepository;
import universitaria.edna.repository.SqlCaracteristicaPersonaService;

import java.util.List;
import javax.inject.Inject;

@Controller("/caracteristicapersona")
public class CaracteristicaPersonaController {

  private ICaracteristicaPersonaRepository caracteristicaPersonaService;

  @Inject
  public CaracteristicaPersonaController(SqlCaracteristicaPersonaService service) {
    this.caracteristicaPersonaService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<CaracteristicaPersonaEntity>> findAll() {
    List<CaracteristicaPersonaEntity> allCaracteristicaPersona = this.caracteristicaPersonaService.fetch();
    return HttpResponse.ok(allCaracteristicaPersona);
  }

  @Get()
  @View("/caracteristicapersona")
  public HttpResponse index() {
    List<CaracteristicaPersonaEntity> allCaracteristicaPersona = this.caracteristicaPersonaService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allCaracteristicaPersona
    ));
  }

  @Get("/create")
  @View("/caracteristicapersona_create")
  public HttpResponse createView() {
    CaracteristicaPersonaForm CaracteristicaPersona = new CaracteristicaPersonaForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", CaracteristicaPersona
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<CaracteristicaPersonaEntity> create(@Body final CaracteristicaPersonaForm creating) {
    boolean created = this.caracteristicaPersonaService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<CaracteristicaPersonaEntity> update(@Body final CaracteristicaPersonaForm updating) {
    boolean updated = this.caracteristicaPersonaService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<CaracteristicaPersonaEntity> get(final long id) {
    CaracteristicaPersonaEntity entry = this.caracteristicaPersonaService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/caracteristicapersona_details")
  public HttpResponse detailsView(long id) {
    CaracteristicaPersonaEntity CaracteristicaPersona = this.caracteristicaPersonaService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", CaracteristicaPersona
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    CaracteristicaPersonaEntity CaracteristicaPersona = this.caracteristicaPersonaService.get(id);
    this.caracteristicaPersonaService.delete(CaracteristicaPersona);
    return HttpResponse.ok();
  }
}
