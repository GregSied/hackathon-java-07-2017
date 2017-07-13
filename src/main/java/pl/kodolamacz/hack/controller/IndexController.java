package pl.kodolamacz.hack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jasiek on 13.07.2017.
 */
@Controller
public class IndexController {

    @RequestMapping("indexCandidate.html")
    public ModelAndView getIndexCandidate(){
        return new ModelAndView("indexCandidate");
    }
    @RequestMapping("indexEmployer.html")
    public ModelAndView getIndexEmployer(){
        return new ModelAndView("indexEmployer");
    }
}
