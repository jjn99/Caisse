package com.example.caisse.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection connexion;

    public static Connection loadDataBase(){
        //Chargement du pilote
        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){}

        try {
            connexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/caisse_app", "postgres", "Kali-linux23");
            System.out.println("Connexion etablie");
        }catch (Exception e){
            e.printStackTrace();
        }
        return connexion;
    }

}
/*
  try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {}
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/caisseregister", "root", "");
            System.out.println("Connection etablie");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
*/