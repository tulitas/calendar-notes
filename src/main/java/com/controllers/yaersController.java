package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class yaersController {
    @RequestMapping("/years/2020/month/january/days/january")
    public String january2020() {

        return "years/2020/month/january/days/january";
    }

    @RequestMapping("/years/2020/month2020")
    public String month2020() {

        return "years/2020/month2020";
    }
    @RequestMapping("/years/2020/month/february/days/february")
    public String february2020() {

        return "years/2020/month/february/days/february";
    }

}
