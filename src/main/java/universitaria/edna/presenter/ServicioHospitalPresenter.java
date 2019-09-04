package universitaria.edna.presenter;


import universitaria.edna.domain.ServicioHospitalEntity;

public class ServicioHospitalPresenter {


    private long id;

    private String nombre;

    private String descripcion;

    public ServicioHospitalPresenter(ServicioHospitalEntity entity) {
        this.id = entity.getId();
        this.nombre = entity.getNombre();
        this.descripcion = entity.getDescripcion();
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
