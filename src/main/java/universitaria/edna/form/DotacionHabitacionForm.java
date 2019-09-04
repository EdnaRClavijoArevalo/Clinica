package universitaria.edna.form;


import universitaria.edna.domain.DotacionHabitacionEntity;

public class DotacionHabitacionForm {


    private long id;

    private long idHabitacion;

    private String descripcion;

    private String nombre;
    public DotacionHabitacionEntity entity() {
        DotacionHabitacionEntity entity = new DotacionHabitacionEntity();
        entity.setId(id);
        entity.setIdHabitacion(idHabitacion);
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

  public long getIdHabitacion() {
    return this.idHabitacion;
  }

  public void setIdHabitacion(long idHabitacion) {
    this.idHabitacion = idHabitacion;
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
