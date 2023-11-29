package com.example.caisse.dao.interfaces;

import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.entities.Produits;
import lombok.NonNull;

import java.util.List;

public interface IProduitsDao {
    public List<Produits> findByLibelle(@NonNull String libelle);
public Produits findByCodeProduit(@NonNull String codeProduit);
    public List<Produits> findByType(@NonNull String type);
    public List<Produits> findAll();
    public Produits findByID(@NonNull Integer idProduits);
    public List<Produits> findByIdReapro(@NonNull Integer idReapro);
    public void save(@NonNull Produits produits);
    public void update(@NonNull Produits produits);
//    public void updatePrix(@NonNull float newPrice,@NonNull Integer id);
//    public void updateQuantity(@NonNull Integer id,@NonNull int quantity);
    public void delete(@NonNull Integer idProduits);
}
