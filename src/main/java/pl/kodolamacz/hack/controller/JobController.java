package pl.kodolamacz.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.kodolamacz.hack.model.Job;
import pl.kodolamacz.hack.service.JobService;

import javax.validation.Valid;

/**
 * Created by Pingwinek on 2017-07-12.
 */
@Controller
public class JobController {

    @Autowired
    JobService jobService;

    //SHOW ALL JOBS - SASHA GREY
    @RequestMapping("show-jobs.html")
    public ModelAndView getAllJob() {
        ModelAndView modelAndView = new ModelAndView("jobViews/showJobs");
        modelAndView.addObject("jobs", jobService.findAllJobs()); //TODO IMPLEMENT METHOD
        return modelAndView;
    }

    @RequestMapping("add-jobs-form.html")
    public ModelAndView saveProduct(@Valid @ModelAttribute Job job, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("addJobForm");
        }

        jobService.addNewJob(job);
        return new ModelAndView("onJobSave", "job", job);
    }
}
