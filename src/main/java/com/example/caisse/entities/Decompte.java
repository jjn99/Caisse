package com.example.caisse.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@ToString
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Decompte {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer Id;
    private String type;
    private Integer nb10000;
    private Integer nb5000;
    private Integer nb2000;
    private Integer nb1000;
    private Integer nb500;
    private Integer nb250;
    private Integer nb200;
    private Integer nb100;
    private Integer nb50;
    private Integer nb25;
    private Integer montanttotal;
    private Integer idcaisse;
}
