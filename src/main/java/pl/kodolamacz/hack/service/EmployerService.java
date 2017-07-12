package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.service.repository.EmployerRepository;

import java.util.List;

@Service
public class EmployerService {

    @Autowired
    EmployerRepository employerRepository;

    public void addNewEmployerProfile(Employer employer){
        employerRepository.save(employer);
    }

    public void updateEmployerProfile(Employer employer){
        employerRepository.save(employer);
    }

    public Employer findEmployerById(Long id){
        return employerRepository.findById(id);
    }

    public Iterable<Employer> findAllEmployers(){
        return employerRepository.findAll();
    }

    public List<Employer> findEmployersByName(String name){
        return employerRepository.findByName(name);
    }

    public List<Employer> findEmployersByNameLike(String nameSubstring){
        return employerRepository.findByNameLike(nameSubstring);
    }

    public void deleteEmployerProfile(Employer employer){
        employerRepository.delete(employer);
    }

    public void deleteEmployerProfileById(Long id){
        employerRepository.delete(id);
    }



}
