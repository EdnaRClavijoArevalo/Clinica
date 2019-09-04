package universitaria.edna.repository;

import universitaria.edna.domain.VisitaMedicoEntity;

import java.util.List;

public interface IVisitaMedicoRepository {

    boolean save(VisitaMedicoEntity VisitaMedicoEntity);

    boolean update(VisitaMedicoEntity VisitaMedicoEntity);

    List<VisitaMedicoEntity> fetch();

    VisitaMedicoEntity get(long id);

    boolean delete(long id);

    boolean delete(VisitaMedicoEntity VisitaMedicoEntity);

}
