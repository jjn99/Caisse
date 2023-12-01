package com.example.caisse.dao.interfaces;

import com.example.caisse.entities.Decompte;
import lombok.NonNull;

import java.util.List;

public interface IDecompteDao {
    public Decompte findById(@NonNull Integer Id);
    public List<Decompte> findByType(@NonNull String type);
    public List<Decompte> findByIdCaisse(@NonNull Integer Id);
    public List<Decompte> findAll();
    public boolean save(@NonNull Decompte decompte);
    public boolean update(@NonNull Decompte decompte);
    public boolean delete(@NonNull Integer Id);

}
