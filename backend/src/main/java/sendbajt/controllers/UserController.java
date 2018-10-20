package sendbajt.controllers;

import sendbajt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


    @Autowired
    UserService userService;



//    @RequestMapping(value = "/checkUsers")
//    public String checkQuests() {
//
//    }


}
