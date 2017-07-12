package pl.kodolamacz.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.kodolamacz.hack.service.JobService;

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
}
