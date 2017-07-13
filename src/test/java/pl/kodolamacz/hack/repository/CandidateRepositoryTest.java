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
import pl.kodolamacz.hack.model.Job;
import pl.kodolamacz.hack.model.User;

import pl.kodolamacz.hack.service.repository.CandidateRepository;
import pl.kodolamacz.hack.service.repository.UserRepository;

import java.util.ArrayList;

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

    @Test
    public void shouldSaveCandidate() throws Exception {
        //given
        User user = User.admin("admin", "root123");

        Candidate candidate = new Candidate("Jan", "Kowalski", 25,"jazda na rowerze", "aksmxal@gmail.com");
        ArrayList<Job> jobs = new ArrayList<>();
        Job job = new Job(null, "Programmer", "testing", "test", "test", 150, 170);
        jobs.add(job);
        candidate.setJobs(jobs);
        //when
        candidateRepository.save(candidate);
        userRepository.save(user);
        //then
        Assertions.assertThat(job.getId()).isNotNull();
        Assertions.assertThat(candidate.getId()).isNotNull();
    }

}