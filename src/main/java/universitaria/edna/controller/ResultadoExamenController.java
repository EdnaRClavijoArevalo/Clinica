package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.ResultadoExamenEntity;
import universitaria.edna.form.ResultadoExamenForm;
import universitaria.edna.repository.IResultadoExamenRepository;
import universitaria.edna.repository.SqlResultadoExamenService;

import java.util.List;
import javax.inject.Inject;

@Controller("/resultadoexamen")
public class ResultadoExamenController {

  private IResultadoExamenRepository resultadoExamenService;

  @Inject
  public ResultadoExamenController(SqlResultadoExamenService service) {
    this.resultadoExamenService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<ResultadoExamenEntity>> findAll() {
    List<ResultadoExamenEntity> allResultadoExamen = this.resultadoExamenService.fetch();
    return HttpResponse.ok(allResultadoExamen);
  }

  @Get()
  @View("/resultadoexamen")
  public HttpResponse index() {
    List<ResultadoExamenEntity> allResultadoExamen = this.resultadoExamenService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allResultadoExamen
    ));
  }

  @Get("/create")
  @View("/resultadoexamen_create")
  public HttpResponse createView() {
    ResultadoExamenForm ResultadoExamen = new ResultadoExamenForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ResultadoExamen
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ResultadoExamenEntity> create(@Body final ResultadoExamenForm creating) {
    boolean created = this.resultadoExamenService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ResultadoExamenEntity> update(@Body final ResultadoExamenForm updating) {
    boolean updated = this.resultadoExamenService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<ResultadoExamenEntity> get(final long id) {
    ResultadoExamenEntity entry = this.resultadoExamenService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/resultadoexamen_details")
  public HttpResponse detailsView(long id) {
    ResultadoExamenEntity ResultadoExamen = this.resultadoExamenService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ResultadoExamen
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    ResultadoExamenEntity ResultadoExamen = this.resultadoExamenService.get(id);
    this.resultadoExamenService.delete(ResultadoExamen);
    return HttpResponse.ok();
  }
}
