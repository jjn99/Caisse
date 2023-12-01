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
    private Integer Id;
    private String libelle;
    private Integer montant;
    private String beneficiaires;
    private String adresse;
    private String  date ;
}
