package sendbajt.domain.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sendbajt.domain.Job;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class JobRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void createJob(Job job) {
        em.persist(job);
    }

    public List<Job> getAll() {
        return em.createQuery("from Job", Job.class).getResultList();
    }

    public void deletJob(Job job) {
        em.remove(job);
    }

    @PostConstruct
    public void init() {
    }

    public void update(Job job) {
        em.merge(job);
    }

    public Job getJob(Integer id) {
        return em.find(Job.class, id);
    }
}