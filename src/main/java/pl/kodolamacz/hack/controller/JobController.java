package pl.kodolamacz.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.kodolamacz.hack.model.Job;
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
        modelAndView.addObject("jobs", jobService.findAllJobs());
        modelAndView.addObject("job", new Job());
        return modelAndView;
    }
    //Search  JOBS
    @RequestMapping("show-jobs.html")
    public ModelAndView searchJob(@ModelAttribute Job job) {
        ModelAndView modelAndView = new ModelAndView("jobViews/showJobs");
        modelAndView.addObject("jobs", jobService.searchJob(job.getJobTitle()));
        modelAndView.addObject("job", job);

        return modelAndView;
    }

    @RequestMapping("displayJob.html")
    public ModelAndView displayAJob(@RequestParam Long id){
        ModelAndView modelAndView = new ModelAndView("jobViews/displayJob");
        Job foundJob = jobService.findJobById(id);
        modelAndView.addObject("foundJob", foundJob);
        return modelAndView;
    }
}
