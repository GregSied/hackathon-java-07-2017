package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.Job;
import pl.kodolamacz.hack.model.Skill;

import java.util.List;

/**
 * Created by Jasiek on 12.07.2017.
 */
public interface SkillRepository extends CrudRepository<Skill, Long> {

}
