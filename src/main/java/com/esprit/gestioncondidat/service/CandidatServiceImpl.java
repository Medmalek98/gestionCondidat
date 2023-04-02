package com.esprit.gestioncondidat.service;

import com.esprit.gestioncondidat.entity.Candidat;
import com.esprit.gestioncondidat.repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidatServiceImpl implements ICandidatService{
    @Autowired
    CandidatRepository candidatRepository;
    @Override
    public void addCandidat(Candidat candidat) {
        candidatRepository.save(candidat);
    }

    @Override
    public List<Candidat> getAllCandidats() {
        return (List<Candidat>) candidatRepository.findAll();
    }

    @Override
    public Candidat getCandidat(Integer id) {
        return candidatRepository.findById(id).get();
    }

    @Override
    public void deleteCandidat(Integer id) {
         candidatRepository.deleteById(id);
    }
}
