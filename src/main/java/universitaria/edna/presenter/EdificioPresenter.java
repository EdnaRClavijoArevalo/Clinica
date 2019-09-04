package universitaria.edna.presenter;


import universitaria.edna.domain.EdificioEntity;

public class EdificioPresenter {


    private long id;

    private long pisos;

    public EdificioPresenter(EdificioEntity entity) {
        this.id = entity.getId();
        this.pisos = entity.getPisos();
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
