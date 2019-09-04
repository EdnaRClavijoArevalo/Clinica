package universitaria.edna.repository;

import universitaria.edna.domain.EdificioEntity;

import java.util.List;

public interface IEdificioRepository {

    boolean save(EdificioEntity EdificioEntity);

    boolean update(EdificioEntity EdificioEntity);

    List<EdificioEntity> fetch();

    EdificioEntity get(long id);

    boolean delete(long id);

    boolean delete(EdificioEntity EdificioEntity);

}
