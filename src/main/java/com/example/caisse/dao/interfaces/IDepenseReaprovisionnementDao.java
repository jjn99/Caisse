package com.example.caisse.dao.interfaces;

import com.example.caisse.entities.DepenseReaprovisionnement;
import lombok.NonNull;

import java.util.List;

public interface IDepenseReaprovisionnementDao {
    public  List<DepenseReaprovisionnement> finsByIdCaisse(@NonNull Integer id);

    public  List<DepenseReaprovisionnement> finsByCaisse(@NonNull Integer id);

    public List<DepenseReaprovisionnement> findAll();

    public List<DepenseReaprovisionnement> findByLibelle(@NonNull String libelle);

    public DepenseReaprovisionnement findById(@NonNull Integer Id);

    public List<DepenseReaprovisionnement> findByBeneficiaire(@NonNull String Beneficiaire);

    public boolean add(DepenseReaprovisionnement newDepenseReaprovision);

    public boolean update(DepenseReaprovisionnement oldDepenseRe);

    public boolean delete(@NonNull Integer id);

}
