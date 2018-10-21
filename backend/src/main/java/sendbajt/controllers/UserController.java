package sendbajt.controllers;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sendbajt.components.TimeComponent;
import sendbajt.domain.Job;
import sendbajt.domain.User;
import sendbajt.domain.repository.DBJobRepository;
import sendbajt.domain.repository.DBUserRepository;
import sendbajt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;
import java.util.Collection;

@Controller
public class UserController {


    @Autowired
    TimeComponent timeComponent;

    @Autowired
    DBJobRepository DBJobRepository;

    @Autowired
    DBUserRepository DBUserRepository;

    @Autowired
    UserService service;

    @RequestMapping("/users")
    public String getUsers(Model model) {
        Collection<User> allUsers = DBUserRepository.getAllUsers();
        Job job = DBJobRepository.getFirst();
        model.addAttribute("users", allUsers);
        model.addAttribute("timecomponent", timeComponent);
        model.addAttribute("job", job);
        return "users";
    }

    @RequestMapping("/user")
    public String getUser(@RequestParam("id") Integer id, Model model) {
        User user = DBUserRepository.getUserById(id);
        Job job = DBJobRepository.getFirst();
        model.addAttribute("user", user);
        model.addAttribute("timecomponent", timeComponent);
        model.addAttribute("job", job);
        return "user";
    }

    @RequestMapping("/newuser")
    public String createUser(Model model) {
        model.addAttribute("job", new User());
        model.addAttribute("timecomponent", timeComponent);
        User user = DBUserRepository.getFirst();
        model.addAttribute("user", user);
        return "userform";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.out.println("There were errors");
            bindingResult.getAllErrors().forEach(error -> {
                        System.out.println(error.getObjectName() + " " + error.getDefaultMessage());
                    }
            );
            return "userform";
        } else {
            service.saveUser(user);
            return "redirect:/users";
        }

    }

    @RequestMapping(value = "/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        service.deleteUser(id);
        return "redirect:/users";
    }
}