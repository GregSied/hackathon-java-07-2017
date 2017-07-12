package pl.kodolamacz.hack.controller;

import com.sun.scenario.effect.Effect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.kodolamacz.hack.model.Employer;
import pl.kodolamacz.hack.service.EmployerService;

import javax.validation.Valid;

@Controller
public class EmployerController {

    @Autowired
    EmployerService employerService;

    @RequestMapping(value = "registerEmployer.html", method = RequestMethod.GET)
    public ModelAndView showAddEmployerForm() {
        return new ModelAndView("employerViews/addEmployerForm", "employer", new Employer());
    }

    @RequestMapping(value = "registerEmployer.html", method = RequestMethod.POST)
    public ModelAndView addNewEmployer(@Valid Employer employer, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("employerViews/addEmployerForm");
        }
        employerService.addNewEmployerProfile(employer);
        ModelAndView modelAndView = new ModelAndView("employerViews/addEmployerConfirmation");
        return modelAndView;
    }

    @RequestMapping(value = "editEmployer.html", method = RequestMethod.GET)
    public ModelAndView showEditEmployer(@RequestParam int id){
        return new ModelAndView(
                "/employerView/editEmployer","employer", employerService.findEmployerById(id));
    }

    @RequestMapping(value = "editEmployer.html",method = RequestMethod.POST)
    public ModelAndView editEmployer(@Valid Employer employer, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("/employerView/editEmployer");
        }
        employerService.updateEmployerProfile(employer.getEmployerName(), employer);
        return new ModelAndView("/employerView/editEmployerConfirmation");
    }

}
