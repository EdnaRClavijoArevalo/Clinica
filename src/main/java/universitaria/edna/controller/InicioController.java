package universitaria.edna.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import universitaria.edna.presenter.ControllerListPresenter;

import java.util.ArrayList;
import java.util.List;

@Controller("/")
public class InicioController {
    @Get()
    @View("/inicio")
    public HttpResponse index() {
        List<ControllerListPresenter> controllers = new ArrayList<>();
        controllers.add(new ControllerListPresenter("Caracteristica Persona", "/caracteristicapersona"));
        controllers.add(new ControllerListPresenter("Costo Suministro Hospitalizacion", "/costosuministrohospitalizacion "));
        controllers.add(new ControllerListPresenter("Dispositivo Medico", "/dispositivomedico "));
        controllers.add(new ControllerListPresenter("Dotacion Habitacion", "/dotacionhabitacion "));
        controllers.add(new ControllerListPresenter("Edificio", "/edificio "));
        controllers.add(new ControllerListPresenter("Entidad Salud", "/entidadsalud "));
        controllers.add(new ControllerListPresenter("Examen Realizado", "/examenrealizado "));
        controllers.add(new ControllerListPresenter("Habitacion", "/habitacion "));
        controllers.add(new ControllerListPresenter("Historia Clinica", "/historiaclinica "));
        controllers.add(new ControllerListPresenter("Ingreso Paciente", "/ingresopaciente "));
        controllers.add(new ControllerListPresenter("Maquinaria Examen", "/maquinariaexamen "));
        controllers.add(new ControllerListPresenter("Medicamento", "/medicamento "));
        controllers.add(new ControllerListPresenter("Medicamento Suministrado", "/medicamentosuministrado "));
        controllers.add(new ControllerListPresenter("Persona", "/persona "));
        controllers.add(new ControllerListPresenter("Resultado Examen", "/resultadoexamen "));
        controllers.add(new ControllerListPresenter("Servicio Hospital", "/serviciohospital "));
        controllers.add(new ControllerListPresenter("Servicio Hospitaclizacion", "/serviciohospitalizacion "));
        controllers.add(new ControllerListPresenter("Servicio Prestado", "/servicioprestado "));
        controllers.add(new ControllerListPresenter("Tipo Persona", "/tipopersona "));
        controllers.add(new ControllerListPresenter("Tipo Propiedad", "/tipopropiedad "));
        controllers.add(new ControllerListPresenter("Tipo Seguro", "/tiposeguro "));
        controllers.add(new ControllerListPresenter("Visita Medico", "/visitamedico "));
        return HttpResponse.ok(CollectionUtils.mapOf(
                "controllers", controllers
        ));
    }
}
