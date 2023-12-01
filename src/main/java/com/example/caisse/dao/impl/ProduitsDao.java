package com.example.caisse.dao.impl;

import com.example.caisse.dao.interfaces.IProduitsDao;
import com.example.caisse.entities.Produits;
import com.example.caisse.utils.DBConnection;
import com.example.caisse.utils.Queries.QueriesProduits;
import lombok.NonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProduitsDao implements IProduitsDao {

    private final Connection connection = DBConnection.loadDataBase();

    public Produits createInstance(ResultSet result) throws SQLException {
        return new Produits(
                result.getInt(1),
                result.getString(2),
                result.getInt(3),
                result.getInt(4),
                result.getString(5),
                result.getString(6),
                result.getInt(7),
                result.getString(8));
    }

    @Override
    public List<Produits> findByLibelle(@NonNull String libelle) {
        var Query = QueriesProduits.SELECT_LIBELLE.getQuery();
        return getProduits(libelle, Query);
    }

    @Override
    public Produits findByCodeProduit(@NonNull String codeProduit) {
        var Query = QueriesProduits.SELECT_WHERE.getQuery();
        Produits produits = null;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1,codeProduit);
            var result = statement.executeQuery();
            if(result.next()) {
                produits = createInstance(result);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return produits;
    }

    @Override
    public List<Produits> findByType(@NonNull String type) {
        var Query = QueriesProduits.SELECT_TYPE.getQuery();
        return getProduits(type, Query);
    }

    private List<Produits> getProduits(@NonNull String type, String query) {
        List<Produits> produits = null;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,type);
            var result = statement.executeQuery();
            while( result.next() ){
                produits.add( createInstance(result) );
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return produits;
    }

    @Override
    public List<Produits> findAll() {
        var Query = QueriesProduits.SELECT_ALL.getQuery();
        List<Produits> produits = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            var result = statement.executeQuery();
            while( result.next() ){
                produits.add( createInstance(result) );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return produits;
    }

    @Override
    public Produits findByID(@NonNull Integer idProduits) {
        var Query = QueriesProduits.SELECT_ID.getQuery();
        Produits produits = null;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,idProduits);
            var result = statement.executeQuery();
            if(result.next()) {
                produits = createInstance(result);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return produits;
    }

    @Override
    public List<Produits> findByIdReapro(@NonNull Integer idReapro) {
        var Query = QueriesProduits.SELECT_IDREAPRO.getQuery();
        List<Produits> produits = null;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,idReapro);
            var result = statement.executeQuery();
            while( result.next() ){
                produits.add( createInstance(result) );
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return produits;
    }

    @Override
    public boolean save(@NonNull Produits produits) {
        var Query = QueriesProduits.INSERT_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, produits.getCodeproduct());
            statement.setInt(2, produits.getPrice());
            statement.setInt(3, produits.getQuantity());
            statement.setString(4, produits.getTypeproduct());
            statement.setString(5, produits.getDescription());
            statement.setInt(6, produits.getIdreaprovisionnement());
            statement.setString(7, produits.getLibelle());
            int i = statement.executeUpdate();
            if (i ==1){
                f= true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean update(@NonNull Produits produits) {
        var Query = QueriesProduits.UPDATE_SIMPLE.getQuery();
        boolean f=false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, produits.getId());
            statement.setString(2, produits.getCodeproduct());
            statement.setFloat(3, produits.getPrice());
            statement.setInt(4, produits.getQuantity());
            statement.setString(5, produits.getTypeproduct());
            statement.setString(6, produits.getDescription());
            statement.setInt(7, produits.getIdreaprovisionnement());
            statement.setString(8, produits.getLibelle());
            int i = statement.executeUpdate();
            if (i ==1){
                f= true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean delete(@NonNull Integer idProduits) {
        var Query = QueriesProduits.DELETE_SIMPLE.getQuery();
        boolean f=false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, idProduits);
            int i = statement.executeUpdate();
            if (i == 1){
                f= true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
