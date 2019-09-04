package universitaria.edna.form;


import universitaria.edna.domain.EdificioEntity;

public class EdificioForm {


    private long id;

    private long pisos;
    public EdificioEntity entity() {
        EdificioEntity entity = new EdificioEntity();
        entity.setId(id);
        entity.setPisos(pisos);
        return entity;
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPisos() {
    return this.pisos;
  }

  public void setPisos(long pisos) {
    this.pisos = pisos;
  }
}
