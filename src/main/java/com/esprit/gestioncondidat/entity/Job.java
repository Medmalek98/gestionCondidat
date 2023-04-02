package com.esprit.gestioncondidat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private   Integer ID;
    private   String Service;
    private   Boolean Etat;
}
