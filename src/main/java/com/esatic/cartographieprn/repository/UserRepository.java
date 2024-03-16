package com.esatic.cartographieprn.repository;

import com.esatic.cartographieprn.model.Userp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Userp, Integer> {

    Userp getUserpByNom(String nom);

    Userp getUserpsByMail(String mail);
}
