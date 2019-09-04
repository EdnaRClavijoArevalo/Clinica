package universitaria.edna.form;


import universitaria.edna.domain.ServicioHospitalEntity;

public class ServicioHospitalForm {


    private long id;

    private String nombre;

    private String descripcion;
    public ServicioHospitalEntity entity() {
        ServicioHospitalEntity entity = new ServicioHospitalEntity();
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
