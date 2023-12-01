package com.example.caisse.utils.Queries;

public enum QueriesAllimenntationArretCaisse {

    SELECT_ID("SELECT * FROM decompte WHERE Id = ?;"),
    SELECT_TYPE("SELECT * FROM decompte WHERE type = ?;"),
    SELECT_ID_CAISSE("SELECT * FROM decompte WHERE idCaisse =?;"),
    SELECT_ALL("SELECT * FROM decompte ORDER BY type ASC;"),
    INSERT_SIMPLE("INSERT INTO decompte(type,nb10000,nb5000,nb2000,nb1000,nb500,nb250,nb200,nb100,nb50,nb25,montanttotal,idcaisse) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);"),
    UPDATE_SIMPLE("UPDATE decompte SET Id =?, type = ?,nb10000 = ?,nb5000 = ?, nb2000 = ?, nb1000 = ?,nb500 = ?,nb250 = ?,nb200 = ?,nb100=?,nb50 = ?,nb25 =?,montanttotal =?, idcaisse =? WHERE Id = ?;"),
    DELETE_SIMPLE("DELETE FROM actionCaisse WHERE Id = ?;");

    private final String query;
    QueriesAllimenntationArretCaisse(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

}
