package universitaria.edna.presenter;


import universitaria.edna.domain.ResultadoExamenEntity;

public class ResultadoExamenPresenter {


    private long id;

    private String nombre;

    private String descripcion;

    private long idExamenRealizado;

    public ResultadoExamenPresenter(ResultadoExamenEntity entity) {
        this.id = entity.getId();
        this.nombre = entity.getNombre();
        this.descripcion = entity.getDescripcion();
        this.idExamenRealizado = entity.getIdExamenRealizado();
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

  public long getIdExamenRealizado() {
    return this.idExamenRealizado;
  }

  public void setIdExamenRealizado(long idExamenRealizado) {
    this.idExamenRealizado = idExamenRealizado;
  }
}
