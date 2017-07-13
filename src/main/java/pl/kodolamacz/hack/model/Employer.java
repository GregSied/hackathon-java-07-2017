package pl.kodolamacz.hack.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "employer")
public class Employer extends AbstractEntity {

    @NotEmpty
    private String name;
    @NotEmpty
    private String email;
    @NotEmpty
    private String location;
    @Column(name = "employees_count")
    @NotNull
    private int employeesCount;
    private Long userId;



    public Employer() {
    }

    public Employer(String name, String email, String location, int employeesCount) {
        this.name = name;
        this.email = email;
        this.location = location;
        this.employeesCount = employeesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
