package com.esatic.cartographieprn.service;

import com.esatic.cartographieprn.model.Programme;
import com.esatic.cartographieprn.repository.ProgrammeRepository;
import com.esatic.cartographieprn.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProgrammeService {

    private ProgrammeRepository repo;


    public ProgrammeService(ProgrammeRepository repo) {
        this.repo = repo;
    }

    public void save(Programme programme){
        repo.save(programme);
    }

    public List<Programme> getProgrammes() {
        return repo.findAll();
    }

    public Programme getprogramme(int id){
        Optional<Programme> programme = Optional.of(repo.findById(id).orElseThrow());
        return programme.get();
    }

    public List<Programme> getparmotcle(String mocle) {
        return repo.findByTitreContaining(mocle);
    }

    public void delete(Programme programme){
        repo.delete(programme);
    }

    public List<Programme> programmesrech(String domaine){
        if (domaine != null)
            repo.findByDomaine(domaine);
        else
            System.out.println("le champs de saisi domaine est vide");
        return repo.findByDomaine(domaine);
    }

}
