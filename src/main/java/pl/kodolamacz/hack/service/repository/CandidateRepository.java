package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Employer;

/**
 * Created by 8760w on 2017-07-12.
 */
public interface CandidateRepository extends CrudRepository<Candidate, Long> {


    Candidate findById(Long id);

    List<Candidate> findByName(String name);

    @Query("select c from candidate where c.[name] like %?1%")
    public List<Candidate> getByNameLike(String search);

}
