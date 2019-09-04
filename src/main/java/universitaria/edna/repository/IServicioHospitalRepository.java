package universitaria.edna.repository;

import universitaria.edna.domain.ServicioHospitalEntity;

import java.util.List;

public interface IServicioHospitalRepository {

    boolean save(ServicioHospitalEntity ServicioHospitalEntity);

    boolean update(ServicioHospitalEntity ServicioHospitalEntity);

    List<ServicioHospitalEntity> fetch();

    ServicioHospitalEntity get(long id);

    boolean delete(long id);

    boolean delete(ServicioHospitalEntity ServicioHospitalEntity);

}
