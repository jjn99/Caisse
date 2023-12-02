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
        return new DepenseReaprovisionnement(
                result.getInt(1),
                result.getString(2),
                result.getInt(3),
                result.getString(4),
                result.getString(5),
                result.getString(6),
                result.getInt(7),
                result.getString(8));
    }

    @Override
    public List<DepenseReaprovisionnement> finsByIdCaisse(@NonNull Integer id) {
        var Query = QueriesDepenseReaprovisionnement.SELECT_ID_CAISSE.getQuery();
        List<DepenseReaprovisionnement> depenseReaprovisionnement = new ArrayList();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            var result = statement.executeQuery();
            while( result.next() ){
                depenseReaprovisionnement.add( createInstance(result) );
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return depenseReaprovisionnement;
    }

    @Override
    public List<DepenseReaprovisionnement> finsByCaisse(@NonNull Integer id) {
        var Query = QueriesDepenseReaprovisionnement.SELECT_CAISSE.getQuery();
        List<DepenseReaprovisionnement> depenseReaprovisionnement = new ArrayList();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            var result = statement.executeQuery();
            while( result.next() ){
                depenseReaprovisionnement.add( createInstance(result) );
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return depenseReaprovisionnement;
    }

    @Override
    public List<DepenseReaprovisionnement> findAll() {
        var Query = QueriesDepenseReaprovisionnement.SELECT_ALL.getQuery();
        List<DepenseReaprovisionnement> depenseReaprovisionnements = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            var result = statement.executeQuery();
            while( result.next() ){
                depenseReaprovisionnements.add( createInstance(result) );
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
    public DepenseReaprovisionnement findById(@NonNull Integer Id) {
        var Query = QueriesDepenseReaprovisionnement.SELECT_ID.getQuery();
        DepenseReaprovisionnement depenseReaprovisionnement = null;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,Id);
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
            while( result.next() ){
                depenseReaprovisionnements.add( createInstance(result) );
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return depenseReaprovisionnements;
    }

    @Override
    public boolean add(DepenseReaprovisionnement newDepenseReaprovision) {
        var Query = QueriesDepenseReaprovisionnement.INSERT_SIMPLE.getQuery();
        boolean f=false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, newDepenseReaprovision.getLibelle());
            statement.setInt(2, newDepenseReaprovision.getMontant());
            statement.setString(3, newDepenseReaprovision.getBeneficiaires());
            statement.setString(4, newDepenseReaprovision.getAdresse());
            statement.setString(5, newDepenseReaprovision.getDate());
            statement.setInt(6, newDepenseReaprovision.getIdcaisse());
            statement.setString(7, newDepenseReaprovision.getTypedepense());
           int i= statement.executeUpdate();
           if (i == 1){
               f = true;
           }
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean update(DepenseReaprovisionnement oldDepenseRe) {
        var Query = QueriesDepenseReaprovisionnement.UPDATE_SIMPLE.getQuery();
        boolean f = false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, oldDepenseRe.getId());
            statement.setString(2, oldDepenseRe.getLibelle());
            statement.setInt(3, oldDepenseRe.getMontant());
            statement.setString(4, oldDepenseRe.getBeneficiaires());
            statement.setString(5, oldDepenseRe.getAdresse());
            statement.setString(6, oldDepenseRe.getDate());
            statement.setInt(7, oldDepenseRe.getIdcaisse());
            statement.setString(8, oldDepenseRe.getTypedepense());
            int i = statement.executeUpdate();
            if (i == 1){
                f=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean delete(@NonNull Integer id) {
        var Query = QueriesDepenseReaprovisionnement.DELETE_SIMPLE.getQuery();
        boolean f=false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, id);
            int i=statement.executeUpdate();
            if (i == 1){
                f=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
