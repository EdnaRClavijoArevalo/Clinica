package universitaria.edna.form;


import universitaria.edna.domain.TipoSeguroSaludEntity;

public class TipoSeguroSaludForm {


    private long id;

    private String nombre;
    public TipoSeguroSaludEntity entity() {
        TipoSeguroSaludEntity entity = new TipoSeguroSaludEntity();
        entity.setId(id);
        entity.setNombre(nombre);
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
}
