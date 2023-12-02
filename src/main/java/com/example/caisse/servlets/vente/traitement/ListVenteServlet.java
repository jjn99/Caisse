package com.example.caisse.servlets.vente.traitement;

import com.example.caisse.dao.impl.DepenseReaprovisionnementDao;
import com.example.caisse.entities.DepenseReaprovisionnement;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListVenteServlet", value = "/ListVenteServlet")
public class ListVenteServlet extends HttpServlet {

    DepenseReaprovisionnementDao dao = new DepenseReaprovisionnementDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/vente/traitement/listVente.jsp");
        Integer Id = Integer.parseInt(request.getParameter("idCaisse"));
        request.setAttribute("id", Id);
        request.setAttribute("depenses", dao.finsByIdCaisse(Id));
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}