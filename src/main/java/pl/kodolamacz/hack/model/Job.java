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
    @Column(name = "employerId")
    private Long employerId;
    @Column(name = "job_title")
    @NotNull
    private String jobTitle;
    @NotNull
    @Column(name = "job_description")
    private String jobDescription;
    @NotNull
    private String conditions;

    public Long getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Long employerId) {
        this.employerId = employerId;
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

    public int getSalaryLow() {
        return salaryLow;
    }

    public void setSalaryLow(int salaryLow) {
        this.salaryLow = salaryLow;
    }

    public int getSalaryHigh() {
        return salaryHigh;
    }

    public void setSalaryHigh(int salaryHigh) {
        this.salaryHigh = salaryHigh;
    }

    private String benefits;
    @Column(name = "salary_low")
    private int salaryLow;
    @Column(name = "salary_high")
    private int salaryHigh;

}
