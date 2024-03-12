package com.esatic.cartographieprn.repository;

import com.esatic.cartographieprn.model.Programme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgrammeRepository extends JpaRepository<Programme, Integer> {

    List<Programme> findByTitreContaining(String motCle);
    List<Programme> findByDomaine(String domaine);

}
