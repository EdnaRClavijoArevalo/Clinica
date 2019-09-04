package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="visita_medico")
public class VisitaMedicoEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_servicio_hospitalizacion")
  private long idServicioHospitalizacion;

  @Column(name="id_doctor")
  private long idDoctor;

  @Column(name="comentarios")
  private String comentarios;


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
