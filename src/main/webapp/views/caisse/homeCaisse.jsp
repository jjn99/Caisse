<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 30/11/2023
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%@ include file="../../styles/style.css" %>
    </style>
</head>
<body>
<%@ include file="../../assets/components/navbar.jsp" %>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4 ">
            <h1>Home</h1>
        </div>
        <div class="col-md-8">
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
                                                        <th scope="col">Num</th>
                                                        <th scope="col">Libelle</th>
                                                        <th scope="col">Montant</th>
                                                        <th scope="col" style="text-align: center;">Action</th>
                                                    </tr>
                                                    </thead>
                                                    <tbody>
                                                    <c:forEach items="${caisses}" var="caisse">
                                                        <tr>
                                                            <th>${caisse.getId()}</th>
                                                            <th>
                                                                    ${caisse.getLibelle()}
                                                            </th>
                                                            <th>${caisse.getMontants()} FCFA</th>
                                                            <th>
                                                                <div class="flex align-items-center justify-content-center pt-1 px-3 gap-2">
                                                                    <a class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
                                                                       style="border-radius: 20px; background-color: #425DAE; ">
                                                                        <span class="font-medium text-gray-900 white-space-nowrap" style="color: white !important;">Modifier</span>
                                                                    </a>
                                                                    <a class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
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
        </div>
    </div>
</div>
</body>
</html>
