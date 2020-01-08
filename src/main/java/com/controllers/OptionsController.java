package com.controllers;

import com.Models.JobformService;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class OptionsController {

    private JobformService jobformService;


    @Autowired
    public OptionsController(JobformService jobformService) {
        this.jobformService = jobformService;
    }

    @RequestMapping(value = "/options/create", method = RequestMethod.POST)
    public String options(JobForm jobForm) {
        jobformService.addJobForm(jobForm);
        return "redirect:/options";
    }


    @RequestMapping(value = "/options")
    public String getAllByWorkdate(Model model, String work_date) {
        List<JobForm> jobForms = jobformService.getAllByWorkdate(work_date);
        model.addAttribute("optionsList", jobForms);
        return "/options";
    }

    @RequestMapping(value = "/options/delete{id}", method = RequestMethod.GET)
    public String removeJobform(@PathVariable("id") long id) {
        jobformService.removeJobForm(id);
        return "redirect:/options";
    }

    @RequestMapping(value = "/options/getstatistics")

    public String getStatistics(Model model, String date2) {

        String stat = jobformService.getStatistics(date2);
        String remont = jobformService.getRemont(date2);
        String snjatie = jobformService.getSnjatie(date2);
        String minibasic = jobformService.getMinibasic(date2);
        String minibasicpluss = jobformService.getMinibasicpluss(date2);
        String optimum = jobformService.getOptimum(date2);
        String mini = jobformService.getMini(date2);
        String premium = jobformService.getPremium(date2);
        String busydays = jobformService.getBusydays(date2);
        model.addAttribute("premium", premium);
        model.addAttribute("mini", mini);
        model.addAttribute("optimum", optimum);
        model.addAttribute("minibasicpluss", minibasicpluss);
        model.addAttribute("minibasic", minibasic);
        model.addAttribute("statlist", stat);
        model.addAttribute("remontList", remont);
        model.addAttribute("snjatieList", snjatie);
        model.addAttribute("busydays", busydays);
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






