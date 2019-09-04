package universitaria.edna.form;


import universitaria.edna.domain.CaracteristicaPersonaEntity;

public class CaracteristicaPersonaForm {


    private long id;

    private long idPersona;

    private String nombre;

    private String descripcion;
    public CaracteristicaPersonaEntity entity() {
        CaracteristicaPersonaEntity entity = new CaracteristicaPersonaEntity();
        entity.setId(id);
        entity.setIdPersona(idPersona);
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

  public long getIdPersona() {
    return this.idPersona;
  }

  public void setIdPersona(long idPersona) {
    this.idPersona = idPersona;
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
