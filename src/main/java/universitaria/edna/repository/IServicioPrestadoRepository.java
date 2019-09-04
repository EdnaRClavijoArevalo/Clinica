package universitaria.edna.repository;

import universitaria.edna.domain.ServicioPrestadoEntity;

import java.util.List;

public interface IServicioPrestadoRepository {

    boolean save(ServicioPrestadoEntity ServicioPrestadoEntity);

    boolean update(ServicioPrestadoEntity ServicioPrestadoEntity);

    List<ServicioPrestadoEntity> fetch();

    ServicioPrestadoEntity get(long id);

    boolean delete(long id);

    boolean delete(ServicioPrestadoEntity ServicioPrestadoEntity);

}
