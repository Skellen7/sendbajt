package sendbajt.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import sendbajt.domain.repository.JobRepository;
import sendbajt.domain.repository.UserRepository;
import sendbajt.jobs.*;

@Endpoint
public class JobEndpoint {

    private static final String NAMESPACE_URI = "sendbajt/jobs/";

    private JobRepository jobRepository;

    private UserRepository userRepository;

    @Autowired
    public JobEndpoint(JobRepository jobRepository, UserRepository userRepository) {
        this.jobRepository = jobRepository;
        this.userRepository = userRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "jobRequest")
    @ResponsePayload
    public JobResponse getJob(@RequestPayload JobRequest request) {
        JobResponse response = new JobResponse();
        response.setJob(jobRepository.getAllJobs().toString());

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "userRequest")
    @ResponsePayload
    public UserResponse getUser(@RequestPayload UserRequest request) {
        UserResponse response = new UserResponse();
        response.setUser(userRepository.getAllUsers().toString());

        return response;
    }
}
