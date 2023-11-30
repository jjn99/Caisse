package com.example.caisse.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Gestionnaire{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer Id;
    private String nom;
    private String prenom;
    private String telephone;
    private String motdepasse;
    private String login;

    public Gestionnaire(String nom, String prenom, String telephone, String password, String login) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.motdepasse = password;
        this.login = login;
    }

    public enum Roles {
        GESTIONNAIRE,
        ADMIN
    }
}
