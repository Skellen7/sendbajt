package sendbajt.domain.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sendbajt.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Optional;


@Repository
public class DBUserRepository implements UserRepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    @Transactional
    public void createUser(String username, String password, int rating) {

        User user = new User(username, password, rating);

        em.persist(user);

    }

    @Override
    public Collection<User> getAllUsers() {
        return  em.createQuery("from User", User.class).getResultList();

    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {
        em.remove(id);
    }

    @Override
    public Optional<User> getUser(String username) {
        User userByUsername = em.createQuery("from User u where u.name=:name", User.class)
                .setParameter("username", username).getSingleResult();

        return Optional.ofNullable(userByUsername);
    }

    @Override
    public void build() {

    }

    @Override
    @Transactional
    public void createUser(User user) {
        em.persist(user);

    }

    @Override
    public User getUserById(Integer id) {
        return em.find(User.class, id);
    }

    @Override
    @Transactional
    public void updateUser(int id, User user) {
        em.merge(user);

    }

    public User getFirst() {
        return em.createQuery("from User", User.class).getResultList().get(0);
    }
}