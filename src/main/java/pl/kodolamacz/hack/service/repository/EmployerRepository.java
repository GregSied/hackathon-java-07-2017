package pl.kodolamacz.hack.service.repository;

import org.springframework.data.jpa.repository.Query;
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

    List<Employer> findByLocationContaining(String search);

    @Query("select e from Employer e where e.name like %?1%")
    List<Employer> getByNameLike(String nameSubstring);
}


