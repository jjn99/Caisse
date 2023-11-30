package com.example.caisse.utils.Queries;

public enum QueriesAllimenntationArretCaisse {

    SELECT_ID("SELECT * FROM actionCaisse WHERE id = ?;"),
    SELECT_ID_CAISSE("SELECT * FROM actionCaisse WHERE idCaisse = ?;"),
    SELECT_TYPE("SELECT * FROM actionCaisse WHERE type = ?;"),
    SELECT_ALL("SELECT * FROM actionCaisse ORDER BY type ASC;"),
    INSERT_SIMPLE("INSERT INTO actionCaisse(type,montant_total,date,idCaisse,commentaire) VALUES (?,?,?,?,?);"),
    UPDATE_SIMPLE("UPDATE actionCaisse SET libelle = ?,montant_total = ?,date = ?, idCaisse = ?, commentaire = ? WHERE id = ?;"),
    DELETE_SIMPLE("DELETE FROM actionCaisse WHERE id = ?;");

    private final String query;
    QueriesAllimenntationArretCaisse(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

}
