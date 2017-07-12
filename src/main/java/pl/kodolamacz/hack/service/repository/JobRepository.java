package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Job;

import java.util.List;

/**
 * Created by 8760w on 2017-07-12.
 */
public interface JobRepository extends CrudRepository<Job, Long> {

    Job findById(Long id);

    List<Job> findByName(String name);

    List<Job> findByJobTitleContaining(String search);

    List<Job> getByNameLike(String nameSubstring);

    List<Job> findByNameLike(String nameSubstring);
}
