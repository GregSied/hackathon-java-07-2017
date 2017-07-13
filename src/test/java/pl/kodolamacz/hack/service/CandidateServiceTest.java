package pl.kodolamacz.hack.service;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kodolamacz.hack.model.Candidate;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Pingwinek on 2017-07-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:repository.xml","classpath:mail.xml"})
public class CandidateServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CandidateService candidateService;

    Candidate candidateTest = new Candidate("Mietek", "Mietkowski", 50, "Sasha Grey", "kocham@sashe.com");

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

//    @Test
//    public void shoud_update_
//
//    }

}
