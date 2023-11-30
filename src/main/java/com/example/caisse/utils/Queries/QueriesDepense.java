package com.example.caisse.utils.Queries;

public enum QueriesDepense {
    SELECT_LIBELLE("SELECT * FROM depense WHERE libelle = ?;"),
    SELECT_BENEFICIAIRE("SELECT * FROM depense WHERE beneficiaire = ?;"),
    SELECT_USER("SELECT * FROM depense WHERE idGest = ?;"),
    SELECT_Caisse("SELECT * FROM depense WHERE idCaisse = ?;"),
    SELECT_ALL("SELECT * FROM depense ORDER BY libelle ASC;"),
    INSERT_SIMPLE("INSERT INTO depense(libelle,montantEntrants,montantSortant,date,beneficiaire,idGest,idCaisse) VALUES (?,?,?,?,?,?,?);"),
    UPDATE_SIMPLE("UPDATE depense SET libelle = ?,montantEntrants = ?,montantSortant = ?, date = ?,beneficiaire =?,idGest =?,idCaisse =? WHERE id = ?;"),
    DELETE_SIMPLE("DELETE FROM depense WHERE id = ?;");

    private final String query;
    QueriesDepense(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
