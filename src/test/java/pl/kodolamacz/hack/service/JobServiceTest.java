package pl.kodolamacz.hack.service;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.model.Job;
import pl.kodolamacz.hack.model.User;
import pl.kodolamacz.hack.service.repository.EmployerRepository;

import java.util.List;

/**
 * 2017-07-13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JobServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    JobService jobService;

    @Autowired
    EmployerRepository employerRepository;

    @Test
    public void shouldFindJobsByEmployerId() {

        //given
        Employer employer = new Employer("aaa", "bbb", "ccc", 10, new User("name", "password", User.Role.EMPLOYER));
        Long employerId = employerRepository.save(employer).getId();
        final Job job = new Job(employerId, "fsdgsd", "dgdhdffdsd", "conditions", "benefits", 100, 200);
        jobService.addNewJob(job);

        //when
        List<Job> jobList = jobService.findJobsByEmployerId(employerId);

        //then
        Assertions.assertThat(jobList).isNotEmpty();

    }

}