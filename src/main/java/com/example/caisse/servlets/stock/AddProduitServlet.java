package com.example.caisse.servlets.stock;

import com.example.caisse.dao.impl.DepenseReaprovisionnementDao;
import com.example.caisse.dao.impl.ProduitsDao;
import com.example.caisse.entities.DepenseReaprovisionnement;
import com.example.caisse.entities.Produits;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebServlet(name = "AddProduitServlet", value = "/AddProduitServlet")
public class AddProduitServlet extends HttpServlet {

    private final ProduitsDao produitsDao = new ProduitsDao();
    private final DepenseReaprovisionnementDao depenseDao = new DepenseReaprovisionnementDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/stock/addProduit.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String codeProduct = request.getParameter("codeProduct");
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        Integer price = Integer.parseInt(request.getParameter("price"));
        String libelle = request.getParameter("libelle");
        String description = request.getParameter("description");
        String Type = request.getParameter("type");
        Integer idReaprovisionnement = Integer.parseInt(request.getParameter("idReaprovisionnement"));
        Produits product = new Produits();
        product.setLibelle(libelle);
        product.setDescription(description);
        product.setPrice(price);
        product.setTypeproduct(Type);
        product.setCodeproduct(codeProduct);
        product.setQuantity(quantity);
        product.setIdreaprovisionnement(idReaprovisionnement);
           if(produitsDao.findByCodeProduit(codeProduct) == null){
               if (produitsDao.save(product)) {
                   response.sendRedirect("HomeProduits");
               } else {
                   RequestDispatcher dispatcher = request.getRequestDispatcher("/views/stock/addProduit.jsp");
                   request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
                   dispatcher.forward(request, response);

               }
           }
           else {
               RequestDispatcher dispatcher = request.getRequestDispatcher("/views/stock/addProduit.jsp");
               request.setAttribute("error", "Ce produit existe déjà");
               dispatcher.forward(request, response);

           }
    }
}