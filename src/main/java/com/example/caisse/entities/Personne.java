package com.example.caisse.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String ID;
    private String nom;
    private String prenom;
    private String telephone;
}
