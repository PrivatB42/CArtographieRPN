package com.esatic.cartographieprn.Controller.Interface;

import com.esatic.cartographieprn.model.Programme;
import com.esatic.cartographieprn.model.Utilisateur;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public interface ProgrammeInterface {

    @GetMapping("/programme/liste")
    String ListeProgrammes(Model model);
    @PostMapping("/programme/save")
    void SaveProgramme(Programme programmes);
    @GetMapping("/programmepp/liste")
    String ListeProgrammesPP(Model model);
    @GetMapping("/programme/{mocle}")
    String ListeProgrammeMocle(@PathVariable String Mocle, Model model);
    @PostMapping("/programme/pardomaine")
    String listepardomaine(Utilisateur utilisateur);

}
