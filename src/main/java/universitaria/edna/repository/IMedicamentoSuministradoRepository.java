package universitaria.edna.repository;

import universitaria.edna.domain.MedicamentoSuministradoEntity;

import java.util.List;

public interface IMedicamentoSuministradoRepository {

    boolean save(MedicamentoSuministradoEntity MedicamentoSuministradoEntity);

    boolean update(MedicamentoSuministradoEntity MedicamentoSuministradoEntity);

    List<MedicamentoSuministradoEntity> fetch();

    MedicamentoSuministradoEntity get(long id);

    boolean delete(long id);

    boolean delete(MedicamentoSuministradoEntity MedicamentoSuministradoEntity);

}
