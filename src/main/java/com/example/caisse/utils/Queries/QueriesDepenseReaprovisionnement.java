package com.example.caisse.utils.Queries;

public enum QueriesDepenseReaprovisionnement {

    SELECT_WHERE("SELECT * FROM depensereaprovisionnement WHERE libelle = ?;"),
    SELECT_ALL("SELECT * FROM depensereaprovisionnement ORDER BY libelle ASC;"),
    SELECT_ID("SELECT * FROM depensereaprovisionnement WHERE Id = ?;"),
    SELECT_BENEFICIAIRE("SELECT * FROM depensereaprovisionnement WHERE beneficiaires = ? ORDER BY libelle ASC;"),
    INSERT_SIMPLE("INSERT INTO depensereaprovisionnement(libelle,montant,beneficiaires,adresse,date) VALUES(?,?,?,?,?);"),
    UPDATE_MONTANT("UPDATE depensereaprovisionnement SET montant = ?,WHERE Id = ?;"),
    UPDATE_SIMPLE("UPDATE depensereaprovisionnement SET Id = ? , libelle = ?, montant = ?, beneficiaires = ?, adresse = ?, date = ? WHERE Id = ?;"),
    DELETE_SIMPLE("DELETE FROM depensereaprovisionnement WHERE Id = ?;");

    private final String query;
    QueriesDepenseReaprovisionnement(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

}
