package com.example.caisse.servlets.caisse;

import com.example.caisse.dao.impl.CaisseDao;
import com.example.caisse.entities.Caisse;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.PasswordUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "AddCaisseServlet", value = "/AddCaisseServlet")
public class AddCaisseServlet extends HttpServlet {

    private final CaisseDao caisseDao = new CaisseDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/caisse/addCaisse.jsp");
//        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        boolean actif= false;
        Integer montants = 0;
        Map<String, String> errors = new HashMap<>();
        Caisse caisse = caisseDao.findByLibelle(libelle);
        if(caisse != null) {
            request.setAttribute("error", "Ce libelle est deja utilise!");
        }else {
            Caisse caisse1 = new Caisse();
            caisse1.setLibelle(libelle);
            caisse1.setActif(actif);
            caisse1.setMontants(montants);
            if (caisseDao.save(caisse1)) {
                request.setAttribute("Add", "Success");
                response.sendRedirect("HomeCaisseServlet");
            } else {
                request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
            }

        }

    }
}