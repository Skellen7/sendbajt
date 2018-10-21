package sendbajt.domain.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sendbajt.domain.Job;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;


@Repository
public class DBJobRepository implements JobRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void createJob(boolean jobTaken, boolean jobOrdered, String latitude, String longtitude, String category, int price, String description, String startHour, String endHour) {

        Job job = new Job(jobTaken, jobOrdered, latitude, longtitude, category, price, description, startHour, endHour);

        em.persist(job);

    }

    @Override
    public List<Job> getAllJobs() {

        return  em.createQuery("from Job", Job.class).getResultList();
    }

    @Override
    @Transactional
    public void deleteJob(Integer id) {
        em.remove(id);
    }

    @Override
    public void build() {

    }

    @Override
    @Transactional
    public void createJob(Job job) {
        em.persist(job);
    }

    @Override
    public Job getJobById(Integer id) {
        return em.find(Job.class, id);
    }


    @Override
    @Transactional
    public void updateJob(int id, Job job) {
        em.merge(job);
    }

    public Job getFirst() {
        return em.createQuery("from Job", Job.class).getResultList().get(0);
    }
}