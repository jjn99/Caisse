package com.example.caisse.utils.Queries;

public enum QueriesDepenseReaprovisionnement {

    SELECT_WHERE("SELECT * FROM depenseReaprovisionnement WHERE libelle = ?;"),
    SELECT_ALL("SELECT * FROM depenseReaprovisionnement ORDER BY libelle ASC;"),
    SELECT_ID("SELECT * FROM depenseReaprovisionnement WHERE id = ?;"),
    SELECT_BENEFICIAIRE("SELECT * FROM depenseReaprovisionnement WHERE beneficiaires = ? ORDER BY libelle ASC;"),
    INSERT_SIMPLE("INSERT INTO depenseReaprovisionnement(libelle,montant,beneficiaires,adresse,date) VALUES(?,?,?,?,?);"),
    UPDATE_MONTANT("UPDATE depenseReaprovisionnement SET montant = ?,WHERE id = ?;"),
    UPDATE_SIMPLE("UPDATE depenseReaprovisionnement SET libelle = ?, montant = ?, beneficiaires = ?, adresse = ?, date = ? WHERE id = ?;"),
    DELETE_SIMPLE("DELETE FROM depenseReaprovisionnement WHERE id = ?;");

    private final String query;
    QueriesDepenseReaprovisionnement(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

}
