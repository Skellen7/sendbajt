package sendbajt;

import sendbajt.domain.User;
import sendbajt.domain.repository.UserRepository;
import sendbajt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Override
    public void run(String... strings) throws Exception {

        User user1 = new User("user1", "user1", 5);
        userRepository.createUser(user1);
        User user2 = new User("user2", "user2", 5);
        userRepository.createUser(user2);

//        Role user1RoleUSER = new Role("user1", "USER");
//        Role user2RoleUSER = new Role("user2", "USER");
//        Role user2RoleADMIN = new Role("user1", "ADMIN");
//
//        roleRepository.persistRole(user1RoleUSER);
//        roleRepository.persistRole(user2RoleUSER);
//        roleRepository.persistRole(user2RoleADMIN);


        //System.out.println(roleRepository.getAll());

    }
}
