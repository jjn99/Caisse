package com.example.caisse.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id;
    private String libelle;
    private boolean actif;
    private Integer montants;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public Integer getMontants() {
        return montants;
    }

    public void setMontants(Integer montants) {
        this.montants = montants;
    }
}
