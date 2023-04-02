package com.esprit.gestioncondidat.controller;

import com.esprit.gestioncondidat.entity.Job;
import com.esprit.gestioncondidat.service.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {
    @Autowired
    JobServiceImpl jobService;
    @GetMapping("/afficherJobById/{id}")
    public Optional<Job> afficherJobById(@PathVariable("id") Integer id){
        return jobService.afficherJobById(id);
    }

    @PostMapping("/afficherTousJobs")
    List<Job> afficherTousJobs(){
       return jobService.afficherTousJobs();

    }
}
