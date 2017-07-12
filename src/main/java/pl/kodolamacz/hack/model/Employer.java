package pl.kodolamacz.hack.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "employer")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private String email;
    private String location;
    @Column(name = "employees_count")
    private int employeesCount;

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



}
