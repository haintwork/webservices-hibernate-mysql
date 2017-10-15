package superbrain.webservices.managers;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author haing
 * @param <T>
 */
@Dependent
public class CrudService<T> {
    
    @PersistenceContext
    private EntityManager em;
    
    public void create(T t) {
        getEntityManager().persist(t);
        getEntityManager().flush();
    }
    
    public T update(T t) {
        if (!getEntityManager().contains(t)) {
            t = getEntityManager().merge(t);
        }
        getEntityManager().flush();
        return t;
    }
    
    public void delete(T t) {
        if (!getEntityManager().contains(t)) {
            t = getEntityManager().merge(t);
        }
        getEntityManager().remove(t);
    }
    
    public T find(Class<T> entityClass, Object id) {
        return getEntityManager().find(entityClass, id);
    }
    
    public EntityManager getEntityManager() {
        return em;
    }
}