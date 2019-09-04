package universitaria.edna.presenter;


import universitaria.edna.domain.TipoPropiedadEntity;

public class TipoPropiedadPresenter {


    private long id;

    private String descripcion;

    private String nombre;

    public TipoPropiedadPresenter(TipoPropiedadEntity entity) {
        this.id = entity.getId();
        this.descripcion = entity.getDescripcion();
        this.nombre = entity.getNombre();
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
