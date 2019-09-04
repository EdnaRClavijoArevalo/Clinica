package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="medicamento")
public class MedicamentoEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="nombre")
  private String nombre;

  @Column(name="descripcion")
  private String descripcion;

  @Column(name="composicion")
  private String composicion;

  @Column(name="referencia")
  private String referencia;

  @Column(name="posologia")
  private String posologia;

  @Column(name="fecha_vencimiento")
  private java.sql.Timestamp fechaVencimiento;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getComposicion() {
    return this.composicion;
  }

  public void setComposicion(String composicion) {
    this.composicion = composicion;
  }

  public String getReferencia() {
    return this.referencia;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  public String getPosologia() {
    return this.posologia;
  }

  public void setPosologia(String posologia) {
    this.posologia = posologia;
  }

  public java.sql.Timestamp getFechaVencimiento() {
    return this.fechaVencimiento;
  }

  public void setFechaVencimiento(java.sql.Timestamp fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }
}
