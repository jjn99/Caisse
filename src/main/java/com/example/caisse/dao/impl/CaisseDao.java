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
        return getCaisses(Query);
    }

    @Override
    public List<Caisse> findByActive() {
        var Query = QueriesCaisse.SELECT_ACTIF.getQuery();
        return getCaisses(Query);
    }

    private List<Caisse> getCaisses(String query) {
        List<Caisse> caisses = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(query);
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
            statement.setInt(3, caisse.getMontants());
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
        var Query = QueriesCaisse.UPDATE_LIBELLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, caisse.getLibelle());
            statement.setInt(2,caisse.getId());
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
    public boolean updateMontant(@NonNull Caisse caisse) {
        var Query = QueriesCaisse.UPDATE_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setBoolean(1, caisse.isActif());
            statement.setInt(2,caisse.getMontants());
            statement.setInt(3, caisse.getId());
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
    public boolean delete(@NonNull String libelle) {
        var Query = QueriesCaisse.DELETE_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, libelle);
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
