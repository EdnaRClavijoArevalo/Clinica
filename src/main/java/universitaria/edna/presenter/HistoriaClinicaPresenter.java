package universitaria.edna.presenter;


import universitaria.edna.domain.HistoriaClinicaEntity;

public class HistoriaClinicaPresenter {


    private long id;

    private long idPaciente;

    private java.sql.Timestamp fechaCreacion;

    private double costoTratamiento;

    private long idFamiliarContacto;

    public HistoriaClinicaPresenter(HistoriaClinicaEntity entity) {
        this.id = entity.getId();
        this.idPaciente = entity.getIdPaciente();
        this.fechaCreacion = entity.getFechaCreacion();
        this.costoTratamiento = entity.getCostoTratamiento();
        this.idFamiliarContacto = entity.getIdFamiliarContacto();
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
