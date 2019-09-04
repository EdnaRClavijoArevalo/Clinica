package universitaria.edna.repository;

import universitaria.edna.domain.ResultadoExamenEntity;

import java.util.List;

public interface IResultadoExamenRepository {

    boolean save(ResultadoExamenEntity ResultadoExamenEntity);

    boolean update(ResultadoExamenEntity ResultadoExamenEntity);

    List<ResultadoExamenEntity> fetch();

    ResultadoExamenEntity get(long id);

    boolean delete(long id);

    boolean delete(ResultadoExamenEntity ResultadoExamenEntity);

}
