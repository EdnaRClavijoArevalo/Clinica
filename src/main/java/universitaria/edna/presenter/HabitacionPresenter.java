package universitaria.edna.presenter;


import universitaria.edna.domain.HabitacionEntity;

public class HabitacionPresenter {


    private long id;

    private long idEdificio;

    private long piso;

    private long numero;

    private double ancho;

    private double largo;

    private long ventanas;

    private long tipo;

    private double valorMetroCuadrado;

    private long tipoPropiedad;

    private long idPropietario;

    private long idArrendatario;

    private double valorAdministracion;

    private java.sql.Timestamp ultimaFechaRemodelacion;

    public HabitacionPresenter(HabitacionEntity entity) {
        this.id = entity.getId();
        this.idEdificio = entity.getIdEdificio();
        this.piso = entity.getPiso();
        this.numero = entity.getNumero();
        this.ancho = entity.getAncho();
        this.largo = entity.getLargo();
        this.ventanas = entity.getVentanas();
        this.tipo = entity.getTipo();
        this.valorMetroCuadrado = entity.getValorMetroCuadrado();
        this.tipoPropiedad = entity.getTipoPropiedad();
        this.idPropietario = entity.getIdPropietario();
        this.idArrendatario = entity.getIdArrendatario();
        this.valorAdministracion = entity.getValorAdministracion();
        this.ultimaFechaRemodelacion = entity.getUltimaFechaRemodelacion();
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdEdificio() {
    return this.idEdificio;
  }

  public void setIdEdificio(long idEdificio) {
    this.idEdificio = idEdificio;
  }

  public long getPiso() {
    return this.piso;
  }

  public void setPiso(long piso) {
    this.piso = piso;
  }

  public long getNumero() {
    return this.numero;
  }

  public void setNumero(long numero) {
    this.numero = numero;
  }

  public double getAncho() {
    return this.ancho;
  }

  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public double getLargo() {
    return this.largo;
  }

  public void setLargo(double largo) {
    this.largo = largo;
  }

  public long getVentanas() {
    return this.ventanas;
  }

  public void setVentanas(long ventanas) {
    this.ventanas = ventanas;
  }

  public long getTipo() {
    return this.tipo;
  }

  public void setTipo(long tipo) {
    this.tipo = tipo;
  }

  public double getValorMetroCuadrado() {
    return this.valorMetroCuadrado;
  }

  public void setValorMetroCuadrado(double valorMetroCuadrado) {
    this.valorMetroCuadrado = valorMetroCuadrado;
  }

  public long getTipoPropiedad() {
    return this.tipoPropiedad;
  }

  public void setTipoPropiedad(long tipoPropiedad) {
    this.tipoPropiedad = tipoPropiedad;
  }

  public long getIdPropietario() {
    return this.idPropietario;
  }

  public void setIdPropietario(long idPropietario) {
    this.idPropietario = idPropietario;
  }

  public long getIdArrendatario() {
    return this.idArrendatario;
  }

  public void setIdArrendatario(long idArrendatario) {
    this.idArrendatario = idArrendatario;
  }

  public double getValorAdministracion() {
    return this.valorAdministracion;
  }

  public void setValorAdministracion(double valorAdministracion) {
    this.valorAdministracion = valorAdministracion;
  }

  public java.sql.Timestamp getUltimaFechaRemodelacion() {
    return this.ultimaFechaRemodelacion;
  }

  public void setUltimaFechaRemodelacion(java.sql.Timestamp ultimaFechaRemodelacion) {
    this.ultimaFechaRemodelacion = ultimaFechaRemodelacion;
  }
}
