package com.example.caisse.servlets.stock;

import com.example.caisse.dao.impl.ProduitsDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DeleteProduitServlet", value = "/DeleteProduitServlet")
public class DeleteProduitServlet extends HttpServlet {
    private final ProduitsDao produitsDao = new ProduitsDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        if (produitsDao.delete(code)) {
            request.setAttribute("Suppression", "Success");
            response.sendRedirect("HomeProduits");
        } else {
            request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}