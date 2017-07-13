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
import pl.kodolamacz.hack.service.repository.EmployerRepository;
import pl.kodolamacz.hack.service.repository.JobRepository;
import pl.kodolamacz.hack.service.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 8760w on 2017-07-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class EmployerRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {

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
//        Job job = new Job(employer.getId(),"gardener", "watering", "flower", "nothing", 10, 20);
        //when
        employerRepository.save(employer);

        //then
        Assertions.assertThat(employer.getId()).isNotNull();

    }

    @Test
    public void shouldCheckIfEmployeeExist() throws Exception{
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        //when
        Boolean output = employerRepository.exists(employer.getId());
        //then
        Assertions.assertThat(output).isEqualTo(true);
    }

    @Test
    public void shouldDeleteEmployee() throws Exception {
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        //when
        long employeeInputCounter = employerRepository.count();
        employerRepository.delete(employer);
        long employeeOutputCounter = employerRepository.count();
        //then
        Assertions.assertThat(employeeInputCounter-employeeOutputCounter).isEqualTo(1);
    }

    @Test
    public void shouldCountEmployees() throws Exception {
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        //when
        long count = employerRepository.count();
        //then
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void shouldFindAllEmployers() throws Exception {
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        //when
        Iterable<Employer> output = employerRepository.findAll();
        List<Employer> lists = new ArrayList<>(1);
        for (Employer e : output) {
            lists.add(e);
        }
        //then
        Assertions.assertThat(lists.size()).isEqualTo(1);

    }


}