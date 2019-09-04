package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.DispositivoMedicoEntity;
import universitaria.edna.form.DispositivoMedicoForm;
import universitaria.edna.repository.IDispositivoMedicoRepository;
import universitaria.edna.repository.SqlDispositivoMedicoService;

import java.util.List;
import javax.inject.Inject;

@Controller("/dispositivomedico")
public class DispositivoMedicoController {

  private IDispositivoMedicoRepository dispositivoMedicoService;

  @Inject
  public DispositivoMedicoController(SqlDispositivoMedicoService service) {
    this.dispositivoMedicoService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<DispositivoMedicoEntity>> findAll() {
    List<DispositivoMedicoEntity> allDispositivoMedico = this.dispositivoMedicoService.fetch();
    return HttpResponse.ok(allDispositivoMedico);
  }

  @Get()
  @View("/dispositivomedico")
  public HttpResponse index() {
    List<DispositivoMedicoEntity> allDispositivoMedico = this.dispositivoMedicoService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allDispositivoMedico
    ));
  }

  @Get("/create")
  @View("/dispositivomedico_create")
  public HttpResponse createView() {
    DispositivoMedicoForm DispositivoMedico = new DispositivoMedicoForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", DispositivoMedico
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<DispositivoMedicoEntity> create(@Body final DispositivoMedicoForm creating) {
    boolean created = this.dispositivoMedicoService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<DispositivoMedicoEntity> update(@Body final DispositivoMedicoForm updating) {
    boolean updated = this.dispositivoMedicoService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<DispositivoMedicoEntity> get(final long id) {
    DispositivoMedicoEntity entry = this.dispositivoMedicoService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/dispositivomedico_details")
  public HttpResponse detailsView(long id) {
    DispositivoMedicoEntity DispositivoMedico = this.dispositivoMedicoService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", DispositivoMedico
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    DispositivoMedicoEntity DispositivoMedico = this.dispositivoMedicoService.get(id);
    this.dispositivoMedicoService.delete(DispositivoMedico);
    return HttpResponse.ok();
  }
}
