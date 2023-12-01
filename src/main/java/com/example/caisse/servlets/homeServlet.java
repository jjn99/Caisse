package com.example.caisse.servlets;

import com.example.caisse.dao.impl.CaisseDao;
import com.example.caisse.dao.impl.ProduitsDao;
import com.example.caisse.dao.impl.UserDao;
import com.example.caisse.entities.Gestionnaire;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "homeServlet" , value="/homeServlet")
public class homeServlet extends HttpServlet {
    private final UserDao userDao = new UserDao();
    private final ProduitsDao produitDao = new ProduitsDao();
    private final CaisseDao caisseDao = new CaisseDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("users", userDao.findAll().size());
        request.setAttribute("products", produitDao.findAll().size());
        request.setAttribute("caisses",caisseDao.findAll().size());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/home.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(405);
    }
}