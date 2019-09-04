package universitaria.edna.presenter;


import universitaria.edna.domain.CaracteristicaPersonaEntity;

public class CaracteristicaPersonaPresenter {


    private long id;

    private long idPersona;

    private String nombre;

    private String descripcion;

    public CaracteristicaPersonaPresenter(CaracteristicaPersonaEntity entity) {
        this.id = entity.getId();
        this.idPersona = entity.getIdPersona();
        this.nombre = entity.getNombre();
        this.descripcion = entity.getDescripcion();
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
