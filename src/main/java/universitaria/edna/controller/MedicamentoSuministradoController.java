package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.MedicamentoSuministradoEntity;
import universitaria.edna.form.MedicamentoSuministradoForm;
import universitaria.edna.repository.IMedicamentoSuministradoRepository;
import universitaria.edna.repository.SqlMedicamentoSuministradoService;

import java.util.List;
import javax.inject.Inject;

@Controller("/medicamentosuministrado")
public class MedicamentoSuministradoController {

  private IMedicamentoSuministradoRepository medicamentoSuministradoService;

  @Inject
  public MedicamentoSuministradoController(SqlMedicamentoSuministradoService service) {
    this.medicamentoSuministradoService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<MedicamentoSuministradoEntity>> findAll() {
    List<MedicamentoSuministradoEntity> allMedicamentoSuministrado = this.medicamentoSuministradoService.fetch();
    return HttpResponse.ok(allMedicamentoSuministrado);
  }

  @Get()
  @View("/medicamentosuministrado")
  public HttpResponse index() {
    List<MedicamentoSuministradoEntity> allMedicamentoSuministrado = this.medicamentoSuministradoService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allMedicamentoSuministrado
    ));
  }

  @Get("/create")
  @View("/medicamentosuministrado_create")
  public HttpResponse createView() {
    MedicamentoSuministradoForm MedicamentoSuministrado = new MedicamentoSuministradoForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", MedicamentoSuministrado
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<MedicamentoSuministradoEntity> create(@Body final MedicamentoSuministradoForm creating) {
    boolean created = this.medicamentoSuministradoService.save(creating.entity());
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<MedicamentoSuministradoEntity> update(@Body final MedicamentoSuministradoForm updating) {
    boolean updated = this.medicamentoSuministradoService.update(updating.entity());
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<MedicamentoSuministradoEntity> get(final long id) {
    MedicamentoSuministradoEntity entry = this.medicamentoSuministradoService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/medicamentosuministrado_details")
  public HttpResponse detailsView(long id) {
    MedicamentoSuministradoEntity MedicamentoSuministrado = this.medicamentoSuministradoService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", MedicamentoSuministrado
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    MedicamentoSuministradoEntity MedicamentoSuministrado = this.medicamentoSuministradoService.get(id);
    this.medicamentoSuministradoService.delete(MedicamentoSuministrado);
    return HttpResponse.ok();
  }
}
