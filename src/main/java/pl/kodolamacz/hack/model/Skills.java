package pl.kodolamacz.hack.model;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 2017-07-12.
 */
@Entity
@Table(name = "skills")
public enum Skills {

    JAVA, JAVASCRIPT, HTML, CSS, ANGULAR, SPRING, HIBERNATE, SQL
}
