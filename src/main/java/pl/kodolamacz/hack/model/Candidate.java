package pl.kodolamacz.hack.model;

import javax.persistence.*;

/**
 * 2017-07-12.
 */

@Entity
@Table(name = "candidate")
public class Candidate {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;
    int age;
    String hobbies;
    String candidateEmail;
}
