package universitaria.edna.repository;

import universitaria.edna.domain.HabitacionEntity;

import java.util.List;

public interface IHabitacionRepository {

    boolean save(HabitacionEntity HabitacionEntity);

    boolean update(HabitacionEntity HabitacionEntity);

    List<HabitacionEntity> fetch();

    HabitacionEntity get(long id);

    boolean delete(long id);

    boolean delete(HabitacionEntity HabitacionEntity);

}
