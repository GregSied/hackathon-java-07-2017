package pl.kodolamacz.hack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.kodolamacz.hack.service.CandidateService;

/**
 * Created by Pingwinek on 2017-07-12.
 */
@Controller
public class CandidateController {

    private CandidateService candidateService;

    //REMOVE EMPLOYEE
    @RequestMapping(value="remove-candidate.html", method= RequestMethod.GET)
    public ModelAndView removeCandidate(@RequestParam(name="id") Long id){
        ModelAndView modelAndView = new ModelAndView("candidateViews/removeCandidate");
        candidateService.removeCandidateProfile(id);
        return modelAndView;
    }
}
