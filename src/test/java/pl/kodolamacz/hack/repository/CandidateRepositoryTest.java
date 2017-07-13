package pl.kodolamacz.hack.repository;


import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.model.Job;
import pl.kodolamacz.hack.model.User;

import pl.kodolamacz.hack.service.repository.CandidateRepository;
import pl.kodolamacz.hack.service.repository.EmployerRepository;
import pl.kodolamacz.hack.service.repository.UserRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 8760w on 2017-07-12.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CandidateRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmployerRepository employerRepository;

    @Test
    public void shouldSaveCandidate() throws Exception {
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);

        Candidate candidate = new Candidate("Jan", "Kowalski", 25,"jazda na rowerze", "aksmxal@gmail.com", user);

        ArrayList<Job> jobs = new ArrayList<>();
        Job job = new Job(null, "Programmer", "testing", "test", "test", 150, 170);
        job.setEmployerId(employer.getId());
        jobs.add(job);
        candidate.setJobs(jobs);

        //when
        candidateRepository.save(candidate);
        //then
        Assertions.assertThat(job.getId()).isNotNull();
        Assertions.assertThat(candidate.getId()).isNotNull();
    }

    @Test
    public void shouldCheckIfCandidateExist() throws Exception{
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        Candidate candidate = new Candidate("Jan", "Kowalski", 25,"jazda na rowerze", "aksmxal@gmail.com", user);
        candidateRepository.save(candidate);
        //when

        Boolean output = candidateRepository.exists(candidate.getId());
        //then
        Assertions.assertThat(output).isEqualTo(true);
    }

    @Test
    public void shouldDeleteCandidate() throws Exception {
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        Candidate candidate = new Candidate("Jan", "Kowalski", 25,"jazda na rowerze", "aksmxal@gmail.com", user);
        candidateRepository.save(candidate);
        //when
        long candidateInputCounter = candidateRepository.count();
        candidateRepository.delete(candidate);
        long candidateOutputCounter = candidateRepository.count();
        //then
        Assertions.assertThat(candidateInputCounter-candidateOutputCounter).isEqualTo(1);
    }

    @Test
    public void shouldCountCandidates() throws Exception {
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        Candidate candidate = new Candidate("Jan", "Kowalski", 25,"jazda na rowerze", "aksmxal@gmail.com", user);
        candidateRepository.save(candidate);
        //when
        long count = candidateRepository.count();
        //then
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void shouldFindAllCandidates() throws Exception {
        //given
        User user = User.admin("admin", "root123");
        userRepository.save(user);
        Employer employer = new Employer("karol", "karol@mail.com", "Krakow", 20, user);
        employerRepository.save(employer);
        Candidate candidate = new Candidate("Jan", "Kowalski", 25,"jazda na rowerze", "aksmxal@gmail.com", user);
        candidateRepository.save(candidate);
        //when
        Iterable<Candidate> output = candidateRepository.findAll();
        List<Candidate> lists = new ArrayList<>(1);
        for (Candidate c : output) {
            lists.add(c);
        }
        //then
        Assertions.assertThat(lists.size()).isEqualTo(1);

    }
}