package sendbajt.services;

import sendbajt.domain.User;
import sendbajt.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {


    UserRepository userRepository;

    final static Random rand= new Random();


    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void update(User user) {
        userRepository.update(user);
    }

}
