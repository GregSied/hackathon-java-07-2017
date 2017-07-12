package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.service.repository.EmployerRepository;

@Service
public class EmployerService {

    @Autowired
    EmployerRepository employerRepository;

    public void addNewEmployerProfile(Employer employer){
        employerRepository.addEmployer(employer);
    }

    public void updateEmployerProfile(int id, Employer employer){
        employerRepository.updateEmployer(id,employer);
    }



}
