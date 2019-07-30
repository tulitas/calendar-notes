package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OptionsController {
    @RequestMapping("/options")
    public String options() {

        return "options";
    }
}
