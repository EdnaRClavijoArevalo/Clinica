package universitaria.edna.presenter;


import universitaria.edna.domain.PersonaEntity;

public class PersonaPresenter {


    private long id;

    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    private String direccion;

    private long idTipoPersona;

    public PersonaPresenter(PersonaEntity entity) {
        this.id = entity.getId();
        this.dni = entity.getDni();
        this.nombre = entity.getNombre();
        this.apellido = entity.getApellido();
        this.telefono = entity.getTelefono();
        this.email = entity.getEmail();
        this.direccion = entity.getDireccion();
        this.idTipoPersona = entity.getIdTipoPersona();
    }


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
