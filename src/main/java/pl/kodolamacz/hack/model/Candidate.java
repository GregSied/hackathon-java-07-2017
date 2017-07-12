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

    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    private int age;
    private String hobbies;
    private String email;
}
