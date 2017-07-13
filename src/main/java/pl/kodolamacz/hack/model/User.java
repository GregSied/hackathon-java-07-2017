package pl.kodolamacz.hack.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean hasRole(Role role){
        return this.role == role;
    }

    public Role getRole() {
        return role;
    }

    public enum Role {
        CANDIDATE, EMPLOYER, ADMIN
    }
}
