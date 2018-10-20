package sendbajt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sendbajt.domain.Job;
import sendbajt.domain.User;
import sendbajt.domain.repository.DBUserRepository;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserService {

    @Autowired
    DBUserRepository userRepository;


    public List<User> getAllUsers() {
        return new ArrayList<>(userRepository.getAllUsers());
    }


    public void saveUser(User user) {
        userRepository.createUser(user);
    }

    public User getUser(Integer id) {
        return userRepository.getUserById(id);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteUser(id);
    }

    public void updateKnight(User user) {
        userRepository.updateUser(user.getId(), user);
    }



}
