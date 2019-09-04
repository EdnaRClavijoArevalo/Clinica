package universitaria.edna.repository;

import universitaria.edna.domain.CostoSuministroHospitalizacionEntity;

import java.util.List;

public interface ICostoSuministroHospitalizacionRepository {

    boolean save(CostoSuministroHospitalizacionEntity CostoSuministroHospitalizacionEntity);

    boolean update(CostoSuministroHospitalizacionEntity CostoSuministroHospitalizacionEntity);

    List<CostoSuministroHospitalizacionEntity> fetch();

    CostoSuministroHospitalizacionEntity get(long id);

    boolean delete(long id);

    boolean delete(CostoSuministroHospitalizacionEntity CostoSuministroHospitalizacionEntity);

}
