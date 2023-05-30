package com.esprit.gestioncondidat.repository;

import com.esprit.gestioncondidat.entity.Candidat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatRepository extends CrudRepository<Candidat,Integer> {

  
}
