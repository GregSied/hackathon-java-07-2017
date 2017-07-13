package pl.kodolamacz.hack.service.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.User;

import java.util.List;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {

    Candidate findByUser(User user);

    List<Candidate> findByFirstName(String name);

    List<Candidate> findByLastName(String search);

}
