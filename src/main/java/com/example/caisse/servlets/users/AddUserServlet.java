package com.example.caisse.servlets.users;

import com.example.caisse.dao.impl.UserDao;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.PasswordUtils;
import com.example.caisse.utils.SessionService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "AddUserServlet", value = "/AddUserServlet")
public class AddUserServlet extends HttpServlet {
    private SessionService session;
    private final UserDao userDao = new UserDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/users/register.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String telephone = request.getParameter("telephone");
        Map<String, String> errors = new HashMap<>();
        Gestionnaire gestionnaire = userDao.findByLogin(login);
            if(gestionnaire != null) {
                errors.put("login_error", "Ce Login est deja utilise!");
            }else {
                String pwd = PasswordUtils.encode(password);
                Gestionnaire gest = new Gestionnaire(nom,prenom,telephone,pwd,login);
                errors.put("Add", "Success");
                if (userDao.save(gest)) {
                    response.sendRedirect("HomeUserServlet");
                } else {
                    errors.put("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
                }

            }
    }
}