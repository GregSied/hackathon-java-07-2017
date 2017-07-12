package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Employer;

import java.util.List;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {


    Candidate findById(Long id);

    List<Candidate> findByName(String name);

    @Query("select c from candidate where c.[name] like %?1%")
    public List<Candidate> getByNameLike(String search);

}
