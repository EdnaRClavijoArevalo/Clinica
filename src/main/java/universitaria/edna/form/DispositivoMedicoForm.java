package universitaria.edna.form;


import universitaria.edna.domain.DispositivoMedicoEntity;

public class DispositivoMedicoForm {


    private long id;

    private String nombre;
    public DispositivoMedicoEntity entity() {
        DispositivoMedicoEntity entity = new DispositivoMedicoEntity();
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
