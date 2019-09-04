package universitaria.edna.repository;

import universitaria.edna.domain.MaquinariaExamenEntity;

import java.util.List;

public interface IMaquinariaExamenRepository {

    boolean save(MaquinariaExamenEntity MaquinariaExamenEntity);

    boolean update(MaquinariaExamenEntity MaquinariaExamenEntity);

    List<MaquinariaExamenEntity> fetch();

    MaquinariaExamenEntity get(long id);

    boolean delete(long id);

    boolean delete(MaquinariaExamenEntity MaquinariaExamenEntity);

}
