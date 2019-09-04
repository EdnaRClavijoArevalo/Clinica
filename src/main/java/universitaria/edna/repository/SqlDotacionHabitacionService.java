package universitaria.edna.repository;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;
import universitaria.edna.domain.DotacionHabitacionEntity;
import universitaria.edna.repository.IDotacionHabitacionRepository;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Instant;
import java.util.List;

@Singleton
public class SqlDotacionHabitacionService implements IDotacionHabitacionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public SqlDotacionHabitacionService(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public boolean save(DotacionHabitacionEntity entity) {
        try {
            entity.setCreationDate(Instant.now());
            entityManager.persist(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean update(DotacionHabitacionEntity entity) {
        try {
            entity.setModificationDate(Instant.now());
            entityManager.merge(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional(readOnly = true)
    public List<DotacionHabitacionEntity> fetch() {
        String sqlString = "SELECT e FROM DotacionHabitacionEntity as e";
        return entityManager.createQuery(sqlString).getResultList();
    }

    @Transactional(readOnly = true)
    public DotacionHabitacionEntity get(long id) {
        try {
            return entityManager.find(DotacionHabitacionEntity.class, id);
        } catch (Exception ex) {
            return null;
        }
    }

    @Transactional
    public boolean delete(long id) {
        try {
            DotacionHabitacionEntity entity = get(id);
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean delete(DotacionHabitacionEntity entity) {
        try {
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }







}
