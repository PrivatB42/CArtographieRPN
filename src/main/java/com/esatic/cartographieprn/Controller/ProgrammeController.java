package com.esatic.cartographieprn.Controller;

import com.esatic.cartographieprn.Controller.Interface.ProgrammeInterface;
import com.esatic.cartographieprn.model.Programme;
import com.esatic.cartographieprn.model.Utilisateur;
import com.esatic.cartographieprn.service.ProgrammeService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ProgrammeController implements ProgrammeInterface {

    private ProgrammeService service;

    public ProgrammeController(ProgrammeService service) {
        this.service = service;
    }

    @Override
    public String ListeProgrammes(Model model) {
        List<Programme> programmeList = service.getProgrammes();
        model.addAttribute("programmes", programmeList);
        System.out.println("liste des programmes: " + programmeList);
        return "index";
    }

    @Override
    public String ListeProgrammesPP(Model model) {
        List<Programme> programmeList = service.getProgrammes();
        model.addAttribute("programmes", programmeList);
        model.addAttribute("utilisateur", new Utilisateur());
        System.out.println("liste des programmes: pp  " + programmeList);
        return "programs";
    }

    @Override
    public String SaveProgramme(Programme programme) {
        System.out.println("Saving--- "+ programme);
        service.save(programme);
        return "redirect:/programmepp/liste";
    }

    @Override
    public String ListeProgrammeMocle(String Mocle, Model model) {
        List<Programme> pmcle = service.getparmotcle(Mocle);
        model.addAttribute("programmes", pmcle);
        model.addAttribute("utilisateur", new Utilisateur());
        return "programs";
    }

    @Override
    public String listepardomaine(Utilisateur utilisateur, Model model) {
        List<Programme> programmes = service.programmesrech(utilisateur.getDomaineinteret());
        model.addAttribute("programmes", programmes);
        model.addAttribute("utilisateur", new Utilisateur());
        System.out.println("utilisateur ------------- " + utilisateur.getDomaineinteret());
        System.out.println("programmes ------------- " + programmes);
        return "programs";
    }

    @Override
    public void programmeid(int id, Model model) {
        Programme programme = service.getprogramme(id);
        System.out.println("programme ------------- " + programme);
        model.addAttribute("programme", new Programme());
    }
    @Override
    public String saveprogramme(Model model){
        model.addAttribute("programme", new Programme());
        return "dashboard01";
    }

    @Override
    public String apropospage(){
        return "about";
    }

    @Override
    public String servicepage(){
        return "services";
    }

    @Override
    public String contactpage(){
        return "contact";
    }

    @Override
    public String dashboard(){
        return "dashboard02";
    }
}
