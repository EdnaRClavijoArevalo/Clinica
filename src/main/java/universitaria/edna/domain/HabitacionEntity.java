package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="habitacion")
public class HabitacionEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_edificio")
  private long idEdificio;

  @Column(name="piso")
  private long piso;

  @Column(name="numero")
  private long numero;

  @Column(name="ancho")
  private double ancho;

  @Column(name="largo")
  private double largo;

  @Column(name="ventanas")
  private long ventanas;

  @Column(name="tipo")
  private long tipo;

  @Column(name="valor_metro_cuadrado")
  private double valorMetroCuadrado;

  @Column(name="tipo_propiedad")
  private long tipoPropiedad;

  @Column(name="id_propietario")
  private long idPropietario;

  @Column(name="id_arrendatario")
  private long idArrendatario;

  @Column(name="valor_administracion")
  private double valorAdministracion;

  @Column(name="ultima_fecha_remodelacion")
  private java.sql.Timestamp ultimaFechaRemodelacion;


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
