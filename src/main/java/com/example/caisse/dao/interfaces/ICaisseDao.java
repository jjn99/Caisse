package com.example.caisse.dao.interfaces;

import com.example.caisse.entities.Caisse;
import com.example.caisse.entities.Gestionnaire;
import lombok.NonNull;

import java.util.List;

public interface ICaisseDao {
    public Caisse findByLibelle(@NonNull String libelle);
    public Caisse findById(@NonNull Integer id);
    public List<Caisse> findAll();

    public boolean save(@NonNull Caisse caisse);

    public boolean update(@NonNull Caisse caisse);

    public boolean delete(@NonNull Integer Id);
}
