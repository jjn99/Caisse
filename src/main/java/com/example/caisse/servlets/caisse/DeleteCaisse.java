package com.example.caisse.servlets.caisse;

import com.example.caisse.dao.impl.CaisseDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DeleteCaisse", value = "/DeleteCaisse")
public class DeleteCaisse extends HttpServlet {
    private final CaisseDao caisseDao = new CaisseDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        if (caisseDao.delete(libelle)) {
            request.setAttribute("Suppression", "Success");
            response.sendRedirect("HomeCaisseServlet");
        } else {
            request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}