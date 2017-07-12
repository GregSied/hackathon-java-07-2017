package pl.kodolamacz.hack.model;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by Jasiek on 12.07.2017.
 */

@Entity
@Table(name = "employer")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String employerName;
    String employerEmail;
    String location;
    int employeesNumber;


}
