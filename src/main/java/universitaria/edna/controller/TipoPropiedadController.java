package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.TipoPropiedadEntity;
import universitaria.edna.form.TipoPropiedadForm;
import universitaria.edna.repository.ITipoPropiedadRepository;
import universitaria.edna.repository.SqlTipoPropiedadService;

import java.util.List;
import javax.inject.Inject;

@Controller("/tipopropiedad")
public class TipoPropiedadController {

  private ITipoPropiedadRepository tipoPropiedadService;

  @Inject
  public TipoPropiedadController(SqlTipoPropiedadService service) {
    this.tipoPropiedadService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<TipoPropiedadEntity>> findAll() {
    List<TipoPropiedadEntity> allTipoPropiedad = this.tipoPropiedadService.fetch();
    return HttpResponse.ok(allTipoPropiedad);
  }

  @Get()
  @View("/tipopropiedad")
  public HttpResponse index() {
    List<TipoPropiedadEntity> allTipoPropiedad = this.tipoPropiedadService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allTipoPropiedad
    ));
  }

  @Get("/create")
  @View("/tipopropiedad_create")
  public HttpResponse createView() {
    TipoPropiedadForm TipoPropiedad = new TipoPropiedadForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", TipoPropiedad
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<TipoPropiedadEntity> create(@Body final TipoPropiedadForm creating) {
    boolean created = this.tipoPropiedadService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<TipoPropiedadEntity> update(@Body final TipoPropiedadForm updating) {
    boolean updated = this.tipoPropiedadService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<TipoPropiedadEntity> get(final long id) {
    TipoPropiedadEntity entry = this.tipoPropiedadService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/tipopropiedad_details")
  public HttpResponse detailsView(long id) {
    TipoPropiedadEntity TipoPropiedad = this.tipoPropiedadService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", TipoPropiedad
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    TipoPropiedadEntity TipoPropiedad = this.tipoPropiedadService.get(id);
    this.tipoPropiedadService.delete(TipoPropiedad);
    return HttpResponse.ok();
  }
}
