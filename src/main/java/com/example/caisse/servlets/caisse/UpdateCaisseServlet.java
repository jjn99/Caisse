package com.example.caisse.servlets.caisse;

import com.example.caisse.dao.impl.CaisseDao;
import com.example.caisse.entities.Caisse;
import com.example.caisse.entities.Gestionnaire;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "UpdateCaisseServlet", value = "/UpdateCaisseServlet")
public class UpdateCaisseServlet extends HttpServlet {
    private final CaisseDao caisseDao = new CaisseDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/caisse/updateCaisse.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        Map<String, String> errors = new HashMap<>();
        Caisse caisse = caisseDao.findByLibelle(libelle);
        if (caisse == null) {
            request.setAttribute("error", "Caisse non trouver!");
        } else {
            int Id = caisse.getId();
            Caisse caisse1 = new Caisse(Id, libelle, caisse.isActif(), caisse.getMontants());
            if (caisseDao.update(caisse1)) {
                request.setAttribute("Update", "Success");
                response.sendRedirect("HomeCaisseServlet");
            } else {
                request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
            }

        }
    }
}