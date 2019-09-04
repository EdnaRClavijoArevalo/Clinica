package universitaria.edna.form;


import universitaria.edna.domain.MedicamentoEntity;

public class MedicamentoForm {


    private long id;

    private String nombre;

    private String descripcion;

    private String composicion;

    private String referencia;

    private String posologia;

    private java.sql.Timestamp fechaVencimiento;
    public MedicamentoEntity entity() {
        MedicamentoEntity entity = new MedicamentoEntity();
        entity.setId(id);
        entity.setNombre(nombre);
        entity.setDescripcion(descripcion);
        entity.setComposicion(composicion);
        entity.setReferencia(referencia);
        entity.setPosologia(posologia);
        entity.setFechaVencimiento(fechaVencimiento);
        return entity;
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getComposicion() {
    return this.composicion;
  }

  public void setComposicion(String composicion) {
    this.composicion = composicion;
  }

  public String getReferencia() {
    return this.referencia;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  public String getPosologia() {
    return this.posologia;
  }

  public void setPosologia(String posologia) {
    this.posologia = posologia;
  }

  public java.sql.Timestamp getFechaVencimiento() {
    return this.fechaVencimiento;
  }

  public void setFechaVencimiento(java.sql.Timestamp fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }
}
