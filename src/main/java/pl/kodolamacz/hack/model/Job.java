package pl.kodolamacz.hack.model;

import javax.persistence.*;

/**
 * 2017-07-12.
 */


@Entity
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long employer_id;
    // TODO: 2017-07-12 sql column names
    String jobTitle;
    String jobDescription;
    String skills;
    String conditions;
    String benefits;
    int salary_low;
    int salary_high;

}
