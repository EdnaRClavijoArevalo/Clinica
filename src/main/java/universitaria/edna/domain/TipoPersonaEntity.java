package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tipo_persona")
public class TipoPersonaEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

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
