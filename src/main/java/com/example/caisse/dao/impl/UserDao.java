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

    private Connection connection = DBConnection.loadDataBase();

    public Gestionnaire createInstance(ResultSet result) throws SQLException {
        return new Gestionnaire( result.getString(1), result.getString(2),
                result.getString(3), result.getString(4),
                result.getString(5), result.getString(6));
    }

    public List<Gestionnaire> createListInstance(ResultSet result) throws SQLException {
        List<Gestionnaire> gestionnaires = new ArrayList<>();
        for(int i = 0; i < result.getFetchSize(); i++) {
            gestionnaires.add(createInstance(result));
        }
        return gestionnaires;
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
        var Query = QueriesUser.SELECT_WHERE.getQuery();
        List<Gestionnaire> gestionnaires = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            var result = statement.executeQuery();
            if(result.next()) {
                gestionnaires = createListInstance(result);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return gestionnaires;
    }

    @Override
    public void save(@NonNull Gestionnaire gestionnaire) {
        var Query = QueriesUser.INSERT_SIMPLE.getQuery();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, gestionnaire.getNom());
            statement.setString(2, gestionnaire.getPrenom());
            statement.setString(3, gestionnaire.getTelephone());
            statement.setString(4, gestionnaire.getLogin());
            statement.setString(5, gestionnaire.getMotdepasse());
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void update(@NonNull Gestionnaire gestionnaire) {
        var Query = QueriesUser.UPDATE_SIMPLE.getQuery();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, gestionnaire.getID());
            statement.setString(2, gestionnaire.getNom());
            statement.setString(3, gestionnaire.getPrenom());
            statement.setString(4, gestionnaire.getTelephone());
            statement.setString(5, gestionnaire.getLogin());
            statement.setString(6, gestionnaire.getMotdepasse());
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void delete(@NonNull Integer idGestionnaire) {
        var Query = QueriesUser.DELETE_SIMPLE.getQuery();
        try {
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1, idGestionnaire);
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
