package com.example.caisse.utils.Queries;

public enum QueriesDepenseReaprovisionnement {

    SELECT_WHERE("SELECT * FROM depense WHERE libelle = ?;"),
    SELECT_ALL("SELECT * FROM depense ORDER BY libelle ASC;"),
    SELECT_CAISSE("SELECT * FROM depense WHERE idcaisse = ?;"),
    SELECT_ID_CAISSE("SELECT * FROM depense WHERE idcaisse = ? AND typedepense = 'Crediter';"),
    SELECT_ID("SELECT * FROM depense WHERE id = ?;"),
    SELECT_BENEFICIAIRE("SELECT * FROM depense WHERE beneficiaires = ? ORDER BY libelle ASC;"),
    INSERT_SIMPLE("INSERT INTO depense(libelle,montant,beneficiaires,adresse,date,idcaisse,typedepense) VALUES(?,?,?,?,?,?,?);"),
    UPDATE_MONTANT("UPDATE depense SET montant = ?,id = ?;"),
    UPDATE_SIMPLE("UPDATE depense SET  libelle = ?, montant = ?, beneficiaires = ?, adresse = ?, date = ?, typedepense=? WHERE id = ?;"),
    DELETE_SIMPLE("DELETE FROM depense WHERE id = ?;");

    private final String query;
    QueriesDepenseReaprovisionnement(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

}
