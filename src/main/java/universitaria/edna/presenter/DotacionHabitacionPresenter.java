package universitaria.edna.presenter;


import universitaria.edna.domain.DotacionHabitacionEntity;

public class DotacionHabitacionPresenter {


    private long id;

    private long idHabitacion;

    private String descripcion;

    private String nombre;

    public DotacionHabitacionPresenter(DotacionHabitacionEntity entity) {
        this.id = entity.getId();
        this.idHabitacion = entity.getIdHabitacion();
        this.descripcion = entity.getDescripcion();
        this.nombre = entity.getNombre();
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
