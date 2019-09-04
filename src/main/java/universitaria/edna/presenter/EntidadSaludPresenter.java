package universitaria.edna.presenter;


import universitaria.edna.domain.EntidadSaludEntity;

public class EntidadSaludPresenter {


    private long id;

    private String nombre;

    public EntidadSaludPresenter(EntidadSaludEntity entity) {
        this.id = entity.getId();
        this.nombre = entity.getNombre();
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
}
