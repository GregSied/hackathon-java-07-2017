package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.model.Job;
import pl.kodolamacz.hack.service.repository.JobRepository;

import java.util.List;


/**
 * Created by Lukasz on 12.07.2017.
 */


@Service
public class JobService {


    @Autowired
    JobRepository jobRepository;

    public void addNewJob (Job job) {jobRepository.save(job);}
    public void updateJob (Job job){jobRepository.save(job);
    }

    public Job findJobById(Long id){
        return jobRepository.findById(id);
    }

    public List<Job> findJobsByName(String title){
        return jobRepository.findByTitle(title);
    }

    public List<Job> findJobsByNameLike(String titleSubstring){
        return jobRepository.findByTitleLike(titleSubstring);
    }

    public void deleteEmployerProfile(Job job){jobRepository.delete(job);
    }

    public void deleteJobById(Long id) {
        jobRepository.delete(id);
    }

    public Iterable<Job> findAllJob(){
        return jobRepository.findAll();
    }

    public List<Job> searchJob(String title) {
        return jobRepository.findByTitle(title);

    }
    List<Job> findJobsByEmployerId(Long id){

        return jobRepository.findJobsByEmployerId(id);
    }

}

