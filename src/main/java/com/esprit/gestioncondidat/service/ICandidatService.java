package com.esprit.gestioncondidat.service;

import com.esprit.gestioncondidat.entity.Candidat;

import java.util.List;

public interface ICandidatService {
    public void addCandidat(Candidat candidat);
    public List<Candidat> getAllCandidats();
    public Candidat getCandidat(Integer id);
    public void deleteCandidat(Integer id);

}
