package universitaria.edna.repository;

import universitaria.edna.domain.MedicamentoEntity;

import java.util.List;

public interface IMedicamentoRepository {

    boolean save(MedicamentoEntity MedicamentoEntity);

    boolean update(MedicamentoEntity MedicamentoEntity);

    List<MedicamentoEntity> fetch();

    MedicamentoEntity get(long id);

    boolean delete(long id);

    boolean delete(MedicamentoEntity MedicamentoEntity);

}
