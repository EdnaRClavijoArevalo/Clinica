package universitaria.edna.presenter;


import universitaria.edna.domain.MedicamentoSuministradoEntity;

public class MedicamentoSuministradoPresenter {


    private long id;

    private long idExamenRealizado;

    private long idMedicamento;

    private String dosis;

    private java.sql.Timestamp fechaMedicacion;

    private long cantidad;

    public MedicamentoSuministradoPresenter(MedicamentoSuministradoEntity entity) {
        this.id = entity.getId();
        this.idExamenRealizado = entity.getIdExamenRealizado();
        this.idMedicamento = entity.getIdMedicamento();
        this.dosis = entity.getDosis();
        this.fechaMedicacion = entity.getFechaMedicacion();
        this.cantidad = entity.getCantidad();
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdExamenRealizado() {
    return this.idExamenRealizado;
  }

  public void setIdExamenRealizado(long idExamenRealizado) {
    this.idExamenRealizado = idExamenRealizado;
  }

  public long getIdMedicamento() {
    return this.idMedicamento;
  }

  public void setIdMedicamento(long idMedicamento) {
    this.idMedicamento = idMedicamento;
  }

  public String getDosis() {
    return this.dosis;
  }

  public void setDosis(String dosis) {
    this.dosis = dosis;
  }

  public java.sql.Timestamp getFechaMedicacion() {
    return this.fechaMedicacion;
  }

  public void setFechaMedicacion(java.sql.Timestamp fechaMedicacion) {
    this.fechaMedicacion = fechaMedicacion;
  }

  public long getCantidad() {
    return this.cantidad;
  }

  public void setCantidad(long cantidad) {
    this.cantidad = cantidad;
  }
}
