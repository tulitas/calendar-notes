package com.controllers;

import com.Models.JobformService;
import com.SmsMaker.SmsConnect;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class OptionsController {

    private JobformService jobformService;

    @Autowired
    public OptionsController(JobformService jobformService) {
        this.jobformService = jobformService;
    }

    @RequestMapping(value = "/options/create", method = RequestMethod.POST)
    public String options(JobForm jobForm) {
        jobformService.addJobForm(jobForm);

        return "create";
    }

    @RequestMapping(value = "/options/sms", method = RequestMethod.POST)
    public String sms() {

        SmsConnect suti = new SmsConnect();
        suti.Savienojums();


        return "/options";
    }

    private void run() {
        System.out.println("suti sms");
    }

    @RequestMapping(value = "/options")
    public String getAllByWorkdate(Model model, String workDate) {

        List<JobForm> jobForms = jobformService.getAllByWorkdate(workDate);
        model.addAttribute("optionsList", jobForms);

        List<String> inToodayCount = jobformService.getInTooday(workDate);
        List<String> notArrivedCount = jobformService.getNotArrived(workDate);
        List<String> rewritingNextDateCount = jobformService.getRewNextDate(workDate);
        List<String> performedCount = jobformService.getPerformed(workDate);
        List<String> arrivedCount = jobformService.getArrived(workDate);



        model.addAttribute("inTooday", inToodayCount);
        model.addAttribute("performed", performedCount);
        model.addAttribute("rewNextDate", rewritingNextDateCount);
        model.addAttribute("notArrived", notArrivedCount);
        model.addAttribute("arrived", arrivedCount);
            return "/options";

    }

    @RequestMapping(value = "/options/delete{id}", method = RequestMethod.GET)
    public String removeJobform(@PathVariable("id") long id) {
        jobformService.removeJobForm(id);
        return "/options";
    }



    @RequestMapping(value = "/options/getstatistics")
    public String getStatistics(Model model, String date2) {

        String stat = jobformService.getStatistics(date2);
        String remont = jobformService.getRemont(date2);
        String snjatie = jobformService.getSnjatie(date2);
        String minibasic = jobformService.getMinibasic(date2);
        String minibasicpluss = jobformService.getMinibasicpluss(date2);
        String optimum = jobformService.getOptimum(date2);
        String mini = jobformService.getMini(date2);
        String premium = jobformService.getPremium(date2);
        String pmapon = jobformService.getMapon(date2);
        String igla = jobformService.getIgla(date2);
        String citaiekarta = jobformService.getCitaiekarta(date2);
        Integer summa = jobformService.getSumma(date2);


        model.addAttribute("citaiekarta", citaiekarta);
        model.addAttribute("igla", igla);
        model.addAttribute("mapon", pmapon);
        model.addAttribute("premium", premium);
        model.addAttribute("mini", mini);
        model.addAttribute("optimum", optimum);
        model.addAttribute("minibasicpluss", minibasicpluss);
        model.addAttribute("minibasic", minibasic);
        model.addAttribute("statlist", stat);
        model.addAttribute("remontList", remont);
        model.addAttribute("snjatieList", snjatie);
        model.addAttribute("summa", summa);

        String remminibasic = jobformService.getRemminibasic(date2);
        String remminibasicplus = jobformService.getRemminibasicplus(date2);
        String remoptimum = jobformService.getRemoptimum(date2);
        String remmini = jobformService.getRemmini(date2);
        String rempremium = jobformService.getRempremium(date2);
        String remmapon = jobformService.getRemmapon(date2);
        String remigla = jobformService.getRemigla(date2);
        String remcitaiekarta = jobformService.getRemcitaiekarta(date2);
        String upgrades = jobformService.getUpgrades(date2);

        model.addAttribute("upgardes", upgrades);
        model.addAttribute("remmini", remmini);
        model.addAttribute("remminibasic", remminibasic);
        model.addAttribute("remminibasicplus", remminibasicplus);
        model.addAttribute("remoptimum", remoptimum);
        model.addAttribute("rempremium", rempremium);
        model.addAttribute("remmapon", remmapon);
        model.addAttribute("remigla", remigla);
        model.addAttribute("remcitaiekarta", remcitaiekarta);
        return "statistics";

    }


    @RequestMapping(value = "/options/edit{id}", method = RequestMethod.GET)
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        List<JobForm> jobFormList = jobformService.findById(id);
        model.addAttribute("user", jobFormList);
        return "edit";
    }

    @RequestMapping(value = "/options/edit{id}", method = RequestMethod.POST)
    public String updateUser(@PathVariable("id") long id, @Valid JobForm jobForm, BindingResult result, Model model) {
        System.out.println("update jobform " + model);
        if (result.hasErrors()) {
            jobForm.setId(id);

            return "addnew";
        }

        jobformService.addJobForm(jobForm);
        model.addAttribute("users", jobformService.findById(id));
        return "addnew";
    }

}






