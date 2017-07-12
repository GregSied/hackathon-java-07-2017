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
    String candidateName;
    String candidateSurname;
    int age;
    String hobbies;
    String candidateEmail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateSurname() {
        return candidateSurname;
    }

    public void setCandidateSurname(String candidateSurname) {
        this.candidateSurname = candidateSurname;
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
