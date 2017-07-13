package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Job;

import java.util.List;


/**
 * Created by 8760w on 2017-07-12.
 */


public interface JobRepository extends CrudRepository<Job, Long> {

    Job findById(Long id);

    List<Job> findByTitle(String title);

    List<Job> findByTitleContaining(String search);

    List<Job> getByTitleLike(String titleSubstring);

    List<Job> findByTitleLike(String titleSubstring);

    Job deleteJobById(Long id);
}
