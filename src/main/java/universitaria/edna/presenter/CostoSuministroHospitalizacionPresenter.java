package universitaria.edna.presenter;


import universitaria.edna.domain.CostoSuministroHospitalizacionEntity;

public class CostoSuministroHospitalizacionPresenter {


    private long id;

    private long idServicioHospitalizacion;

    private String nombre;

    private double costo;

    public CostoSuministroHospitalizacionPresenter(CostoSuministroHospitalizacionEntity entity) {
        this.id = entity.getId();
        this.idServicioHospitalizacion = entity.getIdServicioHospitalizacion();
        this.nombre = entity.getNombre();
        this.costo = entity.getCosto();
    }


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
