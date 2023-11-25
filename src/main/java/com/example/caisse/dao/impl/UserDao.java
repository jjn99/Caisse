package com.example.caisse.dao.impl;

import com.example.caisse.dao.interfaces.IUserDao;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.Queries.QueriesUser;
import lombok.NonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao implements IUserDao {

    private Connection connexion;

    @Override
    public Gestionnaire findByLogin(@NonNull String login) {
        var Query = QueriesUser.SELECT_WHERE.getQuery();
        Gestionnaire gestionnaire = null;
        try {
            PreparedStatement statement = connexion.prepareStatement(Query);
            statement.setString(1,login);
            gestionnaire = (Gestionnaire) statement.executeQuery();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return gestionnaire;
    }
}
