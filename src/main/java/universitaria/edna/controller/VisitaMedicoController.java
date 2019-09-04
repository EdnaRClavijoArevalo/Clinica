package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.VisitaMedicoEntity;
import universitaria.edna.form.VisitaMedicoForm;
import universitaria.edna.repository.IVisitaMedicoRepository;
import universitaria.edna.repository.SqlVisitaMedicoService;

import java.util.List;
import javax.inject.Inject;

@Controller("/visitamedico")
public class VisitaMedicoController {

  private IVisitaMedicoRepository visitaMedicoService;

  @Inject
  public VisitaMedicoController(SqlVisitaMedicoService service) {
    this.visitaMedicoService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<VisitaMedicoEntity>> findAll() {
    List<VisitaMedicoEntity> allVisitaMedico = this.visitaMedicoService.fetch();
    return HttpResponse.ok(allVisitaMedico);
  }

  @Get()
  @View("/visitamedico")
  public HttpResponse index() {
    List<VisitaMedicoEntity> allVisitaMedico = this.visitaMedicoService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allVisitaMedico
    ));
  }

  @Get("/create")
  @View("/visitamedico_create")
  public HttpResponse createView() {
    VisitaMedicoForm VisitaMedico = new VisitaMedicoForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", VisitaMedico
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<VisitaMedicoEntity> create(@Body final VisitaMedicoForm creating) {
    boolean created = this.visitaMedicoService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<VisitaMedicoEntity> update(@Body final VisitaMedicoForm updating) {
    boolean updated = this.visitaMedicoService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<VisitaMedicoEntity> get(final long id) {
    VisitaMedicoEntity entry = this.visitaMedicoService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/visitamedico_details")
  public HttpResponse detailsView(long id) {
    VisitaMedicoEntity VisitaMedico = this.visitaMedicoService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", VisitaMedico
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    VisitaMedicoEntity VisitaMedico = this.visitaMedicoService.get(id);
    this.visitaMedicoService.delete(VisitaMedico);
    return HttpResponse.ok();
  }
}
