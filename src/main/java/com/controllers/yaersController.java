package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class yaersController {
    @RequestMapping("/years/2020/month/january/days/january")
    public String january2019() {

        return "years/2020/month/january/days/january";
    }

    @RequestMapping("/years/2020/month2020")
    public String month2020() {

        return "years/2020/month2020";
    }


}
