package com.example.caisse.dao.impl;

import com.example.caisse.dao.interfaces.IUserDao;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.DBConnection;
import com.example.caisse.utils.Queries.QueriesUser;
import lombok.NonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDao {

    private final Connection connection = DBConnection.loadDataBase();

    public Gestionnaire createInstance(ResultSet result) throws SQLException {
        return new Gestionnaire( result.getInt(1), result.getString(2),
                result.getString(3), result.getString(4),
                result.getString(5), result.getString(6));
    }

    @Override
    public Gestionnaire findByLogin(@NonNull String login) {
        var Query = QueriesUser.SELECT_WHERE.getQuery();
        Gestionnaire gestionnaire = null;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1,login);
            var result = statement.executeQuery();
            if(result.next()) {
                gestionnaire = createInstance(result);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return gestionnaire;    }

    @Override
    public List<Gestionnaire> findAll() {
        var Query = QueriesUser.SELECT_ALL.getQuery();
        List<Gestionnaire> gestionnaires = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            var result = statement.executeQuery();
            while( result.next() ){
                gestionnaires.add( createInstance(result) );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return gestionnaires;
    }

    @Override
    public boolean save(@NonNull Gestionnaire gestionnaire) {
        var Query = QueriesUser.INSERT_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, gestionnaire.getNom());
            statement.setString(2, gestionnaire.getPrenom());
            statement.setString(3, gestionnaire.getTelephone());
            statement.setString(4, gestionnaire.getMotdepasse());
            statement.setString(5, gestionnaire.getLogin());
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
    public boolean update(@NonNull Gestionnaire gestionnaire) {
        var Query = QueriesUser.UPDATE_SIMPLE.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, gestionnaire.getId());
            statement.setString(2, gestionnaire.getNom());
            statement.setString(3, gestionnaire.getPrenom());
            statement.setString(4, gestionnaire.getTelephone());
            statement.setString(5, gestionnaire.getMotdepasse());
            statement.setString(6, gestionnaire.getLogin());

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
        var Query = QueriesUser.DELETE_SIMPLE.getQuery();
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

    @Override
    public boolean deleteByLogin(@NonNull String login) {
        var Query = QueriesUser.DELETE_Login.getQuery();
        boolean f =false;
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, login);
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
