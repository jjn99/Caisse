package com.example.caisse.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

@Entity
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProduitVendu {
   @jakarta.persistence.Id
   @GeneratedValue(strategy = GenerationType.UUID)
   private Integer Id;
   private Integer idproduit;
   private Integer idvente;
   private Integer quantite;
}
