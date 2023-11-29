package com.example.caisse.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Date;

@Entity
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepenseReaprovisionnement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer ID;
    private String libelle;
    private float montant;
    private String beneficiaires;
    private String adresse;
    private Date date ;
}
