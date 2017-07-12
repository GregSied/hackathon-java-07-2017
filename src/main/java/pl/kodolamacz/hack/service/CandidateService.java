package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.service.repository.CandidateRepository;

import java.util.List;

/**
 * Created by Pingwinek on 2017-07-12.
 */
@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public void addCandidate(Candidate candidate){
        candidateRepository.save(candidate);
    }

    public Iterable<Candidate> findAllCandidate(){
        return candidateRepository.findAll();
    }

    public Candidate findCandidateProfileId(Long id){
        return candidateRepository.findOne(id);}

    public void addCandidateProfile(Candidate candidate){
        candidateRepository.save(candidate);
    }

    public void updateCandidateProfile(Long id, Candidate candidate){
        candidateRepository.save(candidate);
    }
    public void removeCandidateProfile(Long id){
        candidateRepository.delete(id);
    }



}
