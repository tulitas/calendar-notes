package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Yaer2020Controller {
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
    @RequestMapping("/years/2020/month/mart/days/mart")
    public String mart2020() {

        return "years/2020/month/mart/days/mart";
    }
    @RequestMapping("/years/2020/month/april/days/april")
    public String april2020() {

        return "years/2020/month/april/days/april";
    }
    @RequestMapping("/years/2020/month/may/days/may")
    public String may2020() {

        return "years/2020/month/may/days/may";
    }
    @RequestMapping("/years/2020/month/june/days/june")
    public String june2020() {

        return "years/2020/month/june/days/june";
    }
    @RequestMapping("/years/2020/month/july/days/july")
    public String july2020() {

        return "years/2020/month/july/days/july";
    }
    @RequestMapping("/years/2020/month/august/days/august")
    public String august2020() {

        return "years/2020/month/august/days/august";
    }
    @RequestMapping("/years/2020/month/september/days/september")
    public String september2020() {

        return "years/2020/month/september/days/september";
    }
    @RequestMapping("/years/2020/month/oktober/days/oktober")
    public String oktober2020() {

        return "years/2020/month/oktober/days/oktober";
    }
    @RequestMapping("/years/2020/month/november/days/november")
    public String november2020() {

        return "years/2020/month/november/days/november";
    }
    @RequestMapping("/years/2020/month/december/days/december")
    public String december2020() {

        return "years/2020/month/december/days/december";
    }
}
