package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;
import universitaria.edna.domain.MedicamentoEntity;
import universitaria.edna.form.MedicamentoForm;
import universitaria.edna.repository.IMedicamentoRepository;
import universitaria.edna.repository.SqlMedicamentoService;

import java.util.List;
import javax.inject.Inject;

@Controller("/medicamento")
public class MedicamentoController {

  private IMedicamentoRepository medicamentoService;

  @Inject
  public MedicamentoController(SqlMedicamentoService service) {
    this.medicamentoService = service;
  }

  @Get("/api/all")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<List<MedicamentoEntity>> findAll() {
    List<MedicamentoEntity> allMedicamento = this.medicamentoService.fetch();
    return HttpResponse.ok(allMedicamento);
  }

  @Get()
  @View("/medicamento")
  public HttpResponse index() {
    List<MedicamentoEntity> allMedicamento = this.medicamentoService.fetch();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entities", allMedicamento
    ));
  }

  @Get("/create")
  @View("/medicamento_create")
  public HttpResponse createView() {
    MedicamentoForm Medicamento = new MedicamentoForm();
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", Medicamento
    ));
  }

  @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<MedicamentoEntity> create(@Body final MedicamentoForm creating) {
    boolean created = this.medicamentoService.save(creating.entity());
    if (!created) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Put(value = "/update", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<MedicamentoEntity> update(@Body final MedicamentoForm updating) {
    boolean updated = this.medicamentoService.update(updating.entity());
    if (!updated) return HttpResponse.badRequest();
    return HttpResponse.ok();
  }

  @Get(value = "/api/details/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<MedicamentoEntity> get(final long id) {
    MedicamentoEntity entry = this.medicamentoService.get(id);
    return HttpResponse.ok(entry);
  }

  @Get("/details/{id}")
  @View("/medicamento_details")
  public HttpResponse detailsView(long id) {
    MedicamentoEntity Medicamento = this.medicamentoService.get(id);
    return HttpResponse.ok(CollectionUtils.mapOf(
        "entity", Medicamento
    ));
  }

  @Delete(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse delete(final long id) {
    MedicamentoEntity Medicamento = this.medicamentoService.get(id);
    this.medicamentoService.delete(Medicamento);
    return HttpResponse.ok();
  }
}
