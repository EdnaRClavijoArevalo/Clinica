package universitaria.edna.form;


import universitaria.edna.domain.MaquinariaExamenEntity;

public class MaquinariaExamenForm {


    private long id;

    private long idExamenRealizado;

    private long idDispositivoMedico;
    public MaquinariaExamenEntity entity() {
        MaquinariaExamenEntity entity = new MaquinariaExamenEntity();
        entity.setId(id);
        entity.setIdExamenRealizado(idExamenRealizado);
        entity.setIdDispositivoMedico(idDispositivoMedico);
        return entity;
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
