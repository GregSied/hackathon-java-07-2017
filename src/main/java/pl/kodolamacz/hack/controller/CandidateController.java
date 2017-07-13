package pl.kodolamacz.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.kodolamacz.hack.forms.RegisterCandidateForm;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.service.CandidateService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pingwinek on 2017-07-12.
 */
@Controller
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    //REMOVE CANDIDATE
    @RequestMapping(value="remove-candidate.html", method= RequestMethod.GET)
    public ModelAndView removeCandidate(@RequestParam(name="id") Long id){
        ModelAndView modelAndView = new ModelAndView("candidateViews/removeCandidate");
        candidateService.removeCandidateProfile(id);
        return modelAndView;
    }

    //ADD CANDIDATE GET METHOD
    @RequestMapping(value = "registerCandidate.html", method = RequestMethod.GET)
    public ModelAndView showAddCandidateForm() {

        return new ModelAndView("candidateViews/addCandidate","candidateForm", new RegisterCandidateForm());

    }
    //ADD CANDIDATE POST METHOD
    @RequestMapping(value = "registerCandidate.html", method = RequestMethod.POST)
    public ModelAndView addCandidate(@Valid RegisterCandidateForm candidateForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("candidateViews/addCandidate");
        }
        candidateService.addCandidate(candidateForm);
        return new ModelAndView("candidateViews/addCandidateConfirmation");
    }


    //SHOW PROFIL BY ID
    @RequestMapping(value = "candidateProfile.html")
    public ModelAndView showClientProfile(@RequestParam(name="id") Long id){
        return new ModelAndView(
                "/candidateView/candidateProfile","candidate", candidateService.findCandidateProfileId(id));
    }


    //UPDATE CANDIDATE GET METHOD
    @RequestMapping(value = "updateCandidate.html", method = RequestMethod.GET)
    public ModelAndView showUpdateCandidate(@RequestParam long id){
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("candidate", candidateService.findCandidateProfileId(id));
        return new ModelAndView("candidateViews/editCandidateForm", paramters);

    }

    //UPDATE CANDIDATE POST METHOD
    @RequestMapping(value = "updateCandidate.html", method = RequestMethod.POST)
    public ModelAndView editCandidate(@Valid Candidate candidate){
        candidateService.updateCandidateProfile(candidate);
        return new  ModelAndView("candidateViews/editCandidateConfirmation");
    }
    //show list of employers
    @RequestMapping(value = "showListOfCandidate.html")
    public ModelAndView showListOfCandidate(){
        Iterable<Candidate> allCandidates = candidateService.findAllCandidate();
        List<Candidate> listOfCandidates = new ArrayList<>();
        for (Candidate allCandidate : allCandidates) {
            listOfCandidates.add(allCandidate);
        }
        ModelAndView modelAndView = new ModelAndView("candidateViews/listOfCandidates");
        modelAndView.addObject("allCandidates", listOfCandidates);
        return modelAndView;
    }
}
