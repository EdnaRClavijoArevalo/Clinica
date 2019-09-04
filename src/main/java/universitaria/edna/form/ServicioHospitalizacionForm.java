package universitaria.edna.form;


import universitaria.edna.domain.ServicioHospitalizacionEntity;

public class ServicioHospitalizacionForm {


    private long id;

    private long idHabitacion;

    private long diasHospitalizacion;

    private long idPaciente;

    private long idMedicoTratante;

    private double valorRestaurante;

    private double valorHabitacion;
    public ServicioHospitalizacionEntity entity() {
        ServicioHospitalizacionEntity entity = new ServicioHospitalizacionEntity();
        entity.setId(id);
        entity.setIdHabitacion(idHabitacion);
        entity.setDiasHospitalizacion(diasHospitalizacion);
        entity.setIdPaciente(idPaciente);
        entity.setIdMedicoTratante(idMedicoTratante);
        entity.setValorRestaurante(valorRestaurante);
        entity.setValorHabitacion(valorHabitacion);
        return entity;
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
