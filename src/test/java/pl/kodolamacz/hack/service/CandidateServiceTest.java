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


/**
 * Created by Pingwinek on 2017-07-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:repository.xml","classpath:mail.xml"})
public class CandidateServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CandidateService candidateService;
    @Autowired
    private UserRepository userRepository;

    Candidate candidateTest = new Candidate("Mietek", "Mietkowski", 50, "Natura", "kocham@ad.com", new User("LaFaja","Papaja",User.Role.CANDIDATE));


    @Before
    public void before(){
        jdbcTemplate.execute("truncate candidate cascade");

    }

    @Test
    public void should_add_candidate() {
        //given
        //when
        candidateService.addCandidate(candidateTest);
        Candidate candidateById = candidateService.findCandidateProfileId(candidateTest.getId());
        //then
        Assertions.assertThat(candidateById.getFirstName()).isEqualTo("Mietek");

    }

    @Test
    public void should_list_all_candidate() {
        //given
        candidateService.addCandidate(candidateTest);
        //when
        Iterable<Candidate> iterableList = candidateService.findAllCandidate();
        List<Candidate> candidateList = new ArrayList<>();
        iterableList.forEach(candidateList::add);
        //then
        Assertions.assertThat(candidateList.size()).isGreaterThan(0);

    }

    @Test
    public void should_find_candidate_by_id() {
        //given
        candidateService.addCandidate(candidateTest);
        //when
        Candidate candidateById = candidateService.findCandidateProfileId(candidateTest.getId());
        //then
        Assertions.assertThat(candidateById.getFirstName()).contains("Mietek");
        Assertions.assertThat(candidateById.getFirstName()).isNotEmpty();
    }

    @Test
    public void should_find_candidate_by_name(){
        //given
        Candidate candidateTest1 = new Candidate("Mietek", "Mietkowski", 50, "Natura", "kocham@ad.com", new User("LaFajaDeux","Papaja",User.Role.CANDIDATE));
        Candidate candidateTest2 = new Candidate("Mietek", "Mietkowski", 50, "Natura", "kocham@ad.com", new User("LaFajaTrois","Papaja",User.Role.CANDIDATE));

        candidateService.addCandidate(candidateTest);
        candidateService.addCandidate(candidateTest1);
        candidateService.addCandidate(candidateTest2);
        //when
        List<Candidate> candidateList = candidateService.findCandidateProfileByName("Mietek");
        //then
        Assertions.assertThat(candidateList.size()).isEqualTo(3);
    }

    @Test
    public void should_find_candidate_by_surname(){
        //given
        Candidate candidateTest1 = new Candidate("Mietek", "Mietkowski", 50, "Natura", "kocham@ad.com",new User("LaFajaDeux","Papaja",User.Role.CANDIDATE));
        Candidate candidateTest2 = new Candidate("Mietek", "Mietkowski", 50, "Natura", "kocham@ad.com",new User("LaFajaTrois","Papaja",User.Role.CANDIDATE));

        candidateService.addCandidate(candidateTest);
        candidateService.addCandidate(candidateTest1);
        candidateService.addCandidate(candidateTest2);
        //when
        List<Candidate> candidateList = candidateService.findCandidateProfileBySurname("Mietkowski");
        //then
        Assertions.assertThat(candidateList.size()).isEqualTo(3);

    }

    @Test
    public void should_remove_candidate_by_id() {
        //given
        candidateService.addCandidate(candidateTest);
        Candidate candidateById = candidateService.findCandidateProfileId(candidateTest.getId());
        //when
        candidateService.removeCandidateProfile(candidateById.getId());
        Iterable<Candidate> iterableList = candidateService.findAllCandidate();
        List<Candidate> candidateList = new ArrayList<>();
        iterableList.forEach(candidateList::add);
        //then
        Assertions.assertThat(candidateList).doesNotContain(candidateById);
    }

    @Test
    public void should_update_candidate(){
        //given
        candidateService.addCandidate(candidateTest);
        candidateTest.setAge(100);
        candidateTest.setFirstName("Karolina");
        candidateTest.setHobbies("Filmy");
        //when
        candidateService.updateCandidateProfile(candidateTest);
        Candidate candidateEditedById = candidateService.findCandidateProfileId(candidateTest.getId());
        Iterable<Candidate> iterableList = candidateService.findAllCandidate();
        List<Candidate> candidateList = new ArrayList<>();
        iterableList.forEach(candidateList::add);
        //then
        Assertions.assertThat(candidateEditedById.getFirstName()).contains("Karolina");
        Assertions.assertThat(candidateEditedById.getLastName()).contains("Mietkowski");
        Assertions.assertThat(candidateEditedById.getAge()).isEqualTo(100);
        Assertions.assertThat(candidateEditedById.getEmail()).contains("kocham@ad.com");
    }

}
