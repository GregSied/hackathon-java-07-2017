package pl.kodolamacz.hack.service;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kodolamacz.hack.model.Job;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 2017-07-13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JobServiceTest extends AbstractTransactionalJUnit4SpringContextTests{

    @Autowired
    JobService jobService;

    Job job=new Job(0L,"robota","niezła fucha","conditions", "benefits", 100,200);

    @Test
    public void shouldFindJobsByEmployerId(){

    List<Job> jobByEmpId =jobService.findJobsByEmployerId(0L);
        Assertions.assertThat(jobByEmpId).isNotEmpty();

    }

}