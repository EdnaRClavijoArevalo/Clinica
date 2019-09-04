package universitaria.edna.repository;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;
import universitaria.edna.domain.CostoSuministroHospitalizacionEntity;
import universitaria.edna.repository.ICostoSuministroHospitalizacionRepository;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Instant;
import java.util.List;

@Singleton
public class SqlCostoSuministroHospitalizacionService implements ICostoSuministroHospitalizacionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public SqlCostoSuministroHospitalizacionService(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public boolean save(CostoSuministroHospitalizacionEntity entity) {
        try {
            entity.setCreationDate(Instant.now());
            entityManager.persist(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean update(CostoSuministroHospitalizacionEntity entity) {
        try {
            entity.setModificationDate(Instant.now());
            entityManager.merge(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional(readOnly = true)
    public List<CostoSuministroHospitalizacionEntity> fetch() {
        String sqlString = "SELECT e FROM CostoSuministroHospitalizacionEntity as e";
        return entityManager.createQuery(sqlString).getResultList();
    }

    @Transactional(readOnly = true)
    public CostoSuministroHospitalizacionEntity get(long id) {
        try {
            return entityManager.find(CostoSuministroHospitalizacionEntity.class, id);
        } catch (Exception ex) {
            return null;
        }
    }

    @Transactional
    public boolean delete(long id) {
        try {
            CostoSuministroHospitalizacionEntity entity = get(id);
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Transactional
    public boolean delete(CostoSuministroHospitalizacionEntity entity) {
        try {
            entityManager.remove(entity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }







}
