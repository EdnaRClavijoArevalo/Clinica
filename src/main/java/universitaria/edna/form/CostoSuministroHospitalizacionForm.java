package universitaria.edna.form;


import universitaria.edna.domain.CostoSuministroHospitalizacionEntity;

public class CostoSuministroHospitalizacionForm {


    private long id;

    private long idServicioHospitalizacion;

    private String nombre;

    private double costo;
    public CostoSuministroHospitalizacionEntity entity() {
        CostoSuministroHospitalizacionEntity entity = new CostoSuministroHospitalizacionEntity();
        entity.setId(id);
        entity.setIdServicioHospitalizacion(idServicioHospitalizacion);
        entity.setNombre(nombre);
        entity.setCosto(costo);
        return entity;
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
