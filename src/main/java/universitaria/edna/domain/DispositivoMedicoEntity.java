package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="dispositivo_medico")
public class DispositivoMedicoEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="nombre")
  private String nombre;


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
}
