package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="servicio_prestado")
public class ServicioPrestadoEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_servicio")
  private long idServicio;

  @Column(name="id_paciente")
  private long idPaciente;

  @Column(name="id_doctor")
  private long idDoctor;

  @Column(name="id_entidad_salud")
  private long idEntidadSalud;

  @Column(name="id_tipo_seguro")
  private long idTipoSeguro;


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
