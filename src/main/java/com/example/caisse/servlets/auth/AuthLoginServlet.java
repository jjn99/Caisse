package com.example.caisse.servlets.auth;


import com.example.caisse.dao.interfaces.IUserDao;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.PasswordUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AuthLoginServlet", value = "/AuthLoginServlet")
public class AuthLoginServlet extends HttpServlet {
    private IUserDao userDao;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/auth/login.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        Gestionnaire gestionnaire = userDao.findByLogin(login);
        if(!PasswordUtils.check(password, gestionnaire.getMotdepasse())){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/auth/login.jsp");
            request.setAttribute("error_message", "Bad Credentials");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException | IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                response.sendRedirect("/home");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}