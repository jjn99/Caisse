package com.example.caisse.dao.impl;

import com.example.caisse.dao.interfaces.IDecompteDao;
import com.example.caisse.entities.Decompte;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.DBConnection;
import com.example.caisse.utils.Queries.QueriesAllimenntationArretCaisse;
import com.example.caisse.utils.Queries.QueriesUser;
import lombok.NonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DecompteDao implements IDecompteDao {
    private final Connection connection = DBConnection.loadDataBase();
    public Decompte createInstance(ResultSet result) throws SQLException {
        return new Decompte( result.getInt(1), result.getString(2),
                result.getInt(3), result.getInt(4),
                result.getInt(5), result.getInt(6),
                result.getInt(7), result.getInt(8),
                result.getInt(9), result.getInt(10),
                result.getInt(11), result.getInt(12),
                result.getInt(13), result.getInt(14));
    }
    @Override
    public Decompte findById(@NonNull Integer Id) {
        var Query = QueriesAllimenntationArretCaisse.SELECT_ID.getQuery();
        Decompte decompte = null;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,Id);
            var result = statement.executeQuery();
            if(result.next()) {
                decompte = createInstance(result);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return decompte;
    }

    @Override
    public List<Decompte> findByType(@NonNull String type) {
        var Query = QueriesAllimenntationArretCaisse.SELECT_TYPE.getQuery();
        return getDecomptes(Query);
    }

    @Override
    public List<Decompte> findByIdCaisse(@NonNull Integer Id) {
        var Query = QueriesAllimenntationArretCaisse.SELECT_ID_CAISSE.getQuery();
        return getDecomptes(Query);
    }

    private List<Decompte> getDecomptes(String query) {
        List<Decompte> decomptes = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            var result = statement.executeQuery();
            while( result.next() ){
                decomptes.add( createInstance(result) );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return decomptes;
    }

    @Override
    public List<Decompte> findAll() {
        var Query = QueriesAllimenntationArretCaisse.SELECT_ALL.getQuery();
        return getDecomptes(Query);
    }

    @Override
    public boolean save(@NonNull Decompte decompte) {
        var Query = QueriesAllimenntationArretCaisse.INSERT_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, decompte.getType());
            statement.setInt(2,decompte.getNb10000());
            statement.setInt(3,decompte.getNb5000());
            statement.setInt(4,decompte.getNb2000());
            statement.setInt(5,decompte.getNb1000());
            statement.setInt(6,decompte.getNb500());
            statement.setInt(7,decompte.getNb250());
            statement.setInt(8,decompte.getNb200());
            statement.setInt(9,decompte.getNb100());
            statement.setInt(10,decompte.getNb50());
            statement.setInt(11,decompte.getNb25());
            statement.setInt(12,decompte.getMontanttotal());
            statement.setInt(13,decompte.getIdcaisse());

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
    public boolean update(@NonNull Decompte decompte) {
        var Query = QueriesAllimenntationArretCaisse.UPDATE_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,decompte.getId());
            statement.setString(2, decompte.getType());
            statement.setInt(3,decompte.getNb10000());
            statement.setInt(4,decompte.getNb5000());
            statement.setInt(5,decompte.getNb2000());
            statement.setInt(6,decompte.getNb1000());
            statement.setInt(7,decompte.getNb500());
            statement.setInt(8,decompte.getNb250());
            statement.setInt(9,decompte.getNb200());
            statement.setInt(10,decompte.getNb100());
            statement.setInt(11,decompte.getNb50());
            statement.setInt(12,decompte.getNb25());
            statement.setInt(13,decompte.getMontanttotal());
            statement.setInt(14,decompte.getIdcaisse());

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
        var Query = QueriesAllimenntationArretCaisse.DELETE_SIMPLE.getQuery();
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
