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
    <title>Caisse-Pro</title>
    <style>
        <%@ include file="../../styles/style.css" %>
    </style>
</head>
<body>
<%@ include file="../../assets/components/navbar.jsp" %>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4 ">
            <div class="flex-column align-items-center justify-content-center">
               <div class="flex flex-column align-items-center justify-content-center">
                   <img
                           src="./assets/images/iconCaisse.png"
                           alt="Caisse  App"
                           class="mb-3 w-15rem"
                   />
               </div>
                <form method="post" action="AddCaisseServlet">
                    <div>
                        <div class="w-full surface-card" style="border-radius: 53px">
                            <div class="text-900 text-3xl font-medium text-center mb-3">FORMULAIRE</div>
                            <div>
                                <label class="block text-900 text-xl font-medium mb-2">Libelle</label>
                                <input
                                        type="text"
                                        name="libelle"
                                        class="w-full md:w-30rem mb-3 form-control"
                                        style="padding: 1rem"
                                        required
                                />
                                <div
                                        class="flex align-items-center justify-content-center pt-2 px-3 gap-2"
                                >
                                    <button class="btn w-full p-2 flex gap-2 border-1 shadow-1 cursor-pointer "
                                            style="background-color: #425DAE;border-radius: 10px;height: 3rem; color:white; text-align: center" ><span>Enregistrer</span></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>

        </div>
        <div class="col-md-8">
            <div class="container-fluid h-7rem p-4" style="background-color: #f5f7fa;">
                <div class="flex pt-4 px-3 gap-2 ">
                    <a href="CaisseGenerateServlet" type="button" class="btn float-left p-2 "
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
                                                        <th scope="col">Libelle</th>
                                                        <th scope="col">Montant</th>
                                                        <th scope="col" style="text-align: center;">Action</th>
                                                    </tr>
                                                    </thead>
                                                    <tbody>
                                                    <c:forEach items="${caisses}" var="caisse">
                                                        <tr>
                                                            <th>
                                                                    ${caisse.getLibelle()}
                                                            </th>
                                                            <th>${caisse.getMontants()} FCFA</th>
                                                            <th>
                                                                <div class="flex align-items-center justify-content-center pt-1 px-3 gap-2">
                                                                    <a href="UpdateCaisseServlet?libelle=${caisse.getLibelle()}" class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
                                                                       style="background-color: #425DAE; ">
                                                                        <span class="font-medium text-gray-900 white-space-nowrap" style="color: white !important;">Modifier</span>
                                                                    </a>
                                                                    <a href="DeleteCaisse?login=${caisse.getId()}" class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
                                                                       style="background-color: #ED5867;">
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
