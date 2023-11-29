package com.example.caisse.dao.interfaces;

import com.example.caisse.entities.DepenseReaprovisionnement;
import lombok.NonNull;

import java.util.List;

public interface IDepenseReaprovisionnementDao {

    public List<DepenseReaprovisionnement> findAll();

    public List<DepenseReaprovisionnement> findByLibelle(@NonNull String libelle);

    public DepenseReaprovisionnement findById(@NonNull Integer id);

    public List<DepenseReaprovisionnement> findByBeneficiaire(@NonNull String Beneficiaire);

    public void add(DepenseReaprovisionnement newDepenseReaprovision);

    public void update(DepenseReaprovisionnement oldDepenseRe);

//    public void updateMontant(@NonNull float newMontant, @NonNull Integer id);

    public void delete(@NonNull Integer id);

}
