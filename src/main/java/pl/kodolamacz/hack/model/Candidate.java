package pl.kodolamacz.hack.model;

import javax.persistence.*;

/**
 * 2017-07-12.
 */

@Entity
@Table(name = "candidate")
public class Candidate {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;
    int age;
    String hobbies;
    String candidateEmail;

    public Candidate() {
    }

    public Candidate(String firstName, String lastName, int age, String hobbies, String candidateEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hobbies = hobbies;
        this.candidateEmail = candidateEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }
}
