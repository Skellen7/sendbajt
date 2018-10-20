package sendbajt;

import sendbajt.domain.Job;
import sendbajt.domain.User;
import sendbajt.domain.repository.DBJobRepository;
import sendbajt.domain.repository.DBUserRepository;
import sendbajt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;


@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    DBUserRepository DBUserRepository;

    @Autowired
    DBJobRepository DBJobRepository;

    @Autowired
    UserService userService;

    @Override
    public void run(String... strings) throws Exception {

        User user1 = new User("user1", "user1", 5);
        User user2 = new User("user2", "user2", 5);


        Calendar startHour = Calendar.getInstance();
        Calendar endHour;
        startHour.setTime(new Date());
        endHour = startHour;
        endHour.add(Calendar.HOUR_OF_DAY, 1);
        Job job1 = new Job(false, true, "52.239094", "20.985423",  "mowing", 25, "Go mow my lawn!!", startHour.getTime().toString(), endHour.getTime().toString());
        DBJobRepository.createJob(job1);
        Job job2 = new Job(false, true, "52.239094", "20.985423",  "mowing", 25, "Go mow my lawn!!", startHour.getTime().toString(), endHour.getTime().toString());
        DBJobRepository.createJob(job2);
        Job job3 = new Job(false, true, "52.239094", "20.985423",  "mowing", 25, "Go mow my lawn!!", startHour.getTime().toString(), endHour.getTime().toString());
        DBJobRepository.createJob(job3);

        user1.getJobs().add(job1);
        user1.getJobs().add(job2);
        user2.getJobs().add(job3);
//        user2.getJobs().add(job2);

        DBUserRepository.createUser(user1);
        DBUserRepository.createUser(user2);

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
