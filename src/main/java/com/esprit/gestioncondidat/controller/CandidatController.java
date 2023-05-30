package com.esprit.gestioncondidat.controller;

import com.esprit.gestioncondidat.entity.Candidat;
import com.esprit.gestioncondidat.service.CandidatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/apispring")
@RestController
public class CandidatController {
    @Autowired
    CandidatServiceImpl candidatService;

    @GetMapping("/getCandidat/{id}")
    public Candidat getCandiat(@PathVariable("id") Integer id){
       return candidatService.getCandidat(id);
    }

    @GetMapping("/getAllCandidat")
    public List<Candidat> getAllCandidat(){
        return candidatService.getAllCandidats();
    }

    @PostMapping("/addCandidat")
    public void addCandidat(@RequestBody Candidat candidat){
        candidatService.addCandidat(candidat);

    }
    @PostMapping("/deleteCandidat/{id}")
    public  void deleteCandidat(@PathVariable("id") Integer id){
         candidatService.deleteCandidat(id);
    }
}
