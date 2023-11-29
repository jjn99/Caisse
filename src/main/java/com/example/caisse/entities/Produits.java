package com.example.caisse.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produits {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer ID;
    private String codeProduct;
    private float price;
    private int quantity;
    private String type;
    private String description;
    private Integer idReaprovisionnement;
    private String libelle;
}
