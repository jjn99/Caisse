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

public class UserDao implements IUserDao {
    DBConnection  dbConnection;
    private Connection connection = DBConnection.loadDataBase();

    public Gestionnaire createInstance(ResultSet result) throws SQLException {
        return new Gestionnaire( result.getString(1), result.getString(2),
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
}
