package universitaria.edna.repository;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;
import universitaria.edna.domain.HabitacionEntity;
import universitaria.edna.repository.IHabitacionRepository;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Instant;
import java.util.List;

@Singleton
public class SqlHabitacionService implements IHabitacionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public SqlHabitacionService(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public boolean save(HabitacionEntity entity) {
        try {
            entity.setCreationDate(Instant.now());
            entityManager.persist(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean update(HabitacionEntity entity) {
        try {
            entity.setModificationDate(Instant.now());
            entityManager.merge(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional(readOnly = true)
    public List<HabitacionEntity> fetch() {
        String sqlString = "SELECT e FROM HabitacionEntity as e";
        return entityManager.createQuery(sqlString).getResultList();
    }

    @Transactional(readOnly = true)
    public HabitacionEntity get(long id) {
        try {
            return entityManager.find(HabitacionEntity.class, id);
        } catch (Exception ex) {
            return null;
        }
    }

    @Transactional
    public boolean delete(long id) {
        try {
            HabitacionEntity entity = get(id);
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean delete(HabitacionEntity entity) {
        try {
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }







}
