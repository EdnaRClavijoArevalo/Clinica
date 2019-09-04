package universitaria.edna.repository;

import universitaria.edna.domain.PersonaEntity;

import java.util.List;

public interface IPersonaRepository {

    boolean save(PersonaEntity PersonaEntity);

    boolean update(PersonaEntity PersonaEntity);

    List<PersonaEntity> fetch();

    PersonaEntity get(long id);

    boolean delete(long id);

    boolean delete(PersonaEntity PersonaEntity);

}
