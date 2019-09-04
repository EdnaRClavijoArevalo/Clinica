package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.TipoSeguroSaludEntity;
import universitaria.edna.form.TipoSeguroSaludForm;
import universitaria.edna.repository.ITipoSeguroSaludRepository;
import universitaria.edna.repository.SqlTipoSeguroSaludService;

import java.util.List;
import javax.inject.Inject;

@Controller("/tiposegurosalud")
public class TipoSeguroSaludController {

  private ITipoSeguroSaludRepository tipoSeguroSaludService;

  @Inject
  public TipoSeguroSaludController(SqlTipoSeguroSaludService service) {
    this.tipoSeguroSaludService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<TipoSeguroSaludEntity>> findAll() {
    List<TipoSeguroSaludEntity> allTipoSeguroSalud = this.tipoSeguroSaludService.fetch();
    return HttpResponse.ok(allTipoSeguroSalud);
  }

  @Get()
  @View("/tiposegurosalud")
  public HttpResponse index() {
    List<TipoSeguroSaludEntity> allTipoSeguroSalud = this.tipoSeguroSaludService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allTipoSeguroSalud
    ));
  }

  @Get("/create")
  @View("/tiposegurosalud_create")
  public HttpResponse createView() {
    TipoSeguroSaludForm TipoSeguroSalud = new TipoSeguroSaludForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", TipoSeguroSalud
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<TipoSeguroSaludEntity> create(@Body final TipoSeguroSaludForm creating) {
    boolean created = this.tipoSeguroSaludService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<TipoSeguroSaludEntity> update(@Body final TipoSeguroSaludForm updating) {
    boolean updated = this.tipoSeguroSaludService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<TipoSeguroSaludEntity> get(final long id) {
    TipoSeguroSaludEntity entry = this.tipoSeguroSaludService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/tiposegurosalud_details")
  public HttpResponse detailsView(long id) {
    TipoSeguroSaludEntity TipoSeguroSalud = this.tipoSeguroSaludService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", TipoSeguroSalud
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    TipoSeguroSaludEntity TipoSeguroSalud = this.tipoSeguroSaludService.get(id);
    this.tipoSeguroSaludService.delete(TipoSeguroSalud);
    return HttpResponse.ok();
  }
}
