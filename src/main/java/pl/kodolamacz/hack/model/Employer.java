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


}
