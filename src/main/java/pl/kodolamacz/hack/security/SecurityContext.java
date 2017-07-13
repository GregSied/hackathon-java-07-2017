package pl.kodolamacz.hack.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import pl.kodolamacz.hack.model.User;

/**
 * Created by Jasiek on 13.07.2017.
 */
public class SecurityContext {

    public static User getCurrentlyLoggedUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
