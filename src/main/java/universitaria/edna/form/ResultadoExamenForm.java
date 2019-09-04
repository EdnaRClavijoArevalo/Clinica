package universitaria.edna.form;


import universitaria.edna.domain.ResultadoExamenEntity;

public class ResultadoExamenForm {


    private long id;

    private String nombre;

    private String descripcion;

    private long idExamenRealizado;
    public ResultadoExamenEntity entity() {
        ResultadoExamenEntity entity = new ResultadoExamenEntity();
        entity.setId(id);
        entity.setNombre(nombre);
        entity.setDescripcion(descripcion);
        entity.setIdExamenRealizado(idExamenRealizado);
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

  public long getIdExamenRealizado() {
    return this.idExamenRealizado;
  }

  public void setIdExamenRealizado(long idExamenRealizado) {
    this.idExamenRealizado = idExamenRealizado;
  }
}
