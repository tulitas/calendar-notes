package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Yaer2021Controller {
    @RequestMapping("/years/2021/month/january/days/january")
    public String january2021() {

        return "years/2021/month/january/days/january";
    }

    @RequestMapping("/years/2021/month2021")
    public String month2021() {

        return "years/2021/month2021";
    }
    @RequestMapping("/years/2021/month/february/days/february")
    public String february2021() {

        return "years/2021/month/february/days/february";
    }
    @RequestMapping("/years/2021/month/mart/days/mart")
    public String mart2021() {

        return "years/2021/month/mart/days/mart";
    }
    @RequestMapping("/years/2021/month/april/days/april")
    public String april2021() {

        return "years/2021/month/april/days/april";
    }
    @RequestMapping("/years/2021/month/may/days/may")
    public String may2021() {

        return "years/2021/month/may/days/may";
    }
    @RequestMapping("/years/2021/month/june/days/june")
    public String june2021() {

        return "years/2021/month/june/days/june";
    }
    @RequestMapping("/years/2021/month/july/days/july")
    public String july2021() {

        return "years/2021/month/july/days/july";
    }
    @RequestMapping("/years/2021/month/august/days/august")
    public String august2021() {

        return "years/2021/month/august/days/august";
    }
    @RequestMapping("/years/2021/month/september/days/september")
    public String september2021() {

        return "years/2021/month/september/days/september";
    }
    @RequestMapping("/years/2021/month/oktober/days/oktober")
    public String oktober2021() {

        return "years/2021/month/oktober/days/oktober";
    }
    @RequestMapping("/years/2021/month/november/days/november")
    public String november2021() {

        return "years/2021/month/november/days/november";
    }
    @RequestMapping("/years/2021/month/december/days/december")
    public String december2021() {

        return "years/2021/month/december/days/december";
    }
}
