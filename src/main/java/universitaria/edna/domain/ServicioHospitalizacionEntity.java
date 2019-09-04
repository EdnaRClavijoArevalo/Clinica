package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="servicio_hospitalizacion")
public class ServicioHospitalizacionEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_habitacion")
  private long idHabitacion;

  @Column(name="dias_hospitalizacion")
  private long diasHospitalizacion;

  @Column(name="id_paciente")
  private long idPaciente;

  @Column(name="id_medico_tratante")
  private long idMedicoTratante;

  @Column(name="valor_restaurante")
  private double valorRestaurante;

  @Column(name="valor_habitacion")
  private double valorHabitacion;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdHabitacion() {
    return this.idHabitacion;
  }

  public void setIdHabitacion(long idHabitacion) {
    this.idHabitacion = idHabitacion;
  }

  public long getDiasHospitalizacion() {
    return this.diasHospitalizacion;
  }

  public void setDiasHospitalizacion(long diasHospitalizacion) {
    this.diasHospitalizacion = diasHospitalizacion;
  }

  public long getIdPaciente() {
    return this.idPaciente;
  }

  public void setIdPaciente(long idPaciente) {
    this.idPaciente = idPaciente;
  }

  public long getIdMedicoTratante() {
    return this.idMedicoTratante;
  }

  public void setIdMedicoTratante(long idMedicoTratante) {
    this.idMedicoTratante = idMedicoTratante;
  }

  public double getValorRestaurante() {
    return this.valorRestaurante;
  }

  public void setValorRestaurante(double valorRestaurante) {
    this.valorRestaurante = valorRestaurante;
  }

  public double getValorHabitacion() {
    return this.valorHabitacion;
  }

  public void setValorHabitacion(double valorHabitacion) {
    this.valorHabitacion = valorHabitacion;
  }
}
