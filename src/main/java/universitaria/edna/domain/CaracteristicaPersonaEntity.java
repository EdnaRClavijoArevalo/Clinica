package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="caracteristica_persona")
public class CaracteristicaPersonaEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_persona")
  private long idPersona;

  @Column(name="nombre")
  private String nombre;

  @Column(name="descripcion")
  private String descripcion;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdPersona() {
    return this.idPersona;
  }

  public void setIdPersona(long idPersona) {
    this.idPersona = idPersona;
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
}
