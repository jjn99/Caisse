package com.example.caisse.servlets.stock;

import com.example.caisse.dao.impl.DepenseReaprovisionnementDao;
import com.example.caisse.entities.DepenseReaprovisionnement;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.PasswordUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "AddDepenseReaprovisionnement", value = "/AddDepenseReaprovisionnement")
public class AddDepenseReaprovisionnement extends HttpServlet {

    private final DepenseReaprovisionnementDao depenseDao = new DepenseReaprovisionnementDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/stock/addReaprovisionnement.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        Integer montant = Integer.parseInt(request.getParameter("montant"));
        String beneficiaires = request.getParameter("beneficiaires");
        String adresse = request.getParameter("adresse");
        DepenseReaprovisionnement depenseReaprovisionnement = new DepenseReaprovisionnement();
        depenseReaprovisionnement.setAdresse(adresse);
        depenseReaprovisionnement.setBeneficiaires(beneficiaires);
        depenseReaprovisionnement.setMontant(montant);
        depenseReaprovisionnement.setLibelle(libelle);
        depenseReaprovisionnement.setDate(String.valueOf(new Date()));
            if (depenseDao.add(depenseReaprovisionnement)) {
                response.sendRedirect("HomeProduits");
            } else {
                request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
            }

    }

}