package universitaria.edna.repository;

import universitaria.edna.domain.EntidadSaludEntity;

import java.util.List;

public interface IEntidadSaludRepository {

    boolean save(EntidadSaludEntity EntidadSaludEntity);

    boolean update(EntidadSaludEntity EntidadSaludEntity);

    List<EntidadSaludEntity> fetch();

    EntidadSaludEntity get(long id);

    boolean delete(long id);

    boolean delete(EntidadSaludEntity EntidadSaludEntity);

}
