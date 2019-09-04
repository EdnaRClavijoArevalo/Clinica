package universitaria.edna.repository;

import universitaria.edna.domain.ExamenRealizadoEntity;

import java.util.List;

public interface IExamenRealizadoRepository {

    boolean save(ExamenRealizadoEntity ExamenRealizadoEntity);

    boolean update(ExamenRealizadoEntity ExamenRealizadoEntity);

    List<ExamenRealizadoEntity> fetch();

    ExamenRealizadoEntity get(long id);

    boolean delete(long id);

    boolean delete(ExamenRealizadoEntity ExamenRealizadoEntity);

}
