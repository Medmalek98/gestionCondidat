package com.esprit.gestioncondidat.controller;

import com.esprit.gestioncondidat.entity.Candidat;
import com.esprit.gestioncondidat.service.CandidatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CandidatController {
    @Autowired
    CandidatServiceImpl candidatService;

    @GetMapping("/getCandidat/{id}")
    public Candidat getCandiat(@PathVariable("id") Integer id){
       return candidatService.getCandidat(id);
    }

    @PostMapping("/addCandidat")
    public void addCandidat(@RequestBody Candidat candidat){
        candidatService.addCandidat(candidat);

    }
}
