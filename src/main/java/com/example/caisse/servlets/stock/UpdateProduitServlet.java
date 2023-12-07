package com.example.caisse.servlets.stock;

import com.example.caisse.dao.impl.ProduitsDao;
import com.example.caisse.entities.Produits;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "UpdateProduitServlet", value = "/UpdateProduitServlet")
public class UpdateProduitServlet extends HttpServlet {

    private final ProduitsDao produitsDao = new ProduitsDao();
    Produits produits = new Produits();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/stock/updateProduit.jsp");
        Integer Id = Integer.parseInt(request.getParameter("id"));
        produits = produitsDao.findByID(Id);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("codeProduct");
        String libelle = request.getParameter("libelle");
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        Integer price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        String type = request.getParameter("type");
        if (produits == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/stock/updateProduit.jsp");
            request.setAttribute("error", "Produits non trouver!");
            dispatcher.forward(request, response);

        } else {
            produits.setCodeproduct(code);
            produits.setLibelle(libelle);
            produits.setQuantity(quantity);
            produits.setPrice(price);
            produits.setDescription(description);
            produits.setTypeproduct(type);
            if (produitsDao.update(produits)) {
                response.sendRedirect("HomeProduits");
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/views/stock/updateProduit.jsp");
                request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
                dispatcher.forward(request, response);

            }
        }
    }
}