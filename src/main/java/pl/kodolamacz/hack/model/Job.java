package pl.kodolamacz.hack.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 2017-07-12.
 */


@Entity
@Table(name = "job")
public class Job extends AbstractEntity {

    @Column(name = "employerId")
    private Long employerId;
    @Column(name = "title")
    @NotNull
    private String title;
    @NotNull
    @Column(name = "description")
    private String description;
    @NotNull
    private String conditions;
    private String benefits;
    @Column(name = "salary_low")
    private int salaryLow;
    @Column(name = "salary_high")
    private int salaryHigh;

    public Job() {
    }

    public Job(Long employerId, String title, String description, String conditions, String benefits, int salaryLow, int salaryHigh) {
        this.employerId = employerId;
        this.title = title;
        this.description = description;
        this.conditions = conditions;
        this.benefits = benefits;
        this.salaryLow = salaryLow;
        this.salaryHigh = salaryHigh;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
