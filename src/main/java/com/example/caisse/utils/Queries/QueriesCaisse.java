package com.example.caisse.utils.Queries;

public enum QueriesCaisse {
    SELECT_WHERE("SELECT * FROM caisse WHERE libelle = ?;"),
    SELECT_ALL("SELECT * FROM caisse ORDER BY libelle ASC;"),
    INSERT_SIMPLE("INSERT INTO caisse(libelle,total) VALUES (?,?);"),
    UPDATE_SIMPLE("UPDATE caisse SET libelle = ?,total = ? WHERE id = ?;"),
    UPDATE_TOTAL("UPDATE caisse SET total = ? WHERE id = ?;"),
    DELETE_SIMPLE("DELETE FROM caisse WHERE id = ?;");

    private final String query;
    QueriesCaisse(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
