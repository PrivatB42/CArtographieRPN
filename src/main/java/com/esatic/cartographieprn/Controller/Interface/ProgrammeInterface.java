package com.esatic.cartographieprn.Controller.Interface;

import com.esatic.cartographieprn.model.Programme;
import com.esatic.cartographieprn.model.Utilisateur;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public interface ProgrammeInterface {

    @GetMapping("/")
    String ListeProgrammes(Model model);
    @PostMapping("/programme/save")
    String SaveProgramme(Programme programmes);
    @GetMapping("/programmepp/liste")
    String ListeProgrammesPP(Model model);
    @GetMapping("/programme/{mocle}")
    String ListeProgrammeMocle(@PathVariable String Mocle, Model model);
    @PostMapping("/programme/pardomaine")
    String listepardomaine(Utilisateur utilisateur, Model model);
    @GetMapping("/enregistrement")
    String saveprogramme(Model model);
    @GetMapping("/apropos")
    String apropospage();
    @GetMapping("/service")
    String servicepage();
    @GetMapping("/contact")
    String contactpage();
    @GetMapping("/dashboard")
    String dashboard();

}
