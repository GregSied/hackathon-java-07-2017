package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.forms.RegisterCandidateForm;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.User;
import pl.kodolamacz.hack.service.repository.CandidateRepository;
import pl.kodolamacz.hack.service.repository.UserRepository;

import java.util.List;

/**
 * Created by Pingwinek on 2017-07-12.
 */
@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private UserRepository userRepository;

    public void addCandidate(Candidate candidate){
        candidateRepository.save(candidate);
    }

    public void addCandidate(RegisterCandidateForm candidateForm){
        User user = new User(candidateForm.getUsername(),candidateForm.getPassword(), User.Role.CANDIDATE);
        Candidate candidate = new Candidate(
                candidateForm.getFirstName(),candidateForm.getLastName(),candidateForm.getAge(),candidateForm.getHobbies(),candidateForm.getEmail(),user);
        candidateRepository.save(candidate);

    }

    public Iterable<Candidate> findAllCandidate(){
        return candidateRepository.findAll();
    }

    public Candidate findCandidateProfileId(Long id){
        return candidateRepository.findOne(id);}

    public List<Candidate> findCandidateProfileByName(String name){
        return candidateRepository.findByFirstName(name);}

    public List<Candidate> findCandidateProfileBySurname(String surname){
        return candidateRepository.findByLastName(surname);
    }

    public void updateCandidateProfile(Candidate candidate){
        candidateRepository.save(candidate);
    }

    public void removeCandidateProfile(Long id){
        candidateRepository.delete(id);
    }





}
