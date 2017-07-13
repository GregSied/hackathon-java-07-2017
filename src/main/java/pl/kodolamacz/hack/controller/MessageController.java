package pl.kodolamacz.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pl.kodolamacz.hack.forms.RegisterCandidateForm;
import pl.kodolamacz.hack.forms.SendMessageForm;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Message;
import pl.kodolamacz.hack.service.CandidateService;
import pl.kodolamacz.hack.service.EmployerService;
import pl.kodolamacz.hack.service.MessageService;

import javax.validation.Valid;

/**
 * Created by lary8 on 13.07.2017.
 */@Controller
@RequestMapping("/message")
public class MessageController {
    @Autowired
    CandidateService candidateService;
    @Autowired
    EmployerService employerService;
    @Autowired
    MessageService messageService;
    @RequestMapping("/users")
    public ModelAndView users() {
        ModelAndView modelAndView = new ModelAndView("messagesViews/showUsersToMessages");
        modelAndView.addObject("allCandidates", candidateService.findAllCandidate());
        modelAndView.addObject("allEmployers", employerService.findAllEmployers());
        return modelAndView;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ModelAndView addMessage(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("messagesViews/messageWindow");
        modelAndView.addObject("sendMessageForm",new SendMessageForm());
        return modelAndView;
    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public ModelAndView addMessage(@ModelAttribute SendMessageForm sendMessageForm) {
        return new ModelAndView("messagesViews/messageWindow");
    }
}
