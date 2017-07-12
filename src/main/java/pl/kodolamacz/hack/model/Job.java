package pl.kodolamacz.hack.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 2017-07-12.
 */


@Entity
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_employer;
    @Column(name = "job_title")
    @NotNull
    private String jobTitle;
    @NotNull
    @Column(name = "job_description")
    private String jobDescription;
    @NotNull
    private String conditions;
    private String benefits;
    @Column(name = "salary_low")
    private int salaryLow;
    @Column(name = "salary_high")
    private int salaryHigh;

}
