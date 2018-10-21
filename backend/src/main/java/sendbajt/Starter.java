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

        User user1 = new User("towelchorizo21", "user1", 5);
        User user2 = new User("mayne$tle", "user2", 4);
        User user3 = new User("13quaintjeer", "user1", 5);
        User user4 = new User("kasakinoriaki", "user2", 5);
        User user5 = new User("griMMass", "user2", 3);
        User user6 = new User("selfieself12", "user2", 4);



        Calendar startHour = Calendar.getInstance();
        Calendar endHour;
        startHour.setTime(new Date());
        endHour = startHour;
        endHour.add(Calendar.HOUR_OF_DAY, 1);
        Job job1 = new Job(false, true, "52.239094", "20.985423",  "mowing", 25, "I need my lawn mowed.", startHour.getTime().toString(), endHour.getTime().toString());
        DBJobRepository.createJob(job1);
        user1.getJobs().add(job1);
        Job job2 = new Job(false, true, "52.234026", "20.986651",  "car", 15, "My car got dirty on my last journey. I need someone with a driver license to drive it to a car wash.", startHour.getTime().toString(), endHour.getTime().toString());
        DBJobRepository.createJob(job2);
        user2.getJobs().add(job2);
        Job job3 = new Job(false, true, "52.229551", "20.990512",  "car", 20, "Hi there! My mother in law visited me and I need someone to take out her lovely dog on a walk :)", startHour.getTime().toString(), endHour.getTime().toString());
        DBJobRepository.createJob(job3);
        user3.getJobs().add(job3);
        Job job4 = new Job(false, true, "52.233203", "20.981341",  "snow", 20, "Hello! The last snowstorm blocked my door and I'm unable to leave my house. If someone could clear my house of snow, I'd be grateful!", startHour.getTime().toString(), endHour.getTime().toString());
        DBJobRepository.createJob(job4);
        user4.getJobs().add(job4);
        Job job5 = new Job(false, true, "52.236810", "20.987640",  "leaf", 30, "Winter is coming. Leafs are all over my backyard. I need to get rid of them", startHour.getTime().toString(), endHour.getTime().toString());
        DBJobRepository.createJob(job5);
        user5.getJobs().add(job5);
        Job job6 = new Job(false, true, "52.231434", "20.968902",  "shopping", 10, "I broke my leg and I need someone to do my shopping. Who's got time?", startHour.getTime().toString(), endHour.getTime().toString());
        DBJobRepository.createJob(job6);
        user4.getJobs().add(job6);




        DBUserRepository.createUser(user1);
        DBUserRepository.createUser(user2);
        DBUserRepository.createUser(user3);
        DBUserRepository.createUser(user4);
        DBUserRepository.createUser(user5);
        DBUserRepository.createUser(user6);


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
