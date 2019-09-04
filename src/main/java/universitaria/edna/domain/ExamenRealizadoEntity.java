package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="examen_realizado")
public class ExamenRealizadoEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_servicio_prestado")
  private long idServicioPrestado;

  @Column(name="nombre")
  private String nombre;

  @Column(name="descripcion")
  private String descripcion;

  @Column(name="costo")
  private double costo;

  @Column(name="id_doctor_encargado")
  private long idDoctorEncargado;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdServicioPrestado() {
    return this.idServicioPrestado;
  }

  public void setIdServicioPrestado(long idServicioPrestado) {
    this.idServicioPrestado = idServicioPrestado;
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

  public double getCosto() {
    return this.costo;
  }

  public void setCosto(double costo) {
    this.costo = costo;
  }

  public long getIdDoctorEncargado() {
    return this.idDoctorEncargado;
  }

  public void setIdDoctorEncargado(long idDoctorEncargado) {
    this.idDoctorEncargado = idDoctorEncargado;
  }
}
