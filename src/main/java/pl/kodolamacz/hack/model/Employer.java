package pl.kodolamacz.hack.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Blob;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "employer")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotEmpty
    String employerName;
    @NotEmpty
    String employerEmail;
    @NotEmpty
    String location;
    int employeesNumber;

    public Employer() {
    }

    public Employer(String employerName, String employerEmail, String location, int employeesNumber) {
        this.employerName = employerName;
        this.employerEmail = employerEmail;
        this.location = location;
        this.employeesNumber = employeesNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerEmail() {
        return employerEmail;
    }

    public void setEmployerEmail(String employerEmail) {
        this.employerEmail = employerEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}
