package sendbajt.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import sendbajt.domain.repository.JobRepository;
import sendbajt.requests.*;

@Endpoint
public class JobEndpoint {

    private static final String NAMESPACE_URI = "127.0.0.1/8084/sendbajt";

    private JobRepository jobRepository;

    @Autowired
    public JobEndpoint(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "jobs")
    @ResponsePayload
    public JobResponse getJob(@RequestPayload JobRequest request) {
        JobResponse response = new JobResponse();
        response.setJob(jobRepository.getAllJobs());

        return response;
    }
}
