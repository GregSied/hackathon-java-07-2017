package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.forms.RegisterEmployerForm;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.model.User;
import pl.kodolamacz.hack.service.repository.EmployerRepository;
import pl.kodolamacz.hack.service.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployerService {

    @Autowired
    EmployerRepository employerRepository;

    @Autowired
    UserRepository userRepository;

    public void addNewEmployerProfile(Employer employer){
        employerRepository.save(employer);
    }

    public void addNewEmployerProfile(RegisterEmployerForm employerForm){
        User user = new User(employerForm.getUsername(),employerForm.getPassword(), User.Role.EMPLOYER);
        Employer employer = new Employer(employerForm.getName(),employerForm.getEmail(),employerForm.getLocation(),employerForm.getNumberOfEmployees(), user);
        employerRepository.save(employer);
    }

    public void updateEmployerProfile(Employer employer){
        employerRepository.save(employer);
    }

    public Employer findEmployerById(Long id){
        return employerRepository.findById(id);
    }

    public Employer findByUser(User user){
        return employerRepository.findByUser(user);
    }

    public List<Employer> findAllEmployers(){
        List<Employer> employerList = new ArrayList<>();
        employerRepository.findAll().forEach(employerList::add);
        return employerList;
    }

    public List<Employer> findEmployersByName(String name){
        return employerRepository.findByName(name);
    }

    public List<Employer> findEmployersByNameLike(String nameSubstring){
        return employerRepository.getByNameLike(nameSubstring);
    }

    public void deleteEmployerProfile(Employer employer){
        employerRepository.delete(employer);
    }

    public void deleteEmployerProfileById(Long id){
        employerRepository.delete(id);
    }





}
