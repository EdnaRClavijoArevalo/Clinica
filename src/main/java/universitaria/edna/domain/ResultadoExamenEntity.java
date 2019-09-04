package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="resultado_examen")
public class ResultadoExamenEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="nombre")
  private String nombre;

  @Column(name="descripcion")
  private String descripcion;

  @Column(name="id_examen_realizado")
  private long idExamenRealizado;


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

  public long getIdExamenRealizado() {
    return this.idExamenRealizado;
  }

  public void setIdExamenRealizado(long idExamenRealizado) {
    this.idExamenRealizado = idExamenRealizado;
  }
}
