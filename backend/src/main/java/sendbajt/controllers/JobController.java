package sendbajt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import sendbajt.services.JobService;

import javax.validation.Valid;
import java.util.List;


@Controller
public class JobController {

    @Autowired
    TimeComponent timeComponent;

    @Autowired
    DBJobRepository DBJobRepository;

    @Autowired
    DBUserRepository DBUserRepository;

    @Autowired
    JobService service;

    @RequestMapping("/jobs")
    public String getJobs(Model model) {
        List<Job> allJobs = DBJobRepository.getAllJobs();
        User user = DBUserRepository.getFirst();
        model.addAttribute("jobs", allJobs);
        model.addAttribute("timecomponent", timeComponent);
        model.addAttribute("user", user);
        return "jobs";
    }

    @RequestMapping("/job")
    public String getJob(@RequestParam("id") Integer id, Model model) {
        Job job = DBJobRepository.getJobById(id);
        User user = DBUserRepository.getFirst();
        model.addAttribute("job", job);
        model.addAttribute("timecomponent", timeComponent);
        model.addAttribute("user", user);
        return "user";
    }

    @RequestMapping("/newjob")
    public String createJob(Model model) {
        model.addAttribute("job", new Job());
        model.addAttribute("timecomponent", timeComponent);
        User user = DBUserRepository.getFirst();
        model.addAttribute("user", user);
        return "jobform";
    }

    @RequestMapping(value = "/jobs", method = RequestMethod.POST)
    public String saveJob(@Valid Job job, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.out.println("There were errors");
            bindingResult.getAllErrors().forEach(error -> {
                        System.out.println(error.getObjectName() + " " + error.getDefaultMessage());
                    }
            );
            return "jobform";
        } else {
            service.saveJob(job);
            return "redirect:/jobs";
        }

    }

    @RequestMapping(value = "/job/delete/{id}")
    public String deleteJob(@PathVariable("id") Integer id) {
        service.deleteJob(id);
        return "redirect:/jobs";
    }
}
