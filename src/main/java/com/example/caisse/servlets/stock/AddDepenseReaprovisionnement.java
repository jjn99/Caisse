package com.example.caisse.servlets.stock;

import com.example.caisse.dao.impl.CaisseDao;
import com.example.caisse.dao.impl.DepenseReaprovisionnementDao;
import com.example.caisse.entities.Caisse;
import com.example.caisse.entities.DepenseReaprovisionnement;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.utils.PasswordUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "AddDepenseReaprovisionnement", value = "/AddDepenseReaprovisionnement")
public class AddDepenseReaprovisionnement extends HttpServlet {

    private final DepenseReaprovisionnementDao depenseDao = new DepenseReaprovisionnementDao();
    private final CaisseDao caisseDao = new CaisseDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/stock/addReaprovisionnement.jsp");
        List<Caisse> caisses = caisseDao.findAll();
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        Integer montant = Integer.parseInt(request.getParameter("montant"));
        String beneficiaires = request.getParameter("beneficiaires");
        String adresse = request.getParameter("adresse");
        Integer idcaisse = Integer.parseInt(request.getParameter("idcaisse"));
       Caisse caisse = caisseDao.findById(idcaisse);
       if (caisse != null){
          if(caisse.getMontants() - montant <0){
              request.setAttribute("error", "Montant inadequat!");
          }else {
              DepenseReaprovisionnement depenseReaprovisionnement = new DepenseReaprovisionnement();
              depenseReaprovisionnement.setAdresse(adresse);
              depenseReaprovisionnement.setBeneficiaires(beneficiaires);
              depenseReaprovisionnement.setMontant(montant);
              depenseReaprovisionnement.setLibelle(libelle);
              depenseReaprovisionnement.setIdcaisse(idcaisse);
              depenseReaprovisionnement.setTypedepense("Debiter");
              depenseReaprovisionnement.setDate(String.valueOf(new Date()));
              if (depenseDao.add(depenseReaprovisionnement)) {
                  caisse.setMontants(caisse.getMontants() - montant);
                  caisseDao.updateMontant(caisse);
                  response.sendRedirect("HomeProduits");
              } else {
                  request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
              }
          }
       }else {
           request.setAttribute("error", "Caisse innexistante!");
       }

    }

}