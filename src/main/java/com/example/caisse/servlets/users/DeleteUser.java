package com.example.caisse.servlets.users;

import com.example.caisse.dao.impl.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DeleteUser", value = "/DeleteUser")
public class DeleteUser extends HttpServlet {
    private final UserDao userDao = new UserDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String login = request.getParameter("login");
        Map<String, String> msg = new HashMap<>();
        if (userDao.deleteByLogin(login)) {
            msg.put("Suppression", "Success");
            response.sendRedirect("HomeUserServlet");
        } else {
            msg.put("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}