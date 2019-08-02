package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class OptionsController {
    @RequestMapping(value = "/options", method = RequestMethod.POST)
    public String options() {

        return "options";
    }
}
