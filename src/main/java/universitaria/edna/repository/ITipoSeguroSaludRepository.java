package universitaria.edna.repository;

import universitaria.edna.domain.TipoSeguroSaludEntity;

import java.util.List;

public interface ITipoSeguroSaludRepository {

    boolean save(TipoSeguroSaludEntity TipoSeguroSaludEntity);

    boolean update(TipoSeguroSaludEntity TipoSeguroSaludEntity);

    List<TipoSeguroSaludEntity> fetch();

    TipoSeguroSaludEntity get(long id);

    boolean delete(long id);

    boolean delete(TipoSeguroSaludEntity TipoSeguroSaludEntity);

}
