package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.model.Skill;
import pl.kodolamacz.hack.service.repository.SkillRepository;

import java.util.List;

/**
 * Created by Jasiek on 12.07.2017.
 */
@Service
public class SkillService {

    @Autowired
    SkillRepository skillRepository;

    public Skill findById(long id){
        return skillRepository.findOne(id);
    }

    public Iterable<Skill> findAll(){
        return skillRepository.findAll();
    }

}
