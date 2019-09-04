package universitaria.edna.form;


import universitaria.edna.domain.HistoriaClinicaEntity;

public class HistoriaClinicaForm {


    private long id;

    private long idPaciente;

    private java.sql.Timestamp fechaCreacion;

    private double costoTratamiento;

    private long idFamiliarContacto;
    public HistoriaClinicaEntity entity() {
        HistoriaClinicaEntity entity = new HistoriaClinicaEntity();
        entity.setId(id);
        entity.setIdPaciente(idPaciente);
        entity.setFechaCreacion(fechaCreacion);
        entity.setCostoTratamiento(costoTratamiento);
        entity.setIdFamiliarContacto(idFamiliarContacto);
        return entity;
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdPaciente() {
    return this.idPaciente;
  }

  public void setIdPaciente(long idPaciente) {
    this.idPaciente = idPaciente;
  }

  public java.sql.Timestamp getFechaCreacion() {
    return this.fechaCreacion;
  }

  public void setFechaCreacion(java.sql.Timestamp fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public double getCostoTratamiento() {
    return this.costoTratamiento;
  }

  public void setCostoTratamiento(double costoTratamiento) {
    this.costoTratamiento = costoTratamiento;
  }

  public long getIdFamiliarContacto() {
    return this.idFamiliarContacto;
  }

  public void setIdFamiliarContacto(long idFamiliarContacto) {
    this.idFamiliarContacto = idFamiliarContacto;
  }
}
