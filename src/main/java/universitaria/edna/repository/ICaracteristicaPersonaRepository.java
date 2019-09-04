package universitaria.edna.repository;

import universitaria.edna.domain.CaracteristicaPersonaEntity;

import java.util.List;

public interface ICaracteristicaPersonaRepository {

    boolean save(CaracteristicaPersonaEntity CaracteristicaPersonaEntity);

    boolean update(CaracteristicaPersonaEntity CaracteristicaPersonaEntity);

    List<CaracteristicaPersonaEntity> fetch();

    CaracteristicaPersonaEntity get(long id);

    boolean delete(long id);

    boolean delete(CaracteristicaPersonaEntity CaracteristicaPersonaEntity);

}
