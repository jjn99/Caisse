<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 29/11/2023
  Time: 13:57
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
        <a href="AddUserServlet" class="btn p-2 flex gap-2 border-1 shadow-1 cursor-pointer "
                style="background-color: #425DAE;">
            <span class="font-medium text-gray-900 w-5rem white-space-nowrap" style=" color: white !important;">Ajouter</span>
        </a>
        <a href="UserGenerateServlet" type="button" class="btn float-left p-2 "
           style="background-color: #425DAE;color: white;">
            <i class="bi bi-download" aria-hidden="true"></i>
            <span class="font-medium text-gray-900 w-5rem white-space-nowrap" style=" color: white !important;">Telecharger</span>
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
                                            <th scope="col">Login</th>
                                            <th scope="col">Nom</th>
                                            <th scope="col">Prenom</th>
                                            <th scope="col">Telephone</th>
                                            <th scope="col" style="text-align: center;">Action</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${users}" var="user">

                                            <tr>
                                                <th>
                                                    ${user.getLogin()}
                                                </th>
                                                <th>${user.getNom()}</th>
                                                <th>${user.getPrenom()}</th>
                                                <th>${user.getTelephone()}</th>
                                                <th>
                                                    <div class="flex align-items-center justify-content-center pt-1 px-3 gap-2">
                                                        <a href="UpdateUserServlet?login=${user.getLogin()}" class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
                                                                style=" background-color: #425DAE; ">
                                                            <span class="font-medium text-gray-900 white-space-nowrap" style="color: white !important;">Modifier</span>
                                                        </a>
                                                        <a href="DeleteUser?login=${user.getLogin()}" class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
                                                                style=" background-color: #ED5867;">
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
