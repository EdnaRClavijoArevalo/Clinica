package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="costo_suministro_hospitalizacion")
public class CostoSuministroHospitalizacionEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_servicio_hospitalizacion")
  private long idServicioHospitalizacion;

  @Column(name="nombre")
  private String nombre;

  @Column(name="costo")
  private double costo;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdServicioHospitalizacion() {
    return this.idServicioHospitalizacion;
  }

  public void setIdServicioHospitalizacion(long idServicioHospitalizacion) {
    this.idServicioHospitalizacion = idServicioHospitalizacion;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getCosto() {
    return this.costo;
  }

  public void setCosto(double costo) {
    this.costo = costo;
  }
}
