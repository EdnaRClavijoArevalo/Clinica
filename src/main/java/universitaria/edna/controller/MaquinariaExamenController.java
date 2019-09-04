package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.MaquinariaExamenEntity;
import universitaria.edna.form.MaquinariaExamenForm;
import universitaria.edna.repository.IMaquinariaExamenRepository;
import universitaria.edna.repository.SqlMaquinariaExamenService;

import java.util.List;
import javax.inject.Inject;

@Controller("/maquinariaexamen")
public class MaquinariaExamenController {

  private IMaquinariaExamenRepository maquinariaExamenService;

  @Inject
  public MaquinariaExamenController(SqlMaquinariaExamenService service) {
    this.maquinariaExamenService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<MaquinariaExamenEntity>> findAll() {
    List<MaquinariaExamenEntity> allMaquinariaExamen = this.maquinariaExamenService.fetch();
    return HttpResponse.ok(allMaquinariaExamen);
  }

  @Get()
  @View("/maquinariaexamen")
  public HttpResponse index() {
    List<MaquinariaExamenEntity> allMaquinariaExamen = this.maquinariaExamenService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allMaquinariaExamen
    ));
  }

  @Get("/create")
  @View("/maquinariaexamen_create")
  public HttpResponse createView() {
    MaquinariaExamenForm MaquinariaExamen = new MaquinariaExamenForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", MaquinariaExamen
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<MaquinariaExamenEntity> create(@Body final MaquinariaExamenForm creating) {
    boolean created = this.maquinariaExamenService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<MaquinariaExamenEntity> update(@Body final MaquinariaExamenForm updating) {
    boolean updated = this.maquinariaExamenService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<MaquinariaExamenEntity> get(final long id) {
    MaquinariaExamenEntity entry = this.maquinariaExamenService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/maquinariaexamen_details")
  public HttpResponse detailsView(long id) {
    MaquinariaExamenEntity MaquinariaExamen = this.maquinariaExamenService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", MaquinariaExamen
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    MaquinariaExamenEntity MaquinariaExamen = this.maquinariaExamenService.get(id);
    this.maquinariaExamenService.delete(MaquinariaExamen);
    return HttpResponse.ok();
  }
}
