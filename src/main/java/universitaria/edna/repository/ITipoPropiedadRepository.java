package universitaria.edna.repository;

import universitaria.edna.domain.TipoPropiedadEntity;

import java.util.List;

public interface ITipoPropiedadRepository {

    boolean save(TipoPropiedadEntity TipoPropiedadEntity);

    boolean update(TipoPropiedadEntity TipoPropiedadEntity);

    List<TipoPropiedadEntity> fetch();

    TipoPropiedadEntity get(long id);

    boolean delete(long id);

    boolean delete(TipoPropiedadEntity TipoPropiedadEntity);

}
