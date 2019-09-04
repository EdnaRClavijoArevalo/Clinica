package universitaria.edna.repository;

import universitaria.edna.domain.IngresoPacienteEntity;

import java.util.List;

public interface IIngresoPacienteRepository {

    boolean save(IngresoPacienteEntity IngresoPacienteEntity);

    boolean update(IngresoPacienteEntity IngresoPacienteEntity);

    List<IngresoPacienteEntity> fetch();

    IngresoPacienteEntity get(long id);

    boolean delete(long id);

    boolean delete(IngresoPacienteEntity IngresoPacienteEntity);

}
