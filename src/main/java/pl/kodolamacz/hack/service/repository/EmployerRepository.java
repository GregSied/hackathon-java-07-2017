package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Employer;

/**
 * Created by Jasiek on 12.07.2017.
 */
public interface EmployerRepository extends CrudRepository<Employer, Long> {
}
