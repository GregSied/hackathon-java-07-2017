package pl.kodolamacz.hack.service.repository;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kodolamacz.hack.model.Candidate;

/**
 * Created by 8760w on 2017-07-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CandidateRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {


    Candidate candidateTest = new Candidate("Mietek","Mietkowski",50,"Sasha Grey","kocham@sashe.com");



}