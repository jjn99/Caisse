package com.example.caisse.servlets.vente;

import com.example.caisse.dao.impl.CaisseDao;
import com.example.caisse.dao.impl.DecompteDao;
import com.example.caisse.entities.Caisse;
import com.example.caisse.entities.Decompte;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DecompteAlimenterServlet", value = "/DecompteAlimenterServlet")
public class DecompteAlimenterServlet extends HttpServlet {

    private final DecompteDao decompteDao = new DecompteDao();
    private final CaisseDao caisseDao = new CaisseDao();
    Caisse caisse = new Caisse();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        caisse = caisseDao.findById(Integer.parseInt(request.getParameter("caisseId")));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/vente/AlimenterCaisse.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer nb10000 = Integer.parseInt(request.getParameter("nb10000"));
        Integer nb5000 = Integer.parseInt(request.getParameter("nb5000"));
        Integer nb2000 = Integer.parseInt(request.getParameter("nb2000"));
        Integer nb1000 = Integer.parseInt(request.getParameter("nb1000"));
        Integer nb500 = Integer.parseInt(request.getParameter("nb500"));
        Integer nb250 = Integer.parseInt(request.getParameter("nb250"));
        Integer nb200 = Integer.parseInt(request.getParameter("nb200"));
       Integer nb100 = Integer.parseInt(request.getParameter("nb100"));
       Integer nb50 = Integer.parseInt(request.getParameter("nb50"));
        Integer nb25 = Integer.parseInt(request.getParameter("nb25"));
        Integer idCaisse = caisse.getId();
       Integer montant = (nb10000*10000) + (nb5000*5000) + (nb2000*2000) +
               (nb1000*1000) + (nb500*500) + (nb250*250) + (nb200*200) +
               (nb100*100) + (nb50*50) + (nb25*25);

        Decompte decompte = new Decompte();
        decompte.setMontanttotal(montant);
        decompte.setIdcaisse(idCaisse);
        decompte.setNb50(nb50);
        decompte.setNb25(nb25);
        decompte.setNb200(nb200);
        decompte.setNb100(nb100);
        decompte.setNb500(nb500);
        decompte.setNb250(nb250);
        decompte.setNb1000(nb1000);
        decompte.setNb5000(nb5000);
        decompte.setNb2000(nb2000);
        decompte.setNb10000(nb10000);
       if(decompteDao.save(decompte)){
           caisse.setMontants(montant);
           caisse.setActif(true);
           caisseDao.update(caisse);
           request.setAttribute("Add", "Success");
           response.sendRedirect("HomeVenteServlet");
       } else {
           request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
       }
    }
}