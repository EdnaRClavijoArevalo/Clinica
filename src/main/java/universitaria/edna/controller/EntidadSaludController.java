package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.EntidadSaludEntity;
import universitaria.edna.form.EntidadSaludForm;
import universitaria.edna.repository.IEntidadSaludRepository;
import universitaria.edna.repository.SqlEntidadSaludService;

import java.util.List;
import javax.inject.Inject;

@Controller("/entidadsalud")
public class EntidadSaludController {

  private IEntidadSaludRepository entidadSaludService;

  @Inject
  public EntidadSaludController(SqlEntidadSaludService service) {
    this.entidadSaludService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<EntidadSaludEntity>> findAll() {
    List<EntidadSaludEntity> allEntidadSalud = this.entidadSaludService.fetch();
    return HttpResponse.ok(allEntidadSalud);
  }

  @Get()
  @View("/entidadsalud")
  public HttpResponse index() {
    List<EntidadSaludEntity> allEntidadSalud = this.entidadSaludService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allEntidadSalud
    ));
  }

  @Get("/create")
  @View("/entidadsalud_create")
  public HttpResponse createView() {
    EntidadSaludForm EntidadSalud = new EntidadSaludForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", EntidadSalud
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<EntidadSaludEntity> create(@Body final EntidadSaludForm creating) {
    boolean created = this.entidadSaludService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<EntidadSaludEntity> update(@Body final EntidadSaludForm updating) {
    boolean updated = this.entidadSaludService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<EntidadSaludEntity> get(final long id) {
    EntidadSaludEntity entry = this.entidadSaludService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/entidadsalud_details")
  public HttpResponse detailsView(long id) {
    EntidadSaludEntity EntidadSalud = this.entidadSaludService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", EntidadSalud
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    EntidadSaludEntity EntidadSalud = this.entidadSaludService.get(id);
    this.entidadSaludService.delete(EntidadSalud);
    return HttpResponse.ok();
  }
}
