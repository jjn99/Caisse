package com.example.caisse.servlets.vente.traitement;

import com.example.caisse.dao.impl.CaisseDao;
import com.example.caisse.dao.impl.DepenseReaprovisionnementDao;
import com.example.caisse.dao.impl.ProduitsDao;
import com.example.caisse.entities.Caisse;
import com.example.caisse.entities.DepenseReaprovisionnement;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebServlet(name = "VenteServlet", value = "/VenteServlet")
public class VenteServlet extends HttpServlet {
    private final DepenseReaprovisionnementDao depenseDao = new DepenseReaprovisionnementDao();
    private final CaisseDao caisseDao = new CaisseDao();
    Caisse caisse = new Caisse();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/vente/traitement/vente.jsp");
        Integer id = Integer.parseInt(request.getParameter("idcaisse"));
        caisse = caisseDao.findById(id);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        Integer montant = Integer.parseInt(request.getParameter("montant"));
        String beneficiaires = request.getParameter("beneficiaires");
        String adresse = request.getParameter("adresse");
        if (caisse != null){
            if(caisse.getMontants() - montant < 0){
                request.setAttribute("error", "Montant inadequat!");
            }else {
                DepenseReaprovisionnement depenseReaprovisionnement = new DepenseReaprovisionnement();
                depenseReaprovisionnement.setAdresse(adresse);
                depenseReaprovisionnement.setBeneficiaires(beneficiaires);
                depenseReaprovisionnement.setMontant(montant);
                depenseReaprovisionnement.setLibelle(libelle);
                depenseReaprovisionnement.setIdcaisse(caisse.getId());
                depenseReaprovisionnement.setTypedepense("Crediter");
                depenseReaprovisionnement.setDate(String.valueOf(new Date()));
                if (depenseDao.add(depenseReaprovisionnement)) {
                    caisse.setMontants(caisse.getMontants() - montant);
                    caisseDao.updateMontant(caisse);
                    response.sendRedirect("HomeVenteServlet?");
                } else {
                    request.setAttribute("error", "Une erreur est survenu lors de l'operation veilliez reesayer!");
                }
            }
        }else {
            request.setAttribute("error", "Caisse innexistante!");
        }

    }
}