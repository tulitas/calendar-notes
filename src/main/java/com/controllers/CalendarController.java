package com.controllers;

import com.Models.CalendarDay;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/calendar")
public class CalendarController {
  @RequestMapping(value = {"/month", "/month/{month}"})
  public String month(Model model, @PathVariable(required = false) YearMonth month) {
    if (month == null) {
      month = YearMonth.now();
    }

    LocalDate end = month.atEndOfMonth();
    List<CalendarDay> days = new ArrayList<>();

    int startDay = month.atDay(1).getDayOfWeek().getValue();
    if (startDay > 1) {
      for (int i = 1; i < startDay; i++) {
        days.add(new CalendarDay());
      }
    }

    for (int i = 1; i <= end.getDayOfMonth(); i++) {
      days.add(new CalendarDay(i, month.atDay(i).toString(), "something " + i));
    }

    model.addAttribute("month", month.format(DateTimeFormatter.ofPattern("MMMM")));
    model.addAttribute("previousMonth", month.minusMonths(1L));
    model.addAttribute("nextMonth", month.plusMonths(1L));
    model.addAttribute("year", month.format(DateTimeFormatter.ofPattern("yyyy")));
    model.addAttribute("days", days);
    return "month";
  }

  @RequestMapping(value = {"/year", "/year/{year}"})
  public String year(Model model, @PathVariable(required = false) Year year) {
    if (year == null) {
      year = Year.now();
    }

    List<YearMonth> months = new ArrayList<>();
    for (int i = 1; i < 13; i++) {
      months.add(year.atMonth(i));
    }

    model.addAttribute("year", year);
    model.addAttribute("months", months);
    return "year";
  }
}
