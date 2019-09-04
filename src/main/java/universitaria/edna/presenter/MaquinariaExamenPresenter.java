package universitaria.edna.presenter;


import universitaria.edna.domain.MaquinariaExamenEntity;

public class MaquinariaExamenPresenter {


    private long id;

    private long idExamenRealizado;

    private long idDispositivoMedico;

    public MaquinariaExamenPresenter(MaquinariaExamenEntity entity) {
        this.id = entity.getId();
        this.idExamenRealizado = entity.getIdExamenRealizado();
        this.idDispositivoMedico = entity.getIdDispositivoMedico();
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdExamenRealizado() {
    return this.idExamenRealizado;
  }

  public void setIdExamenRealizado(long idExamenRealizado) {
    this.idExamenRealizado = idExamenRealizado;
  }

  public long getIdDispositivoMedico() {
    return this.idDispositivoMedico;
  }

  public void setIdDispositivoMedico(long idDispositivoMedico) {
    this.idDispositivoMedico = idDispositivoMedico;
  }
}
