package pl.kodolamacz.hack.repository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.model.Job;
import pl.kodolamacz.hack.model.User;
import pl.kodolamacz.hack.service.repository.CandidateRepository;
import pl.kodolamacz.hack.service.repository.EmployerRepository;
import pl.kodolamacz.hack.service.repository.JobRepository;
import pl.kodolamacz.hack.service.repository.UserRepository;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by 8760w on 2017-07-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JobRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmployerRepository employerRepository;

    @Test
    public void shouldSaveJob() throws Exception {
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        Job job = new Job(employer.getId(),"gardener", "watering", "flower", "nothing", 10, 20);
        //when
        jobRepository.save(job);
        //then
        Assertions.assertThat(job.getId()).isNotNull();

    }

    @Test
    public void shouldCheckIfJobsExist() throws Exception{
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        Job job = new Job(employer.getId(),"gardener", "watering", "flower", "nothing", 10, 20);
        jobRepository.save(job);
        //when
        Boolean output = jobRepository.exists(job.getId());
        //then
        Assertions.assertThat(output).isEqualTo(true);
    }


}