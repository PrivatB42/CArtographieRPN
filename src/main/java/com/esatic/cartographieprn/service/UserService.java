package com.esatic.cartographieprn.service;

import com.esatic.cartographieprn.model.Userp;
import com.esatic.cartographieprn.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public Userp getUserbyNom(Userp user) {
        return repo.getUserpByNom(user.getNom());
    }

    public Userp getUserMail(Userp user) {
        return repo.getUserpsByMail(user.getMail());
    }

    public void saveUser(Userp user) {
        repo.save(user);
    }

}
