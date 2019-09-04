package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.EdificioEntity;
import universitaria.edna.form.EdificioForm;
import universitaria.edna.repository.IEdificioRepository;
import universitaria.edna.repository.SqlEdificioService;

import java.util.List;
import javax.inject.Inject;

@Controller("/edificio")
public class EdificioController {

  private IEdificioRepository edificioService;

  @Inject
  public EdificioController(SqlEdificioService service) {
    this.edificioService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<EdificioEntity>> findAll() {
    List<EdificioEntity> allEdificio = this.edificioService.fetch();
    return HttpResponse.ok(allEdificio);
  }

  @Get()
  @View("/edificio")
  public HttpResponse index() {
    List<EdificioEntity> allEdificio = this.edificioService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allEdificio
    ));
  }

  @Get("/create")
  @View("/edificio_create")
  public HttpResponse createView() {
    EdificioForm Edificio = new EdificioForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", Edificio
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<EdificioEntity> create(@Body final EdificioForm creating) {
    boolean created = this.edificioService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<EdificioEntity> update(@Body final EdificioForm updating) {
    boolean updated = this.edificioService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<EdificioEntity> get(final long id) {
    EdificioEntity entry = this.edificioService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/edificio_details")
  public HttpResponse detailsView(long id) {
    EdificioEntity Edificio = this.edificioService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", Edificio
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    EdificioEntity Edificio = this.edificioService.get(id);
    this.edificioService.delete(Edificio);
    return HttpResponse.ok();
  }
}
