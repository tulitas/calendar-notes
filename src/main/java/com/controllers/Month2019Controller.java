package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Month2019Controller {
  @RequestMapping("/january2019")
  public String january2019() {

    return "january2019";
  }

  @RequestMapping("/month/february/february2019")
  public String february2019() {

    return "/month/february/february2019";
  }


}