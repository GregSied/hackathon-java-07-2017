package pl.kodolamacz.hack.service;


import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.model.User;
import pl.kodolamacz.hack.service.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class EmployerServiceTest extends AbstractTransactionalJUnit4SpringContextTests{

    @Autowired
    private EmployerService employerService;
    @Autowired
    private UserRepository userRepository;

    @Before
    public void before(){
        jdbcTemplate.execute("truncate employer cascade");
        Employer employer = new Employer(
                "Katarzyna Duczyk","kasia@op.pl","Poznan",12, new User("fjut","faja", User.Role.EMPLOYER));
        employerService.addNewEmployerProfile(employer);
    }

    @Test
    public void shouldAddEmployer(){
        //given
        Employer employer = new Employer("" +
                "wata","wiktor@mik.pl","Warsaw",21, new User("jfkds","fds", User.Role.EMPLOYER));
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
        Employer employer = new Employer(
                "wiktor","wiktor@mik.pl","Lodz",222, new User("fds","dsf", User.Role.EMPLOYER));
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

    @Test
    public void shouldFindEmployerById(){
        //given
        Employer employer = new Employer(
                "wiktor","wiktor@mik.pl","Lodz",222, new User("fds","sdfs", User.Role.EMPLOYER));
        employerService.addNewEmployerProfile(employer);
        //when
        Employer foundEmployer = employerService.findEmployerById(employer.getId());
        //then
        Assertions.assertThat(foundEmployer.getName()).isEqualTo(employer.getName());

    }

    @Test
    public void shouldFindEmployerByName(){
        //given
        //when
        List<Employer> foundEmployers = employerService.findEmployersByName("Katarzyna Duczyk");
        //then
        Assertions.assertThat(foundEmployers.size()).isEqualTo(1);
        Assertions.assertThat(foundEmployers.get(0).getName()).isEqualTo("Katarzyna Duczyk");

    }

    @Test
    public void shouldFindEmployerByNameSubstring(){
        //when
        List<Employer> foundEmployers = employerService.findEmployersByNameLike("Duczy");
        //then
        Assertions.assertThat(foundEmployers.size()).isEqualTo(1);
        Assertions.assertThat(foundEmployers.get(0).getName()).isEqualTo("Katarzyna Duczyk");
    }

    @Test
    public void shouldDeleteEmployer(){
        Employer employer = new Employer(
                "Wanisz","wanisz@sam.pl","Krakow",12, new User("dsa","ads", User.Role.EMPLOYER));
        employerService.addNewEmployerProfile(employer);
        int initialSizeOfDb = employerService.findAllEmployers().size();
        //when
        employerService.deleteEmployerProfile(employer);
        int finalSizeOfDb = employerService.findAllEmployers().size();
        //then
        Assertions.assertThat(finalSizeOfDb).isEqualTo(initialSizeOfDb-1);
    }

    @Test
    public void shouldDeleteEmployerById(){
        //given
        Employer employer = new Employer(
                "Wanisz","wanisz@sam.pl","Krakow",12, new User("sa","sa", User.Role.EMPLOYER));
        employerService.addNewEmployerProfile(employer);
        int initialSizeOfDb = employerService.findAllEmployers().size();
        Long id = employer.getId();
        //when
        employerService.deleteEmployerProfileById(id);
        int finalSizeOfDb = employerService.findAllEmployers().size();
        //then
        Assertions.assertThat(finalSizeOfDb).isEqualTo(initialSizeOfDb-1);


    }


}
