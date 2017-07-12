package pl.kodolamacz.hack.model;

import javax.persistence.*;

/**
 * Created by Jasiek on 12.07.2017.
 */

@Entity
@Table(name = "employer")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String location;
    @Column(name = "employees_count")
    private int employeesCount;


}
