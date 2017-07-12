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
    private Long id;
    private Long id_employer;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "job_description")
    private String jobDescription;
    private String conditions;
    private String benefits;
    @Column(name = "salary_low")
    private int salaryLow;
    @Column(name = "salary_high")
    private int salaryHigh;

    public Job() {
    }

    public Job(Long employer_id, String jobTitle, String jobDescription, String skills, String conditions, String benefits, int salary_low, int salary_high) {
        this.employer_id = employer_id;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.skills = skills;
        this.conditions = conditions;
        this.benefits = benefits;
        this.salary_low = salary_low;
        this.salary_high = salary_high;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployer_id() {
        return employer_id;
    }

    public void setEmployer_id(Long employer_id) {
        this.employer_id = employer_id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public int getSalary_low() {
        return salary_low;
    }

    public void setSalary_low(int salary_low) {
        this.salary_low = salary_low;
    }

    public int getSalary_high() {
        return salary_high;
    }

    public void setSalary_high(int salary_high) {
        this.salary_high = salary_high;
    }
}
