package com.controllers;

import com.Models.JobformService;
import com.entities.JobForm;
import com.repositories.JobformServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
@Configuration

@ComponentScan("com.repositories")
public class OptionsController {
    @Autowired

    private JobformService jobformService = new JobformServiceImpl();


    @RequestMapping(value = "/options/create", method = RequestMethod.POST)
    public String options(JobForm jobForm) {
        jobformService.addJobForm(jobForm);
        return "redirect:/options";
    }


    @RequestMapping(value = "/options")
    public String getAllByWorkdate(Model model, String work_date) {
        List<JobForm> jobForms = jobformService.getAllByWorkdate(work_date);
//        ModelAndView modelAndView = new ModelAndView();
//        System.out.println(modelAndView);
        model.addAttribute("optionsList", jobForms);
        return "/options";
    }


    @RequestMapping(value = "/options/delete{id}", method = RequestMethod.GET)
    public String removeJobform(@PathVariable("id") long id) {
        jobformService.removeJobForm(id);
        return "redirect:/options";
    }

    @RequestMapping(value = "/options/getstatistics")
    public String getStatistics(Model model) {
        String stat = jobformService.getStatistics();
        model.addAttribute("statlist", stat);
        System.out.println(stat);
        return "statistics";
    }

    @RequestMapping(value = "/options/edit{id}", method = RequestMethod.GET)
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
       List<JobForm> jobFormList = jobformService.findById(id);
        model.addAttribute("user", jobFormList);
        System.out.println(jobFormList);
        return "edit";
    }

    @RequestMapping(value = "/options/edit{id}", method = RequestMethod.POST)
    public String updateUser(@PathVariable("id") long id, @Valid JobForm jobForm, BindingResult result, Model model) {
        System.out.println("update jobform " + model);
        if (result.hasErrors()) {
            jobForm.setId(id);

            return "addnew";
        }

        jobformService.addJobForm(jobForm);
        model.addAttribute("users", jobformService.findById(id));
        return "addnew";
    }

}






