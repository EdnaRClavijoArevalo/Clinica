package universitaria.edna.presenter;


import universitaria.edna.domain.VisitaMedicoEntity;

public class VisitaMedicoPresenter {


    private long id;

    private long idServicioHospitalizacion;

    private long idDoctor;

    private String comentarios;

    public VisitaMedicoPresenter(VisitaMedicoEntity entity) {
        this.id = entity.getId();
        this.idServicioHospitalizacion = entity.getIdServicioHospitalizacion();
        this.idDoctor = entity.getIdDoctor();
        this.comentarios = entity.getComentarios();
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdServicioHospitalizacion() {
    return this.idServicioHospitalizacion;
  }

  public void setIdServicioHospitalizacion(long idServicioHospitalizacion) {
    this.idServicioHospitalizacion = idServicioHospitalizacion;
  }

  public long getIdDoctor() {
    return this.idDoctor;
  }

  public void setIdDoctor(long idDoctor) {
    this.idDoctor = idDoctor;
  }

  public String getComentarios() {
    return this.comentarios;
  }

  public void setComentarios(String comentarios) {
    this.comentarios = comentarios;
  }
}
