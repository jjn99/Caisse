package com.example.caisse.servlets.statistics;

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

@WebServlet(name = "StatistiqueServlet", value = "/StatistiqueServlet")
public class StatistiqueServlet extends HttpServlet {

    private DepenseReaprovisionnementDao dao = new DepenseReaprovisionnementDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/statics/statistique.jsp");
        request.setAttribute("DRList", dao.findAll());
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}