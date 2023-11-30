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
public class AllimenntationArretCaisse {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id;
    private String type;
    private float montant_total;
    private Date date;
    private Integer idCaisse;
    private String commentaire;
}
