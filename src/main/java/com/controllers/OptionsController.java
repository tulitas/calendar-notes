package com.controllers;

import com.Models.JobformService;
import com.entities.JobForm;
import com.repositories.JobformDAOImpl;
import com.repositories.JobformServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import javax.persistence.Entity;
//import javax.ws.rs.DELETE;
import java.util.List;

@Controller
@RequestMapping("/")
@Configuration

@ComponentScan("com.repositories")
//@RequestMapping(value = "/options", method = RequestMethod.GET)
public class OptionsController {
  @Autowired

  private JobformService jobformService = new JobformServiceImpl();

  @RequestMapping(value = "/options/create", method = RequestMethod.POST)
  public String options(JobForm jobForm) {
    jobformService.addJobForm(jobForm);
    return "redirect:/options";
  }
//fcc

  @RequestMapping(value = "/options")

  public String getOptionsPage(Model model) {
    List<JobForm> jobForms = jobformService.listJobForm();
    model.addAttribute("optionsList", jobForms);
    System.out.println(jobForms);
    return "/options";
  }

  @RequestMapping(value = "/options/delete{id}", method = RequestMethod.GET)

  public String removeJobform(@PathVariable("id") long id) {
    System.out.println(id);

    jobformService.removeJobForm(id);
    return "redirect:/options";
  }

}
