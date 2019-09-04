package universitaria.edna.repository;

import universitaria.edna.domain.TipoPersonaEntity;

import java.util.List;

public interface ITipoPersonaRepository {

    boolean save(TipoPersonaEntity TipoPersonaEntity);

    boolean update(TipoPersonaEntity TipoPersonaEntity);

    List<TipoPersonaEntity> fetch();

    TipoPersonaEntity get(long id);

    boolean delete(long id);

    boolean delete(TipoPersonaEntity TipoPersonaEntity);

}
