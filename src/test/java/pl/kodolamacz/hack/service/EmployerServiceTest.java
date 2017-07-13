package pl.kodolamacz.hack.service;


import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Employer;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class EmployerServiceTest extends AbstractTransactionalJUnit4SpringContextTests{

    @Autowired
    private EmployerService employerService;

    @Test
    public void shouldAddEmployer(){
        //given
        Employer employer = new Employer("wata","wiktor@mik.pl","Warsaw",21);
        List<Employer> initiallyAllEmployers = employerService.findAllEmployers();
        int initialSize = initiallyAllEmployers.size();
        //when
        employerService.addNewEmployerProfile(employer);
        int finalSize = employerService.findAllEmployers().size();
        //then
        Assertions.assertThat(finalSize).isEqualTo(initialSize+1);
    }

    @Test
    public void shouldUpdateEmployer(){
        //given
        Employer employer = new Employer("wiktor","wiktor@mik.pl","Lodz",222);
        employerService.addNewEmployerProfile(employer);
        int initialSize = employerService.findAllEmployers().size();
        //when
        employer.setEmail("wiktorek@buziaczek.pl");
        employer.setName("rusiewicz");
        employerService.updateEmployerProfile(employer);
        //then
        Assertions.assertThat(employerService.findEmployerById(employer.getId()).getName()).isEqualTo("rusiewicz");
        Assertions.assertThat(employerService.findEmployerById(employer.getId()).getEmployeesCount()).isEqualTo(222);
        Assertions.assertThat(employerService.findAllEmployers().size()).isEqualTo(initialSize);
    }


}
