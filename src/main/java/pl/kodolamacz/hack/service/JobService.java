package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.kodolamacz.hack.service.repository.JobRepository;

/**
 * Created by Lukasz on 12.07.2017.
 */
public class JobService {


    @Autowired
    JobRepository jobRepository;

    public void addNewJob (Job job) {jobRepository.save(job)};
    public void updateJob (Job job){jobRepository.save(job);
    }

    public Job findJobrById(Long id){
        return jobRepository.findById(id);
    }

    public List<Jobs> findJobsByName(String name){
        return jobRepository.findByName(name);
    }

    public List<Jobs> findJobsByNameLike(String nameSubstring){
        return jobRepository.findByNameLike(nameSubstring);
    }

    public void deleteEmployerProfile(Job job){jobRepository.delete(job);
    }

    public void deleteJobProfileById(Long id){
        jobRepository.delete(id);
    }

}
