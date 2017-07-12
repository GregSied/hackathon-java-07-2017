package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.model.Job;


import java.util.List;

/**
 * Created by Jasiek on 12.07.2017.
 */
public interface EmployerRepository extends CrudRepository<Employer, Long> {

    Employer findById(Long id);

    List<Employer> findByName(String name);

    List<Employer> findByLocationContainig(String search);

    List<Employer> getByNameLike(String nameSubstring);
}


