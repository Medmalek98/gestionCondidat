package com.esprit.gestioncondidat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private   Integer ID;
    private   String nom;
    private   String prenom;
    private   String email;

    public Candidat(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
}
