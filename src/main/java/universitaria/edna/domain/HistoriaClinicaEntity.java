package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="historia_clinica")
public class HistoriaClinicaEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_paciente")
  private long idPaciente;

  @Column(name="fecha_creacion")
  private java.sql.Timestamp fechaCreacion;

  @Column(name="costo_tratamiento")
  private double costoTratamiento;

  @Column(name="id_familiar_contacto")
  private long idFamiliarContacto;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdPaciente() {
    return this.idPaciente;
  }

  public void setIdPaciente(long idPaciente) {
    this.idPaciente = idPaciente;
  }

  public java.sql.Timestamp getFechaCreacion() {
    return this.fechaCreacion;
  }

  public void setFechaCreacion(java.sql.Timestamp fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public double getCostoTratamiento() {
    return this.costoTratamiento;
  }

  public void setCostoTratamiento(double costoTratamiento) {
    this.costoTratamiento = costoTratamiento;
  }

  public long getIdFamiliarContacto() {
    return this.idFamiliarContacto;
  }

  public void setIdFamiliarContacto(long idFamiliarContacto) {
    this.idFamiliarContacto = idFamiliarContacto;
  }
}
