package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Yaer2022Controller {
    @RequestMapping("/years/2022/month/january/days/january")
    public String january2022() {

        return "years/2022/month/january/days/january";
    }

    @RequestMapping("/years/2022/month2022")
    public String month2022() {

        return "years/2022/month2022";
    }
    @RequestMapping("/years/2022/month/february/days/february")
    public String february2022() {

        return "years/2022/month/february/days/february";
    }
    @RequestMapping("/years/2022/month/mart/days/mart")
    public String mart2022() {

        return "years/2022/month/mart/days/mart";
    }
    @RequestMapping("/years/2022/month/april/days/april")
    public String april2022() {

        return "years/2022/month/april/days/april";
    }
    @RequestMapping("/years/2022/month/may/days/may")
    public String may2022() {

        return "years/2022/month/may/days/may";
    }
    @RequestMapping("/years/2022/month/june/days/june")
    public String june2022() {

        return "years/2022/month/june/days/june";
    }
    @RequestMapping("/years/2022/month/july/days/july")
    public String july2022() {

        return "years/2022/month/july/days/july";
    }
    @RequestMapping("/years/2022/month/august/days/august")
    public String august2022() {

        return "years/2022/month/august/days/august";
    }
    @RequestMapping("/years/2022/month/september/days/september")
    public String september2022() {

        return "years/2022/month/september/days/september";
    }
    @RequestMapping("/years/2022/month/oktober/days/oktober")
    public String oktober2022() {

        return "years/2022/month/oktober/days/oktober";
    }
    @RequestMapping("/years/2022/month/november/days/november")
    public String november2022() {

        return "years/2022/month/november/days/november";
    }
    @RequestMapping("/years/2022/month/december/days/december")
    public String december2022() {

        return "years/2022/month/december/days/december";
    }
}
