package com.example.caisse.utils.Queries;

public enum QueriesDepense {
    SELECT_BENEFICIAIRE("SELECT * FROM depense WHERE beneficiaire = ?;"),
    SELECT_ID("SELECT * FROM depense WHERE id =?;"),
    SELECT_USER("SELECT * FROM depense WHERE iduser = ?;"),
    SELECT_CAISSE("SELECT * FROM depense WHERE idCaisse = ?;"),
    SELECT_ALL("SELECT * FROM depense ORDER BY libelle ASC;"),
    INSERT_SIMPLE("INSERT INTO depense(montantEntrants,montantSortants,beneficiaire,adresse,date) VALUES (?,?,?,?,?,?,?);"),
    UPDATE_SIMPLE("UPDATE depense SET Id =?,montantEntrants = ?,montantSortants = ?,beneficiaire =?,adresse =?, date = ? WHERE Id = ?;"),
    DELETE_SIMPLE("DELETE FROM depense WHERE Id = ?;");

    private final String query;
    QueriesDepense(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
