package com.example.caisse.utils.Queries;

public enum QueriesProduits {

    SELECT_WHERE("SELECT * FROM Produits WHERE codeProduct = ?;"),
    SELECT_ALL("SELECT * FROM produits ORDER BY libelle ASC;"),
    SELECT_TYPE("SELECT * FROM Produits WHERE type = ? ORDER BY libelle ASC;"),
    SELECT_ID("SELECT * FROM Produits WHERE id = ?;"),
    SELECT_LIBELLE("SELECT * FROM Produits WHERE libelle = ?;"),
    SELECT_IDREAPRO("SELECT * FROM Produits WHERE idReaprovisionnement = ?;"),
    INSERT_SIMPLE("INSERT INTO Produits(codeProduct,libelle,price,quantity,type,description,idReaprovisionnement) VALUES (?,?,?,?,?,?,?);"),
    UPDATE_QUANTITY("UPDATE Produits SET quantity = ?,total = ? WHERE id = ?;"),
    UPDATE_PRIX("UPDATE Produits SET price = ? WHERE id = ?;"),
    UPDATE_SIMPLE("UPDATE Produits SET codeProduct = ?,libelle = ?,price = ?,quantity = ?,type = ?,description = ?,idReaprovisionnement = ? WHERE id = ?;"),
    DELETE_SIMPLE("DELETE FROM Produits WHERE id = ?;");

    private final String query;
    QueriesProduits(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
