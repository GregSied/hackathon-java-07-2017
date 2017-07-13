package pl.kodolamacz.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Job;
import pl.kodolamacz.hack.model.User;
import pl.kodolamacz.hack.security.SecurityContext;
import pl.kodolamacz.hack.service.CandidateService;
import pl.kodolamacz.hack.service.JobService;

import javax.validation.Valid;
import java.util.Arrays;

/**
 * Created by Pingwinek on 2017-07-12.
 */
@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    JobService jobService;
    @Autowired
    CandidateService candidateService;

    //SHOW ALL JOBS - SASHA GREY
    @RequestMapping("/list")
    public ModelAndView getAllJob() {
        ModelAndView modelAndView = new ModelAndView("jobViews/showJobs");
        modelAndView.addObject("jobs", jobService.findAllJob());
        return modelAndView;
    }

    @RequestMapping("displayJob.html")
    public ModelAndView displayAJob(@RequestParam Long id){
        ModelAndView modelAndView = new ModelAndView("jobViews/displayJob");
        Job foundJob = jobService.findJobById(id);
        modelAndView.addObject("foundJob", foundJob);
        return modelAndView;
    }

    //EDIT JOB GET METHOD
    @RequestMapping (value ="edit-job.html", method = RequestMethod.GET)
    public ModelAndView showEditJob(@RequestParam(name="id")Long id){
        ModelAndView modelAndView = new ModelAndView("jobViews/editJob");
        modelAndView.addObject(jobService.findJobById(id));
        return modelAndView;
    }

    //EDIT JOB POST METHOD
    @RequestMapping (value="edit-job.html", method = RequestMethod.POST)
    public ModelAndView editJob(@Valid Job job, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("/jobViews/editJob");
        }
        jobService.updateJob(job);
        return new ModelAndView("jobViews/editJobConfirmation");
    }

    //SAVE JOB OFFER GET METHOD
    @RequestMapping(value = "add-offer-form.html", method = RequestMethod.GET)
    public ModelAndView showAddJobForm() {

        return new ModelAndView("/jobViews/addJobForm","job", new Job());

    }

    //SAVE JOB OFFER POST
    @RequestMapping(value = "add-offer-form.html", method = RequestMethod.POST)
    public ModelAndView saveProduct(@Valid @ModelAttribute Job job, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("/jobViews/addJobForm");
        }

        jobService.addNewJob(job);
        return new ModelAndView("jobViews/addJobConfirmation", "job" , job);
    }

    @RequestMapping(value = "apply-for-job", method = RequestMethod.GET)
    public ModelAndView applyForJob(@RequestParam Long id){
        User user = SecurityContext.getCurrentlyLoggedUser();
        Job job = jobService.findJobById(id);
        Candidate candidate = candidateService.findByUser(user);
        job.getCandidates().add(candidate);
        jobService.updateJob(job);
        return getAllJob();


    }





}
