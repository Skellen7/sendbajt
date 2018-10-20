package sendbajt.domain.repository;

import sendbajt.domain.Job;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.Optional;

public interface JobRepository {

   void createJob(boolean jobTaken, boolean jobOrdered, String latitude, String longtitude, String category, int price, String description, String startHour, String endHour);

    Collection<Job> getAllJobs();

    void deleteJob(Integer id);

    void build();

    void createJob(Job job);

    Job getJobById(Integer id);

    default void updateJob(int id, Job job) { throw new NotImplementedException(); }
}
