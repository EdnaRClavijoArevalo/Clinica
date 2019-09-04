package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="persona")
public class PersonaEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="dni")
  private String dni;

  @Column(name="nombre")
  private String nombre;

  @Column(name="apellido")
  private String apellido;

  @Column(name="telefono")
  private String telefono;

  @Column(name="email")
  private String email;

  @Column(name="direccion")
  private String direccion;

  @Column(name="id_tipo_persona")
  private long idTipoPersona;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDni() {
    return this.dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getTelefono() {
    return this.telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public long getIdTipoPersona() {
    return this.idTipoPersona;
  }

  public void setIdTipoPersona(long idTipoPersona) {
    this.idTipoPersona = idTipoPersona;
  }
}
