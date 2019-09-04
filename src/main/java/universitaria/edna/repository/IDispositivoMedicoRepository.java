package universitaria.edna.repository;

import universitaria.edna.domain.DispositivoMedicoEntity;

import java.util.List;

public interface IDispositivoMedicoRepository {

    boolean save(DispositivoMedicoEntity DispositivoMedicoEntity);

    boolean update(DispositivoMedicoEntity DispositivoMedicoEntity);

    List<DispositivoMedicoEntity> fetch();

    DispositivoMedicoEntity get(long id);

    boolean delete(long id);

    boolean delete(DispositivoMedicoEntity DispositivoMedicoEntity);

}
