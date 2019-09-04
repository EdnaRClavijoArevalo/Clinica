package universitaria.edna.form;


import universitaria.edna.domain.HabitacionEntity;

public class HabitacionForm {


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
    public HabitacionEntity entity() {
        HabitacionEntity entity = new HabitacionEntity();
        entity.setId(id);
        entity.setIdEdificio(idEdificio);
        entity.setPiso(piso);
        entity.setNumero(numero);
        entity.setAncho(ancho);
        entity.setLargo(largo);
        entity.setVentanas(ventanas);
        entity.setTipo(tipo);
        entity.setValorMetroCuadrado(valorMetroCuadrado);
        entity.setTipoPropiedad(tipoPropiedad);
        entity.setIdPropietario(idPropietario);
        entity.setIdArrendatario(idArrendatario);
        entity.setValorAdministracion(valorAdministracion);
        entity.setUltimaFechaRemodelacion(ultimaFechaRemodelacion);
        return entity;
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
