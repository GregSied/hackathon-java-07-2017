package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Employer;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {
}
