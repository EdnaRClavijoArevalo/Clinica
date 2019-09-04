package universitaria.edna.presenter;


import universitaria.edna.domain.TipoPersonaEntity;

public class TipoPersonaPresenter {


    private long id;

    private String nombre;

    private String descripcion;

    public TipoPersonaPresenter(TipoPersonaEntity entity) {
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
