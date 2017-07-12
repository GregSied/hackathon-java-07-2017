package pl.kodolamacz.hack.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 2017-07-12.
 */


@Entity
@Table(name = "job")
public class Job extends Entity {

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
    private String benefits;
    @Column(name = "salary_low")
    private int salaryLow;
    @Column(name = "salary_high")
    private int salaryHigh;

    public Job() {
    }

    public Job(Long employerId, String jobTitle, String jobDescription, String conditions, String benefits, int salaryLow, int salaryHigh) {
        this.employerId = employerId;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.conditions = conditions;
        this.benefits = benefits;
        this.salaryLow = salaryLow;
        this.salaryHigh = salaryHigh;
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

}
