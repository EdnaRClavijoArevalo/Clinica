package universitaria.edna.repository;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;
import universitaria.edna.domain.ResultadoExamenEntity;
import universitaria.edna.repository.IResultadoExamenRepository;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Instant;
import java.util.List;

@Singleton
public class SqlResultadoExamenService implements IResultadoExamenRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public SqlResultadoExamenService(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public boolean save(ResultadoExamenEntity entity) {
        try {
            entity.setCreationDate(Instant.now());
            entityManager.persist(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean update(ResultadoExamenEntity entity) {
        try {
            entity.setModificationDate(Instant.now());
            entityManager.merge(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional(readOnly = true)
    public List<ResultadoExamenEntity> fetch() {
        String sqlString = "SELECT e FROM ResultadoExamenEntity as e";
        return entityManager.createQuery(sqlString).getResultList();
    }

    @Transactional(readOnly = true)
    public ResultadoExamenEntity get(long id) {
        try {
            return entityManager.find(ResultadoExamenEntity.class, id);
        } catch (Exception ex) {
            return null;
        }
    }

    @Transactional
    public boolean delete(long id) {
        try {
            ResultadoExamenEntity entity = get(id);
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean delete(ResultadoExamenEntity entity) {
        try {
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }







}
