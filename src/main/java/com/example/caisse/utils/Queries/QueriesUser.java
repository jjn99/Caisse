package com.example.caisse.utils.Queries;

public enum QueriesUser {
    SELECT_WHERE("SELECT * FROM gestionnaire WHERE login = ?;");

    private final String query;
    QueriesUser(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
