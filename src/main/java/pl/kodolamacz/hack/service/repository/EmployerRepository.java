package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Employer;


import java.util.List;

/**
 * Created by Jasiek on 12.07.2017.
 */
public interface EmployerRepository extends CrudRepository<Employer, Long> {

    Employer findById(Long id);

    List<Employer> findByName(String name);

    @Query("select e from employer where e.[name] like %?1%")
    public List<Employer> getByNameLike(String search);
}


