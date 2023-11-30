package com.example.caisse.dao.impl;

import com.example.caisse.dao.interfaces.ICaisseDao;
import com.example.caisse.entities.Caisse;
import com.example.caisse.utils.DBConnection;
import com.example.caisse.utils.Queries.QueriesCaisse;
import lombok.NonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CaisseDao implements ICaisseDao {

    private final Connection connection = DBConnection.loadDataBase();

    public Caisse createInstance(ResultSet result) throws SQLException {
        return new Caisse( result.getInt(1), result.getString(2),
                result.getBoolean(3), result.getInt(4));
    }

    @Override
    public Caisse findByLibelle(@NonNull String libelle) {
        var Query = QueriesCaisse.SELECT_WHERE.getQuery();
        Caisse caisse = null;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1,libelle);
            var result = statement.executeQuery();
            if(result.next()) {
                caisse = createInstance(result);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return caisse;
    }

    @Override
    public Caisse findById(@NonNull Integer id) {
        var Query = QueriesCaisse.SELECT_ID.getQuery();
        Caisse caisse = null;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            var result = statement.executeQuery();
            if(result.next()) {
                caisse = createInstance(result);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return caisse;
    }

    @Override
    public List<Caisse> findAll() {
        var Query = QueriesCaisse.SELECT_ALL.getQuery();
        List<Caisse> caisses = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            var result = statement.executeQuery();
            while( result.next() ){
                caisses.add( createInstance(result) );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return caisses;
    }

    @Override
    public boolean save(@NonNull Caisse caisse) {
        var Query = QueriesCaisse.INSERT_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, caisse.getLibelle());
            statement.setBoolean(2, caisse.isActif());
            statement.setDouble(3, caisse.getMontants());
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
    public boolean update(@NonNull Caisse caisse) {
        var Query = QueriesCaisse.UPDATE_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, caisse.getId());
            statement.setString(2, caisse.getLibelle());
            statement.setBoolean(3, caisse.isActif());
            statement.setDouble(4, caisse.getMontants());
            statement.executeUpdate();
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
    public boolean delete(@NonNull Integer Id) {
        var Query = QueriesCaisse.DELETE_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, Id);
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
