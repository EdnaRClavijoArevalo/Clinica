package universitaria.edna.presenter;


import universitaria.edna.domain.ExamenRealizadoEntity;

public class ExamenRealizadoPresenter {


    private long id;

    private long idServicioPrestado;

    private String nombre;

    private String descripcion;

    private double costo;

    private long idDoctorEncargado;

    public ExamenRealizadoPresenter(ExamenRealizadoEntity entity) {
        this.id = entity.getId();
        this.idServicioPrestado = entity.getIdServicioPrestado();
        this.nombre = entity.getNombre();
        this.descripcion = entity.getDescripcion();
        this.costo = entity.getCosto();
        this.idDoctorEncargado = entity.getIdDoctorEncargado();
    }


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
