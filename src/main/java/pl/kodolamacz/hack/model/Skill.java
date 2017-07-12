package pl.kodolamacz.hack.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 2017-07-12.
 */

@Entity
@Table(name = "skill")
public class Skill extends Entity{


    @NotNull
    private String name;

    public Skill() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
