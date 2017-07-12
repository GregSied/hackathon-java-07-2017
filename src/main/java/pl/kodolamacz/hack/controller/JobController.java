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
        modelAndView.addObject(jobService.findJobrById(id));
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
}
