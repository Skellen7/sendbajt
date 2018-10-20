package sendbajt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sendbajt.domain.Job;
import sendbajt.domain.repository.JobRepository;
import sendbajt.domain.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class JobService {

    @Autowired
    JobRepository jobRepository;

    @Autowired
    UserRepository userRepository;


    public List<Job> getAllJobs() {
        return new ArrayList<>(jobRepository.getAllJobs());
    }


    public void saveJob(Job job) {
        jobRepository.createJob(job);
    }

    public Job getJob(Integer id) {
        return jobRepository.getJobById(id);
    }

    public void deleteJob(Integer id) {
        jobRepository.deleteJob(id);
    }

    public void updateJob(Job job) {
        jobRepository.updateJob(job.getId(), job);
    }


}
