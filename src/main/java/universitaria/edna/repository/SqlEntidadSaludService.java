package universitaria.edna.repository;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;
import universitaria.edna.domain.EntidadSaludEntity;
import universitaria.edna.repository.IEntidadSaludRepository;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Instant;
import java.util.List;

@Singleton
public class SqlEntidadSaludService implements IEntidadSaludRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public SqlEntidadSaludService(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public boolean save(EntidadSaludEntity entity) {
        try {
            entity.setCreationDate(Instant.now());
            entityManager.persist(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean update(EntidadSaludEntity entity) {
        try {
            entity.setModificationDate(Instant.now());
            entityManager.merge(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional(readOnly = true)
    public List<EntidadSaludEntity> fetch() {
        String sqlString = "SELECT e FROM EntidadSaludEntity as e";
        return entityManager.createQuery(sqlString).getResultList();
    }

    @Transactional(readOnly = true)
    public EntidadSaludEntity get(long id) {
        try {
            return entityManager.find(EntidadSaludEntity.class, id);
        } catch (Exception ex) {
            return null;
        }
    }

    @Transactional
    public boolean delete(long id) {
        try {
            EntidadSaludEntity entity = get(id);
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean delete(EntidadSaludEntity entity) {
        try {
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }







}
