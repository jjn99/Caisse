package com.example.caisse.utils.Queries;

public enum QueriesUser {
    SELECT_WHERE("SELECT * FROM gestionnaire WHERE login = ?;"),
    SELECT_ALL("SELECT * FROM gestionnaire ORDER BY login ASC;"),
    INSERT_SIMPLE("INSERT INTO gestionnaire(nom,prenom,telephone,login,motdepasse) VALUES (?,?,?,?,?);"),
    UPDATE_SIMPLE("UPDATE gestionnaire SET nom = ?,prenom = ?, telephone = ?,login =?,motdepasse =? WHERE id = ?;"),
    DELETE_SIMPLE("DELETE FROM gestionnaire WHERE id = ?;");

    private final String query;
    QueriesUser(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
