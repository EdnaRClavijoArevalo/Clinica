package universitaria.edna.repository;

import universitaria.edna.domain.ServicioHospitalizacionEntity;

import java.util.List;

public interface IServicioHospitalizacionRepository {

    boolean save(ServicioHospitalizacionEntity ServicioHospitalizacionEntity);

    boolean update(ServicioHospitalizacionEntity ServicioHospitalizacionEntity);

    List<ServicioHospitalizacionEntity> fetch();

    ServicioHospitalizacionEntity get(long id);

    boolean delete(long id);

    boolean delete(ServicioHospitalizacionEntity ServicioHospitalizacionEntity);

}
