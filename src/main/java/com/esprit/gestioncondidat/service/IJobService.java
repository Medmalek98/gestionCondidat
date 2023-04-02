package com.esprit.gestioncondidat.service;

import com.esprit.gestioncondidat.entity.Job;

import java.util.List;
import java.util.Optional;

public interface IJobService {
    List<Job> afficherTousJobs();
    Optional<Job> afficherJobById(Integer id);
    void modifierEtat(Integer id,boolean disponible);
}
