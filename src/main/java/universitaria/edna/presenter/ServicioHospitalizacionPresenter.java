package universitaria.edna.presenter;


import universitaria.edna.domain.ServicioHospitalizacionEntity;

public class ServicioHospitalizacionPresenter {


    private long id;

    private long idHabitacion;

    private long diasHospitalizacion;

    private long idPaciente;

    private long idMedicoTratante;

    private double valorRestaurante;

    private double valorHabitacion;

    public ServicioHospitalizacionPresenter(ServicioHospitalizacionEntity entity) {
        this.id = entity.getId();
        this.idHabitacion = entity.getIdHabitacion();
        this.diasHospitalizacion = entity.getDiasHospitalizacion();
        this.idPaciente = entity.getIdPaciente();
        this.idMedicoTratante = entity.getIdMedicoTratante();
        this.valorRestaurante = entity.getValorRestaurante();
        this.valorHabitacion = entity.getValorHabitacion();
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdHabitacion() {
    return this.idHabitacion;
  }

  public void setIdHabitacion(long idHabitacion) {
    this.idHabitacion = idHabitacion;
  }

  public long getDiasHospitalizacion() {
    return this.diasHospitalizacion;
  }

  public void setDiasHospitalizacion(long diasHospitalizacion) {
    this.diasHospitalizacion = diasHospitalizacion;
  }

  public long getIdPaciente() {
    return this.idPaciente;
  }

  public void setIdPaciente(long idPaciente) {
    this.idPaciente = idPaciente;
  }

  public long getIdMedicoTratante() {
    return this.idMedicoTratante;
  }

  public void setIdMedicoTratante(long idMedicoTratante) {
    this.idMedicoTratante = idMedicoTratante;
  }

  public double getValorRestaurante() {
    return this.valorRestaurante;
  }

  public void setValorRestaurante(double valorRestaurante) {
    this.valorRestaurante = valorRestaurante;
  }

  public double getValorHabitacion() {
    return this.valorHabitacion;
  }

  public void setValorHabitacion(double valorHabitacion) {
    this.valorHabitacion = valorHabitacion;
  }
}
