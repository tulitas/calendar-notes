package com.controllers;

import com.Models.JobformDAO;
import com.Models.JobformService;
import com.entities.JobForm;
import com.repositories.JobformDAOImpl;
import com.repositories.JobformRepository;
import com.repositories.JobformServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.DELETE;
import java.util.List;

@Controller
//@RequestMapping(value = "/options", method = RequestMethod.GET)
public class OptionsController {
    @Autowired
    private JobformService jobformService = new JobformServiceImpl();

    @RequestMapping(value = "/options/create", method = RequestMethod.POST)
    public String options(JobForm jobForm) {
        jobformService.addContact(jobForm);
        return "redirect:/options";
    }


    @RequestMapping(value = "/options")

    public String getOptionsPage(Model model) {
        List<JobForm> jobForms = jobformService.listContact();
        model.addAttribute("optionsList", jobForms);
        System.out.println(jobForms);
        return "/options";
    }

    @RequestMapping(value = "/options/delete", method = RequestMethod.GET)
    public String removeJobform(@PathVariable ("id") Integer id) {
        System.out.println("test delete");
        // jobformService.removeContact(id);

        this.jobformService.removeContact(id);
        return "/options";
    }

}
