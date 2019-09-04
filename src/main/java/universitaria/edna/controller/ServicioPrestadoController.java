package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.ServicioPrestadoEntity;
import universitaria.edna.form.ServicioPrestadoForm;
import universitaria.edna.repository.IServicioPrestadoRepository;
import universitaria.edna.repository.SqlServicioPrestadoService;

import java.util.List;
import javax.inject.Inject;

@Controller("/servicioprestado")
public class ServicioPrestadoController {

  private IServicioPrestadoRepository servicioPrestadoService;

  @Inject
  public ServicioPrestadoController(SqlServicioPrestadoService service) {
    this.servicioPrestadoService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<ServicioPrestadoEntity>> findAll() {
    List<ServicioPrestadoEntity> allServicioPrestado = this.servicioPrestadoService.fetch();
    return HttpResponse.ok(allServicioPrestado);
  }

  @Get()
  @View("/servicioprestado")
  public HttpResponse index() {
    List<ServicioPrestadoEntity> allServicioPrestado = this.servicioPrestadoService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allServicioPrestado
    ));
  }

  @Get("/create")
  @View("/servicioprestado_create")
  public HttpResponse createView() {
    ServicioPrestadoForm ServicioPrestado = new ServicioPrestadoForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ServicioPrestado
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ServicioPrestadoEntity> create(@Body final ServicioPrestadoForm creating) {
    boolean created = this.servicioPrestadoService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<ServicioPrestadoEntity> update(@Body final ServicioPrestadoForm updating) {
    boolean updated = this.servicioPrestadoService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<ServicioPrestadoEntity> get(final long id) {
    ServicioPrestadoEntity entry = this.servicioPrestadoService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/servicioprestado_details")
  public HttpResponse detailsView(long id) {
    ServicioPrestadoEntity ServicioPrestado = this.servicioPrestadoService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", ServicioPrestado
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    ServicioPrestadoEntity ServicioPrestado = this.servicioPrestadoService.get(id);
    this.servicioPrestadoService.delete(ServicioPrestado);
    return HttpResponse.ok();
  }
}
