package com.controllers;

import com.Models.ManagersNameService;
import com.entities.Managers_name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/managers")
public class ManagersController {
    private String name;
    private ManagersNameService managersNameService;

    @Autowired
    public ManagersController(ManagersNameService managersNameService) {

        this.managersNameService = managersNameService;
    }

    @RequestMapping(value = "/name")

    public String getManagers(Model model) {

        System.out.println("managers");
        List<Managers_name> allManagers = managersNameService.getAllManagers();
        model.addAttribute("allManagersList", allManagers);
        System.out.println(model);
        return "redirect/options";
    }
}
