package sendbajt.domain.repository;

import org.springframework.transaction.annotation.Transactional;
import sendbajt.domain.User;
import sendbajt.utils.Ids;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

   // Random rand = new Random();

    Map<Integer,User> users = new HashMap<>();


    @Transactional
    public void createUser(User user) {
        em.persist(user);
    }

    public List<User> getAll() {
        //return em.createQuery("from User", User.class).getResultList();
        return  new ArrayList<>(users.values());
    }

    public void deleteUser(User user) {
        users.remove(user.getId());
    }

    @PostConstruct
    public void init() {    }

    public void update(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(Integer id) {
        return users.get(id);
    }
}
