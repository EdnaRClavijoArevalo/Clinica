package universitaria.edna.form;


import universitaria.edna.domain.MedicamentoSuministradoEntity;

public class MedicamentoSuministradoForm {


    private long id;

    private long idExamenRealizado;

    private long idMedicamento;

    private String dosis;

    private java.sql.Timestamp fechaMedicacion;

    private long cantidad;
    public MedicamentoSuministradoEntity entity() {
        MedicamentoSuministradoEntity entity = new MedicamentoSuministradoEntity();
        entity.setId(id);
        entity.setIdExamenRealizado(idExamenRealizado);
        entity.setIdMedicamento(idMedicamento);
        entity.setDosis(dosis);
        entity.setFechaMedicacion(fechaMedicacion);
        entity.setCantidad(cantidad);
        return entity;
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
