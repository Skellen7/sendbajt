package sendbajt.domain.repository;


import sendbajt.domain.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.Optional;

public interface UserRepository {

    void createUser(String username, String password, int rating);

    Collection<User> getAllUsers();

    void deleteUser(Integer id);

    Optional<User> getUser(String username);

    void build();

    void createUser(User user);

    User getUserById(Integer id);

    default void updateUser(int id, User user) { throw new NotImplementedException(); }
}
