package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pingwinek on 2017-07-12.
 */
@Service
public class CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    private CandidateRepository candidateRepository;

    public List<Candidate> findAllCandidate(){
        return candidateRepository.findAllCandidate();
    }

    public Candidate findCandidateById(int id){return candidateRepository.findCandidateById(id);}

    public void addCandidate(Candidate candidate){
        candidateRepository.addCandidate(candidate);
    }

    public void updateCandidateDetails(Candidate candidate){
        candidateRepository.changeCandidateDetails(candidate);
    }
    public void removeCandidate(int id){
        candidateRepository.removeCandidate(id);
    }



}
