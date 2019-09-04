package universitaria.edna.form;


import universitaria.edna.domain.VisitaMedicoEntity;

public class VisitaMedicoForm {


    private long id;

    private long idServicioHospitalizacion;

    private long idDoctor;

    private String comentarios;
    public VisitaMedicoEntity entity() {
        VisitaMedicoEntity entity = new VisitaMedicoEntity();
        entity.setId(id);
        entity.setIdServicioHospitalizacion(idServicioHospitalizacion);
        entity.setIdDoctor(idDoctor);
        entity.setComentarios(comentarios);
        return entity;
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
