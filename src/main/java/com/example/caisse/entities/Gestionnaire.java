package com.example.caisse.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Gestionnaire extends Personne{
    private String motdepasse;
    private String login;
    private Roles role;

    public Gestionnaire(String ID, String nom, String prenom, String telephone, String motdepasse, String login, Roles role) {
        super(ID, nom, prenom, telephone);
        this.motdepasse = motdepasse;
        this.login = login;
        this.role = role;
    }

    public enum Roles {
        GESTIONNAIRE,
        ADMIN
    }
}
