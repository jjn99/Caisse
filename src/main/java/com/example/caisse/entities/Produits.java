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
    private Integer Id;
    private String codeproduct;
    private Integer price;
    private int quantity;
    private String typeproduct;
    private String description;
    private Integer idreaprovisionnement;
    private String libelle;
}
