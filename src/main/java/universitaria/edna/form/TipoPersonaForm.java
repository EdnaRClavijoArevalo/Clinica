package universitaria.edna.form;


import universitaria.edna.domain.TipoPersonaEntity;

public class TipoPersonaForm {


    private long id;

    private String nombre;

    private String descripcion;
    public TipoPersonaEntity entity() {
        TipoPersonaEntity entity = new TipoPersonaEntity();
        entity.setId(id);
        entity.setNombre(nombre);
        entity.setDescripcion(descripcion);
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
}
