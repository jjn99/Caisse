<%@ page import="com.example.caisse.dao.impl.ProduitsDao" %>
<%@ page import="com.example.caisse.entities.Produits" %>
<%@ page import="com.example.caisse.dao.impl.DepenseReaprovisionnementDao" %>
<%@ page import="com.example.caisse.entities.DepenseReaprovisionnement" %><%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 01/12/2023
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caisse-Pro</title>
    <style>
        <%@ include file="../../styles/style.css" %>
    </style>
</head>
<body>
<%@ include file="../../assets/components/navbar.jsp"%>
<div class="surface-ground mt-3 flex align-items-center justify-content-center overflow-hidden">
    <div class="flex flex-column align-items-center justify-content-center">
        <%
            Integer Id = Integer.valueOf(request.getParameter("id"));
            ProduitsDao produitsDao = new ProduitsDao();
            Produits p = produitsDao.findByID(Id);
        %>
        <form method="post" action="UpdateProduitServlet">
            <div class="flex flex-wrap">
                <div class="text-900 text-3xl font-medium text-center mb-3">FORMULAIRE</div>
                <div class="col-12">
                    <div class="grid">
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Code Product</label>
                            <input
                                    name="codeProduct"
                                    type="text"
                                    value="<%= p.getCodeproduct() %>"
                                    class="w-full md:w-30rem mb-3 form-control"
                                    required
                            />
                        </div>

                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">libelle</label>
                            <input
                                    name="libelle"
                                    type="text"
                                    value="<%= p.getLibelle() %>"
                                    class="w-full md:w-30rem mb-3 form-control"
                                    required
                            />
                        </div>
                    </div>

                    <div class="grid">
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Quantity</label>
                            <input
                                    name="quantity"
                                    type="number"
                                    value="<%= p.getQuantity() %>"
                                    class="w-full md:w-30rem mb-3 form-control"
                                    required
                            />
                        </div>
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Prix</label>
                            <input
                                    name="price"
                                    type="number"
                                    value="<%= p.getPrice() %>"
                                    class="w-full md:w-30rem mb-3 form-control"
                                    required
                            />
                        </div>
                    </div>

                    <div class="grid">
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Description</label>
                            <input
                                    name="description"
                                    type="text"
                                    value="<%= p.getDescription() %>"
                                    class="w-full md:w-30rem mb-3 form-control"
                                    required
                            />
                        </div>
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Type</label>
                            <input
                                    name="type"
                                    type="text"
                                    value="<%= p.getTypeproduct() %>"
                                    class="w-full md:w-30rem mb-3 form-control"
                                    required
                            />
                        </div>
                    </div>
                </div>
            </div>
            <div
                    class="flex align-items-center justify-content-center pt-2 px-3 gap-2"
            >
                <button class="btn w-full p-2 flex gap-2 border-1 shadow-1 cursor-pointer "
                        style="background-color: #425DAE;border-radius: 10px;height: 3rem; color:white; text-align: center" ><span>Enregistrer</span></button>
                <a href="HomeProduits" class="btn w-full p-2 flex gap-2 border-1 shadow-1 cursor-pointer "
                   style="background-color: #d9342b;border-radius: 10px;height: 3rem; color:white; text-align: center" ><span>Annuler</span></a>
            </div>
        </form>
    </div>
</div>
</body>
</html>
