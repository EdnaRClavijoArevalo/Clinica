package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ingreso_paciente")
public class IngresoPacienteEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_historia_clinica")
  private long idHistoriaClinica;

  @Column(name="id_doctor_tratante")
  private long idDoctorTratante;

  @Column(name="fecha_ingreso")
  private java.sql.Timestamp fechaIngreso;

  @Column(name="fecha_salida")
  private java.sql.Timestamp fechaSalida;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdHistoriaClinica() {
    return this.idHistoriaClinica;
  }

  public void setIdHistoriaClinica(long idHistoriaClinica) {
    this.idHistoriaClinica = idHistoriaClinica;
  }

  public long getIdDoctorTratante() {
    return this.idDoctorTratante;
  }

  public void setIdDoctorTratante(long idDoctorTratante) {
    this.idDoctorTratante = idDoctorTratante;
  }

  public java.sql.Timestamp getFechaIngreso() {
    return this.fechaIngreso;
  }

  public void setFechaIngreso(java.sql.Timestamp fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  public java.sql.Timestamp getFechaSalida() {
    return this.fechaSalida;
  }

  public void setFechaSalida(java.sql.Timestamp fechaSalida) {
    this.fechaSalida = fechaSalida;
  }
}
