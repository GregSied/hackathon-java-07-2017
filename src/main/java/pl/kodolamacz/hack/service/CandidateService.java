package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.service.repository.CandidateRepository;

import java.util.List;

/**
 * Created by Pingwinek on 2017-07-12.
 */
@Service
public class CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    private CandidateRepository candidateRepository;

    public Iterable<Candidate> findAllCandidate(){
        return candidateRepository.findAll();
    }

    public Candidate findCandidateById(Long id){
        return candidateRepository.findOne(id);}

    public void addCandidate(Candidate candidate){
        candidateRepository.save(candidate);
    }

    public void updateCandidateDetails(Candidate candidate){
        candidateRepository.save(candidate);
    }
    public void removeCandidate(Long id){
        candidateRepository.delete(id);
    }



}
