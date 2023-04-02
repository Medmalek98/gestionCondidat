package com.esprit.gestioncondidat;

import com.esprit.gestioncondidat.entity.Candidat;
import com.esprit.gestioncondidat.service.ICandidatService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class GestionCondidatApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionCondidatApplication.class, args);
    }
    @Bean
    ApplicationRunner start (ICandidatService candidatService){
        return args -> {
            Stream.of(new Candidat("hatem","bensalah","hatem@esprit.tn"),
                    new Candidat("Ahmed","benmohamed","ahmed@yahoo.fr")).forEach(
                            candidat -> {
                                candidatService.addCandidat(candidat);
                            }
            );
            candidatService.getAllCandidats().forEach(System.out::println);
        };
    }

}
