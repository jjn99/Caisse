package com.example.caisse.dao.interfaces;

import com.example.caisse.entities.DepenseVente;
import com.example.caisse.entities.Gestionnaire;
import lombok.NonNull;

import java.util.List;

public interface IDepenseDao {
    public List<DepenseVente> findByBeneficiaire(@NonNull String beneficiaire);
    public DepenseVente findById(@NonNull Integer Id);
    public List<DepenseVente> findByIdCaisse(@NonNull Integer IdCaisse);
    public void add(@NonNull DepenseVente depenseVente);
    public void update(@NonNull DepenseVente depenseVente);
    public void delete(@NonNull DepenseVente depenseVente);
}
