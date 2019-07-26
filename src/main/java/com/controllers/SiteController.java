package com.controllers;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

import com.entities.Review;
import com.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SiteController {

    @Autowired
    private ReviewRepository reviewRepository;

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("site/index", Collections.singletonMap("reviews", reviewRepository.findAll()));
    }
    @RequestMapping("/year2019")
    public String next() {

        return "year2019";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String createReview(@RequestParam String reviewText) {
        reviewRepository.save(new Review(reviewText, new Date()));

        return "redirect:/";
    }
}
