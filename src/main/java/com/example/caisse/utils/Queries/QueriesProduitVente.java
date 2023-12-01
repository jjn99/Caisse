package com.example.caisse.utils.Queries;

public enum QueriesProduitVente {
    SELECT_WHERE("SELECT * FROM produitvendu WHERE idproduit = ? AND idvente =?;"),
    SELECT_ALL("SELECT * FROM produitvendu ORDER BY login ASC;"),
    INSERT_SIMPLE("INSERT INTO produitvendu(idproduit,idvente,quantite) VALUES (?,?,?);"),
    UPDATE_SIMPLE("UPDATE produitvendu SET Id = ?, idproduit = ?, idvente = ?, quantite = ? WHERE Id = ?;"),
    DELETE_SIMPLE("DELETE FROM produitvendu WHERE Id = ?;");

    private final String query;
    QueriesProduitVente(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
