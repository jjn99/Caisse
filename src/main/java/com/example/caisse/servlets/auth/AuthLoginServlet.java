package com.example.caisse.servlets.auth;


import com.example.caisse.dao.impl.UserDao;
import com.example.caisse.dao.interfaces.IUserDao;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.PasswordUtils;
import com.example.caisse.utils.SessionService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@WebServlet(name = "AuthLoginServlet", value = "/AuthLoginServlet")
public class AuthLoginServlet extends HttpServlet {
    private SessionService sessions;
    private final UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Gestionnaire session = sessions.isSession(request);
        if(session == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/auth/login.jsp");
            dispatcher.forward(request, response);
        }else {
            response.sendRedirect("/homeServlet");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        if(login.isEmpty() || password.isEmpty()){
            try {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/views/auth/login.jsp");
                request.setAttribute("error_message", "Login ou Mot de passe obligatoire");
                System.out.println("Login ou Mot de passe obligatoire");
                dispatcher.forward(request, response);
            } catch (ServletException | IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            Gestionnaire user =userDao.findByLogin(login);
            if(user == null) {
                try {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/views/auth/login.jsp");
                    request.setAttribute("error_message", "Login ou Mot de passe incorrect");
                    System.out.println("Login ou Mot de passe incorrect");
                    dispatcher.forward(request, response);
                } catch (ServletException | IOException e) {
                    throw new RuntimeException(e);
                }
            }else {
                if(!Objects.equals(user.getMotdepasse(), password)) {
                    try {
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/auth/login.jsp");
                        request.setAttribute("error_message", "Mot de passe incorrect");
                        System.out.println("Mot de passe incorrect");
                        dispatcher.forward(request, response);
                    } catch (ServletException | IOException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    try {
                        HttpSession session = request.getSession();
                        session.setAttribute("user",user);
                        response.sendRedirect("homeServlet");
                        System.out.println("Successfully");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}