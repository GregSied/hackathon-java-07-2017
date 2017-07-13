package pl.kodolamacz.hack.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.kodolamacz.hack.security.SecurityContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

    @RequestMapping({"candidate","indexCandidate.html"})
    public ModelAndView getIndexCandidate(){
        ModelAndView modelAndView = new ModelAndView("indexCandidate");
        modelAndView.addObject("user", SecurityContext.getCurrentlyLoggedUser());
        return modelAndView;
    }
    @RequestMapping({"employer","indexEmployer.html"})
    public ModelAndView getIndexEmployer(){
        ModelAndView modelAndView = new ModelAndView("indexEmployer");
        modelAndView.addObject("user", SecurityContext.getCurrentlyLoggedUser());
        return modelAndView;
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(ModelMap model) {
        model.addAttribute("user", SecurityContext.getCurrentlyLoggedUser());
        return "admin";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "welcome";
    }

    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("user", SecurityContext.getCurrentlyLoggedUser());
        return "accessDenied";
    }

    @RequestMapping(value = "/Access_Denied2", method = RequestMethod.GET)
    public String accessDeniedPage2(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "accessDeniedAlreadyLoggedIn";
    }

    private String getPrincipal() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
}
