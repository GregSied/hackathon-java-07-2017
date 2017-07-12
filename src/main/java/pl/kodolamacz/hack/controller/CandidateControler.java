package pl.kodolamacz.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.service.CandidateService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 8760w on 2017-07-12.
 */
@Controller
public class CandidateControler {


    private CandidateService candidateService;

    @Autowired
    public CandidateControler(CandidateService candidateService) {
        this.candidateService = candidateService;
    }


    @RequestMapping(value = "addCandidate.html",method = RequestMethod.GET)
    public ModelAndView showAddCandidate(){
        return new ModelAndView("/candidateView/addCandidate","candidate", new Candidate());
    }

    @RequestMapping(value = "addCandidate.html",method = RequestMethod.POST)
    public ModelAndView addClient(@Valid Candidate candidate, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("/candidateView/addCandidate");
        }
        candidateService.saveCandidate(candidate);
        return new ModelAndView("/clientView/addCandidateConfirmation");
    }

    //UPDATE CANDIDATE GET METHOD
    @RequestMapping(value = "updateCandidate.html", method = RequestMethod.GET)
    public ModelAndView showUpdateCandidate(@RequestParam long id){
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("candidate", candidateService.findCandidateProfileId(id));
        return new ModelAndView("/candidateView/editCandidateForm", paramters);

    }

    //UPDATE CANDIDATE POST METHOD
    @RequestMapping(value = "updateCandidate.html", method = RequestMethod.POST)
    public ModelAndView editCandidate(@Valid Candidate candidate){
        candidateService.updateCandidateProfile(candidate.getId(), candidate);
        return new  ModelAndView("/candidateView/editCandidateConfirmation");
    }
}
