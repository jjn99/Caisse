package com.example.caisse.dao.impl;

import com.example.caisse.dao.interfaces.IDepenseReaprovisionnementDao;
import com.example.caisse.entities.DepenseReaprovisionnement;
import com.example.caisse.entities.Produits;
import com.example.caisse.utils.DBConnection;
import com.example.caisse.utils.Queries.QueriesDepenseReaprovisionnement;
import com.example.caisse.utils.Queries.QueriesProduits;
import lombok.NonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DepenseReaprovisionnementDao implements IDepenseReaprovisionnementDao {

    private final Connection connection = DBConnection.loadDataBase();

    public DepenseReaprovisionnement createInstance(ResultSet result) throws SQLException {
        return new DepenseReaprovisionnement(result.getInt(1), result.getString(2),
                result.getFloat(3), result.getString(4),
                result.getString(5), result.getDate(6));
    }

    public List<DepenseReaprovisionnement> createListInstance(ResultSet result) throws SQLException {
        List<DepenseReaprovisionnement> depenseReaprovisionnements = new ArrayList<>();
        for(int i = 0; i < result.getFetchSize(); i++) {
            depenseReaprovisionnements.add(createInstance(result));
        }
        return depenseReaprovisionnements;
    }
    @Override
    public List<DepenseReaprovisionnement> findAll() {
        var Query = QueriesDepenseReaprovisionnement.SELECT_ALL.getQuery();
        List<DepenseReaprovisionnement> depenseReaprovisionnements = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            var result = statement.executeQuery();
            if(result.next()) {
                depenseReaprovisionnements = createListInstance(result);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return depenseReaprovisionnements;
    }

    @Override
    public List<DepenseReaprovisionnement> findByLibelle(@NonNull String libelle) {
        var Query = QueriesDepenseReaprovisionnement.SELECT_WHERE.getQuery();
        return getDepenseReaprovisionnements(libelle, Query);
    }

    @Override
    public DepenseReaprovisionnement findById(@NonNull Integer id) {
        var Query = QueriesDepenseReaprovisionnement.SELECT_ID.getQuery();
        DepenseReaprovisionnement depenseReaprovisionnement = null;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            var result = statement.executeQuery();
            if(result.next()) {
                depenseReaprovisionnement = createInstance(result);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return depenseReaprovisionnement;
    }

    @Override
    public List<DepenseReaprovisionnement> findByBeneficiaire(@NonNull String Beneficiaire) {
        var Query = QueriesDepenseReaprovisionnement.SELECT_BENEFICIAIRE.getQuery();
        return getDepenseReaprovisionnements(Beneficiaire, Query);
    }

    private List<DepenseReaprovisionnement> getDepenseReaprovisionnements(@NonNull String Beneficiaire, String query) {
        List<DepenseReaprovisionnement> depenseReaprovisionnements = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,Beneficiaire);
            var result = statement.executeQuery();
            if(result.next()) {
                depenseReaprovisionnements = createListInstance(result);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return depenseReaprovisionnements;
    }

    @Override
    public void add(DepenseReaprovisionnement newDepenseReaprovision) {
        var Query = QueriesDepenseReaprovisionnement.INSERT_SIMPLE.getQuery();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, newDepenseReaprovision.getLibelle());
            statement.setFloat(2, newDepenseReaprovision.getMontant());
            statement.setString(3, newDepenseReaprovision.getBeneficiaires());
            statement.setString(4, newDepenseReaprovision.getAdresse());
            statement.setDate(5, newDepenseReaprovision.getDate());
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(DepenseReaprovisionnement oldDepenseRe) {
        var Query = QueriesDepenseReaprovisionnement.UPDATE_SIMPLE.getQuery();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, oldDepenseRe.getID());
            statement.setString(2, oldDepenseRe.getLibelle());
            statement.setFloat(3, oldDepenseRe.getMontant());
            statement.setString(4, oldDepenseRe.getBeneficiaires());
            statement.setString(5, oldDepenseRe.getAdresse());
            statement.setDate(6, oldDepenseRe.getDate());
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(@NonNull Integer id) {
        var Query = QueriesDepenseReaprovisionnement.DELETE_SIMPLE.getQuery();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, id);
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
