package sendbajt.controllers;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sendbajt.domain.User;
import sendbajt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

//    @RequestMapping("/assignTakenJob")
//    public String assignQuest(@RequestParam("jobId") Integer id, Model model) {
//        Job knight = jobService.getKnight(id);
//        List<User> notStartedQuests = questService.getAllNotStartedQuests();
//        model.addAttribute("knight", knight);
//        model.addAttribute("notStartedQuests", notStartedQuests);
//        return "assignQuest";
//    }
//
//    @RequestMapping(value = "/assignOrderedJob", method = RequestMethod.POST)
//    public String assignQuest(Knight knight, BindingResult result) {
//        System.out.println(result);
//        knightService.updateKnight(knight);
//        return "redirect:/knights";
//    }
//
//    @RequestMapping(value = "/checkQuests")
//    public String checkQuests() {
//
//        knightService.getMyGold();
//
//        return "redirect:/knights";
//    }

}
