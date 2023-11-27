package com.example.caisse.utils;

import com.example.caisse.entities.Gestionnaire;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class SessionService {
    public Gestionnaire isSession(HttpServletRequest req) {
        HttpSession session = req.getSession();
        return (Gestionnaire) session.getAttribute("user");
    }
}
