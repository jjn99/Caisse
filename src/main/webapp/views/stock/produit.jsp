<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 30/11/2023
  Time: 22:50
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
<%@include file="../../assets/components/navbar.jsp" %>
<div class="container-fluid h-7rem p-4" style="background-color: #f5f7fa;">
    <div class="flex pt-4 px-3 gap-2 ">
        <a href="AddDepenseReaprovisionnement" class="btn p-2 m-1 flex gap-2 border-1 shadow-1 cursor-pointer "
           style="border-radius: 20px; background-color: #425DAE;">
            <span class="font-medium text-gray-900 w-auto white-space-nowrap" style=" color: white !important;">Nouveau Reaprovisionnement</span>
        </a>
        <a href="AddProduitServlet" class="btn p-2 m-1 flex gap-2 border-1 shadow-1 cursor-pointer "
           style="border-radius: 20px; background-color: #425DAE;">
            <span class="font-medium text-gray-900 w-auto white-space-nowrap" style=" color: white !important;">Nouveau Produit</span>
        </a>
    </div>
</div>
<section class="intro mt-1 p-1">
    <div class="bg-image " >
        <div class="mask d-flex align-items-center">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body p-1">
                                <div class="table-responsive table-scroll" data-mdb-perfect-scrollbar="true" style="position: relative;">
                                    <table class="table table-striped mb-0">
                                        <thead style="background-color: #425DAE; color: white;">
                                        <tr>
                                            <th scope="col">Code Product</th>
                                            <th scope="col">Libelle</th>
                                            <th scope="col">Prix</th>
                                            <th scope="col">Quantity</th>
                                            <th scope="col">Type</th>
                                            <th scope="col" style="text-align: center;">Action</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${produits}" var="produit">

                                            <tr>
                                                <th>
                                                        ${produit.getCodeproduct()}
                                                </th>
                                                <th>${produit.getLibelle()}</th>
                                                <th>${produit.getPrice()}</th>
                                                <th>${produit.getQuantity()}</th>
                                                <th>${produit.getTypeproduct()}</th>
                                                <th>
                                                    <div class="flex align-items-center justify-content-center pt-1 px-3 gap-2">
                                                        <a href="UpdateProduitServlet?codeProduct=${produit.getCodeproduct()}" class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
                                                           style="border-radius: 20px; background-color: #425DAE; ">
                                                            <span class="font-medium text-gray-900 white-space-nowrap" style="color: white !important;">Modifier</span>
                                                        </a>
                                                        <a href="DeleteProduitServlet?Id=${produit.getId()}" class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
                                                           style="border-radius: 20px; background-color: #ED5867;">
                                                            <span class="font-medium text-gray-900 white-space-nowrap" style="color: white !important;">Supprimer</span>
                                                        </a>
                                                    </div>
                                                </th>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>
