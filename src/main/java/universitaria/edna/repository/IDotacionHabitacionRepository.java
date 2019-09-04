package universitaria.edna.repository;

import universitaria.edna.domain.DotacionHabitacionEntity;

import java.util.List;

public interface IDotacionHabitacionRepository {

    boolean save(DotacionHabitacionEntity DotacionHabitacionEntity);

    boolean update(DotacionHabitacionEntity DotacionHabitacionEntity);

    List<DotacionHabitacionEntity> fetch();

    DotacionHabitacionEntity get(long id);

    boolean delete(long id);

    boolean delete(DotacionHabitacionEntity DotacionHabitacionEntity);

}
