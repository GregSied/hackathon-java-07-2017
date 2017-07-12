package pl.kodolamacz.hack.service.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Candidate;

import java.util.List;
import pl.kodolamacz.hack.model.Employer;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {


    Candidate findById(Long id);

    List<Candidate> findByName(String name);

    List<Candidate> findByLastNamenContainig(String search);

}
