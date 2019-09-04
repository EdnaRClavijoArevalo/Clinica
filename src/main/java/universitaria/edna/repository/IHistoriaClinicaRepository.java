package universitaria.edna.repository;

import universitaria.edna.domain.HistoriaClinicaEntity;

import java.util.List;

public interface IHistoriaClinicaRepository {

    boolean save(HistoriaClinicaEntity HistoriaClinicaEntity);

    boolean update(HistoriaClinicaEntity HistoriaClinicaEntity);

    List<HistoriaClinicaEntity> fetch();

    HistoriaClinicaEntity get(long id);

    boolean delete(long id);

    boolean delete(HistoriaClinicaEntity HistoriaClinicaEntity);

}
