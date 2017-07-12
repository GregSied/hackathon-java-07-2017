package pl.kodolamacz.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

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
    public ModelAndView showAddClient(){
        return new ModelAndView("/clientView/addClient","client", new Client());
    }

    @RequestMapping(value = "addClient.html",method = RequestMethod.POST)
    public ModelAndView addClient(@Valid Client client, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("/clientView/addClient");
        }
        clientService.saveClient(client);
        return new ModelAndView("/clientView/addClientConfirmation");
    }
}
