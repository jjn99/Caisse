package com.example.caisse.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepenseVente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String ID;
    private String libelle;
    private float montantEntrants;
    private float montantSortants;
    private String beneficiaires;
    private String adresse;
    private Date date ;
}
