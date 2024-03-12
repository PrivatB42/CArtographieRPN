package com.esatic.cartographieprn.Controller.Interface;

import com.esatic.cartographieprn.model.Programme;
import com.esatic.cartographieprn.model.Utilisateur;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProgrammeInterface {

    String ListeProgrammes(Model model);
    void SaveProgramme(Programme programmes);
    String ListeProgrammesPP(Model model);
    String ListeProgrammeMocle(@PathVariable String Mocle, Model model);
    public String listepardomaine(Utilisateur utilisateur);

}
