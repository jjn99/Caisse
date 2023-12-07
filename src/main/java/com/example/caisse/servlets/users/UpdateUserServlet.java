package com.example.caisse.servlets.users;

import com.example.caisse.dao.impl.UserDao;
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

@WebServlet(name = "UpdateUserServlet", value = "/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {

    private final UserDao userDao = new UserDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/users/updateUser.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String telephone = request.getParameter("telephone");
        Map<String, String> errors = new HashMap<>();
        Gestionnaire gestionnaire = userDao.findByLogin(login);
        if(gestionnaire == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/users/updateUser.jsp");
            request.setAttribute("error", "Utilisateur non trouver!");
            dispatcher.forward(request, response);
        }else {
            int Id = gestionnaire.getId();
            String motdepasse = gestionnaire.getMotdepasse();
            Gestionnaire gest = new Gestionnaire(Id,nom,prenom,telephone,motdepasse,login);
            if (userDao.update(gest)) {
                errors.put("Update", "Success");
                response.sendRedirect("HomeUserServlet");
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/views/users/updateUser.jsp");
                request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
                dispatcher.forward(request, response);
            }

        }

    }
}