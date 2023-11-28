package com.example.caisse.servlets.auth;

import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.SessionService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    private SessionService sessions;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Gestionnaire gestionnaire = sessions.isSession(request);
        boolean authenticated;
        authenticated = gestionnaire == null;

        if( authenticated ){
            HttpSession session = request.getSession();
            session.invalidate();
        }
        response.sendRedirect(request.getContextPath()+"/login.jsp");
    }
}