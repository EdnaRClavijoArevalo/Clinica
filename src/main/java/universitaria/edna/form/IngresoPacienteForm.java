package universitaria.edna.form;


import universitaria.edna.domain.IngresoPacienteEntity;

public class IngresoPacienteForm {


    private long id;

    private long idHistoriaClinica;

    private long idDoctorTratante;

    private java.sql.Timestamp fechaIngreso;

    private java.sql.Timestamp fechaSalida;
    public IngresoPacienteEntity entity() {
        IngresoPacienteEntity entity = new IngresoPacienteEntity();
        entity.setId(id);
        entity.setIdHistoriaClinica(idHistoriaClinica);
        entity.setIdDoctorTratante(idDoctorTratante);
        entity.setFechaIngreso(fechaIngreso);
        entity.setFechaSalida(fechaSalida);
        return entity;
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdHistoriaClinica() {
    return this.idHistoriaClinica;
  }

  public void setIdHistoriaClinica(long idHistoriaClinica) {
    this.idHistoriaClinica = idHistoriaClinica;
  }

  public long getIdDoctorTratante() {
    return this.idDoctorTratante;
  }

  public void setIdDoctorTratante(long idDoctorTratante) {
    this.idDoctorTratante = idDoctorTratante;
  }

  public java.sql.Timestamp getFechaIngreso() {
    return this.fechaIngreso;
  }

  public void setFechaIngreso(java.sql.Timestamp fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  public java.sql.Timestamp getFechaSalida() {
    return this.fechaSalida;
  }

  public void setFechaSalida(java.sql.Timestamp fechaSalida) {
    this.fechaSalida = fechaSalida;
  }
}
