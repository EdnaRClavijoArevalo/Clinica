package universitaria.edna.repository;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;
import universitaria.edna.domain.DispositivoMedicoEntity;
import universitaria.edna.repository.IDispositivoMedicoRepository;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Instant;
import java.util.List;

@Singleton
public class SqlDispositivoMedicoService implements IDispositivoMedicoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public SqlDispositivoMedicoService(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public boolean save(DispositivoMedicoEntity entity) {
        try {
            entity.setCreationDate(Instant.now());
            entityManager.persist(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean update(DispositivoMedicoEntity entity) {
        try {
            entity.setModificationDate(Instant.now());
            entityManager.merge(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional(readOnly = true)
    public List<DispositivoMedicoEntity> fetch() {
        String sqlString = "SELECT e FROM DispositivoMedicoEntity as e";
        return entityManager.createQuery(sqlString).getResultList();
    }

    @Transactional(readOnly = true)
    public DispositivoMedicoEntity get(long id) {
        try {
            return entityManager.find(DispositivoMedicoEntity.class, id);
        } catch (Exception ex) {
            return null;
        }
    }

    @Transactional
    public boolean delete(long id) {
        try {
            DispositivoMedicoEntity entity = get(id);
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean delete(DispositivoMedicoEntity entity) {
        try {
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }







}
