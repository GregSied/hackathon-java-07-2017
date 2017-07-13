package pl.kodolamacz.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.kodolamacz.hack.service.CandidateService;
import pl.kodolamacz.hack.service.EmployerService;

/**
 * Created by lary8 on 13.07.2017.
 */@Controller
@RequestMapping("/message")
public class MessageController {
@Autowired
    CandidateService candidateService;
@Autowired
    EmployerService employerService;
     @RequestMapping("/users/")
     public ModelAndView users(){
         ModelAndView modelAndView = new ModelAndView("messagesViews/showUsersToMessages");
         modelAndView.addObject("candidate",candidateService.findAllCandidate());
         modelAndView.addObject("employer",employerService.findAllEmployers());
         return modelAndView;
     }



}
