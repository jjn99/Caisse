package com.example.caisse.utils.Queries;

public enum QueriesCaisse {
    SELECT_WHERE("SELECT * FROM caisse WHERE libelle = ?;"),
    SELECT_ALL("SELECT * FROM caisse ORDER BY libelle ASC;"),
    SELECT_ID("SELECT * FROM caisse WHERE Id = ?;"),
    INSERT_SIMPLE("INSERT INTO caisse(libelle,actif,montants) VALUES (?,?,?);"),
    UPDATE_SIMPLE("UPDATE caisse SET id = ?, libelle = ?,actif = ?,montants = ? WHERE id = ?;"),
    DELETE_SIMPLE("DELETE FROM caisse WHERE id = ?;");

    private final String query;
    QueriesCaisse(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
