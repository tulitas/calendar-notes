package com.controllers;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

import com.entities.JobForm;
import com.entities.JobForm;
import com.repositories.JobformDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SiteController {

//    @Autowired
//    private JobForm jobForm;

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
