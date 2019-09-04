package universitaria.edna.form;


import universitaria.edna.domain.PersonaEntity;

public class PersonaForm {


    private long id;

    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    private String direccion;

    private long idTipoPersona;
    public PersonaEntity entity() {
        PersonaEntity entity = new PersonaEntity();
        entity.setId(id);
        entity.setDni(dni);
        entity.setNombre(nombre);
        entity.setApellido(apellido);
        entity.setTelefono(telefono);
        entity.setEmail(email);
        entity.setDireccion(direccion);
        entity.setIdTipoPersona(idTipoPersona);
        return entity;
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
