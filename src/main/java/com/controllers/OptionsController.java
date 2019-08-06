package com.controllers;

import com.Models.JobformService;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class OptionsController {
    @Autowired
    private JobformService jobformService;

    @RequestMapping(value = "/options", method = RequestMethod.POST)
    public String options(JobForm jobForm) {
        jobformService.addContact(jobForm);
        return "options";
    }
}
