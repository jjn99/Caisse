package com.example.caisse.servlets.caisse;

import com.example.caisse.dao.impl.CaisseDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "HomeCaisseServlet", value = "/HomeCaisseServlet")
public class HomeCaisseServlet extends HttpServlet {
    private final CaisseDao caisseDao = new CaisseDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/caisse/homeCaisse.jsp");
        request.setAttribute("caisses", caisseDao.findAll());
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}