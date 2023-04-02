package com.esprit.gestioncondidat.service;

import com.esprit.gestioncondidat.entity.Job;
import com.esprit.gestioncondidat.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JobServiceImpl implements IJobService{
    @Autowired
    JobRepository jobRepository;
    @Override
    public List<Job> afficherTousJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Optional<Job> afficherJobById(Integer id) {
        return jobRepository.findById(id);
    }

    @Override
    public void modifierEtat(Integer id,boolean disponible) {
       jobRepository.findById(id).get().setEtat(disponible);
    }
}
