package com.esatic.cartographieprn.Controller;

import com.esatic.cartographieprn.Controller.Interface.ProgrammeInterface;
import com.esatic.cartographieprn.model.Programme;
import com.esatic.cartographieprn.model.Utilisateur;
import com.esatic.cartographieprn.service.ProgrammeService;
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
        return "index";
    }

    @Override
    public String ListeProgrammesPP(Model model) {
        List<Programme> programmeList = service.getProgrammes();
        model.addAttribute("programmes", programmeList);
        model.addAttribute("utilisateur", new Utilisateur());
        return "programs";
    }

    @Override
    public void SaveProgramme(Programme programmes) {
        service.save(programmes);
    }

    @Override
    public String ListeProgrammeMocle(String Mocle, Model model) {
        List<Programme> pmcle = service.getparmotcle(Mocle);
        model.addAttribute("programmes", pmcle);
        model.addAttribute("utilisateur", new Utilisateur());
        return "programs";
    }

    @Override
    public String listepardomaine(Utilisateur utilisateur){
        List<Programme> programmes = service.programmesrech(utilisateur.getDomaineinteret());
        return "programs";
    }


}
