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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/stock/updateProduit.jsp");
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
        Produits prod = produitsDao.findByCodeProduit(code);
        if (prod == null) {
            request.setAttribute("error", "Produits non trouver!");
        } else {
            prod.setCodeproduct(code);
            prod.setLibelle(libelle);
            prod.setQuantity(quantity);
            prod.setPrice(price);
            prod.setDescription(description);
            prod.setTypeproduct(type);
            if (produitsDao.update(prod)) {
                request.setAttribute("Update", "Success");
                response.sendRedirect("HomeUserServlet");
            } else {
                request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
            }
        }
    }
}