package universitaria.edna.form;


import universitaria.edna.domain.TipoPropiedadEntity;

public class TipoPropiedadForm {


    private long id;

    private String descripcion;

    private String nombre;
    public TipoPropiedadEntity entity() {
        TipoPropiedadEntity entity = new TipoPropiedadEntity();
        entity.setId(id);
        entity.setDescripcion(descripcion);
        entity.setNombre(nombre);
        return entity;
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
