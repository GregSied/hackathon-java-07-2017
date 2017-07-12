package pl.kodolamacz.hack.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
    @NotNull

    private String firstName;
    @NotNull
    @Column(name = "last_name")
    private String lastName;
    @NotNull
    private int age;
    private String hobbies;
    @NotNull
    private String email;

    public Candidate() {
    }

    public Candidate(String firstName, String lastName, int age, String hobbies, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hobbies = hobbies;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
