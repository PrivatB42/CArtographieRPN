package com.esatic.cartographieprn.service;

import com.esatic.cartographieprn.model.Programme;
import com.esatic.cartographieprn.model.Utilisateur;
import com.esatic.cartographieprn.repository.ProgrammeRepository;
import com.esatic.cartographieprn.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    private UtilisateurRepository repo;


    public void saveuser(Utilisateur utilisateur){
        repo.save(utilisateur);
    }

    public List<Utilisateur> listutilisateur(){
        return repo.findAll();
    }

    public Utilisateur getutilisateur(int id){
        Optional<Utilisateur> utilisateur = Optional.of(repo.findById(id).orElseThrow());
        return utilisateur.get();
    }

}
