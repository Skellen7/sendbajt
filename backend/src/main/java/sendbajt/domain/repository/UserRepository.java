package sendbajt.domain.repository;

import org.springframework.transaction.annotation.Transactional;
import sendbajt.domain.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager em;


    @Transactional
    public void createUser(User user) {
        em.persist(user);
    }

    public List<User> getAll() {
        return em.createQuery("from User", User.class).getResultList();
    }

    public void deleteUser(User user) {
        em.remove(user);
    }

    @Transactional
    public void update(User user) {
        em.merge(user);
    }

    public User getUser(Integer id) {
        return em.find(User.class, id);
    }
}
