package com.controllers;

import com.Models.JobformService;
import com.entities.JobForm;
import com.repositories.JobformServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        System.out.println("CONTR get all by work date");
        List<JobForm> jobForms = jobformService.getAllByWorkdate(work_date);
        model.addAttribute("optionsList", jobForms);
        System.out.println(jobForms);
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

}








