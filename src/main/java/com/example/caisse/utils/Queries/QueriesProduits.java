package com.example.caisse.utils.Queries;

public enum QueriesProduits {

    SELECT_WHERE("SELECT * FROM produits WHERE codeproduct = ?;"),
    SELECT_ALL("SELECT * FROM produits ORDER BY libelle ASC;"),
    SELECT_TYPE("SELECT * FROM produits WHERE type = ? ORDER BY libelle ASC;"),
    SELECT_ID("SELECT * FROM produits WHERE id = ?; "),
    SELECT_LIBELLE("SELECT * FROM produits WHERE libelle = ?;"),
    SELECT_IDREAPRO("SELECT * FROM produits WHERE idReaprovisionnement = ?;"),
    INSERT_SIMPLE("INSERT INTO produits(codeproduct,price,quantity,typeproduct,description,idreaprovisionnement,libelle) VALUES (?,?,?,?,?,?,?);"),
    UPDATE_QUANTITY("UPDATE produits SET quantity = ?,total = ? WHERE id = ?;"),
    UPDATE_PRIX("UPDATE produits SET price = ? WHERE id = ?;"),
    UPDATE_SIMPLE("UPDATE produits SET codeproduct = ?,price = ?,quantity = ?,typeproduct = ?,description = ?,libelle = ? WHERE id = ?;"),
    DELETE_SIMPLE("DELETE FROM produits WHERE codeproduct = ?;");

    private final String query;
    QueriesProduits(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
