package com.controllers;

import java.util.Collections;
import java.util.Date;

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
    @RequestMapping(value = {"/year2019"})
    public String viewYear2019()  {
        return "year2019";
    }

    //    @RequestMapping
//    public ModelAndView year2019() {
//        return new ModelAndView("year2019", Collections.singletonMap("reviews", reviewRepository.findAll()));
//    }
//    @RestController
//    public class YearsController {
//        @RequestMapping("/")
//        public String year2019() {
//            return "hello";
//        }
//    }

    @RequestMapping(method = RequestMethod.POST)
    public String createReview(@RequestParam String reviewText) {
        reviewRepository.save(new Review(reviewText, new Date()));

        return "redirect:/";
    }
}
