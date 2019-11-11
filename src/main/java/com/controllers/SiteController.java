package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SiteController {

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("site/index");
    }

    @RequestMapping("/year2019")
    public String year2019() {

        return "year2019";
    }

//    @RequestMapping("/february2019")
//    public String february2019() {
//
//        return "february2019";
//    }
//
//
//    @RequestMapping("/january2019")
//    public String january2019() {
//
//        return "january2019";
//    }


//    @RequestMapping(method = RequestMethod.POST)
//    public String createReview(@RequestParam String reviewText) {
//        reviewRepository.save(new Review(reviewText, new Date()));
//
//        return "redirect:/";
//    }
}
