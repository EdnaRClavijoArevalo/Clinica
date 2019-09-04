package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="medicamento_suministrado")
public class MedicamentoSuministradoEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_examen_realizado")
  private long idExamenRealizado;

  @Column(name="id_medicamento")
  private long idMedicamento;

  @Column(name="dosis")
  private String dosis;

  @Column(name="fecha_medicacion")
  private java.sql.Timestamp fechaMedicacion;

  @Column(name="cantidad")
  private long cantidad;


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

  public long getIdMedicamento() {
    return this.idMedicamento;
  }

  public void setIdMedicamento(long idMedicamento) {
    this.idMedicamento = idMedicamento;
  }

  public String getDosis() {
    return this.dosis;
  }

  public void setDosis(String dosis) {
    this.dosis = dosis;
  }

  public java.sql.Timestamp getFechaMedicacion() {
    return this.fechaMedicacion;
  }

  public void setFechaMedicacion(java.sql.Timestamp fechaMedicacion) {
    this.fechaMedicacion = fechaMedicacion;
  }

  public long getCantidad() {
    return this.cantidad;
  }

  public void setCantidad(long cantidad) {
    this.cantidad = cantidad;
  }
}
