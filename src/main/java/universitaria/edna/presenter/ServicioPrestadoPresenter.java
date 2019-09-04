package universitaria.edna.presenter;


import universitaria.edna.domain.ServicioPrestadoEntity;

public class ServicioPrestadoPresenter {


    private long id;

    private long idServicio;

    private long idPaciente;

    private long idDoctor;

    private long idEntidadSalud;

    private long idTipoSeguro;

    public ServicioPrestadoPresenter(ServicioPrestadoEntity entity) {
        this.id = entity.getId();
        this.idServicio = entity.getIdServicio();
        this.idPaciente = entity.getIdPaciente();
        this.idDoctor = entity.getIdDoctor();
        this.idEntidadSalud = entity.getIdEntidadSalud();
        this.idTipoSeguro = entity.getIdTipoSeguro();
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdServicio() {
    return this.idServicio;
  }

  public void setIdServicio(long idServicio) {
    this.idServicio = idServicio;
  }

  public long getIdPaciente() {
    return this.idPaciente;
  }

  public void setIdPaciente(long idPaciente) {
    this.idPaciente = idPaciente;
  }

  public long getIdDoctor() {
    return this.idDoctor;
  }

  public void setIdDoctor(long idDoctor) {
    this.idDoctor = idDoctor;
  }

  public long getIdEntidadSalud() {
    return this.idEntidadSalud;
  }

  public void setIdEntidadSalud(long idEntidadSalud) {
    this.idEntidadSalud = idEntidadSalud;
  }

  public long getIdTipoSeguro() {
    return this.idTipoSeguro;
  }

  public void setIdTipoSeguro(long idTipoSeguro) {
    this.idTipoSeguro = idTipoSeguro;
  }
}
