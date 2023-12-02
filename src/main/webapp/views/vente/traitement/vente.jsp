<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 01/12/2023
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Caisse-Pro</title>
    <style>
        <%@ include file="../../../styles/style.css" %>
    </style>
</head>
<body>
<%@include file="../../../assets/components/navbar.jsp" %>
<div class="surface-ground mt-3 flex align-items-center justify-content-center overflow-hidden">
    <div class="flex flex-column align-items-center justify-content-center">
        <form method="post" action="VenteServlet">
            <div class="flex flex-wrap">
                <div class="text-900 text-3xl font-medium text-center mb-3">FORMULAIRE</div>
                <c:if test="${ !empty error}">
                    <div class="alert alert-danger h-max-15rem d-flex text-align-center" role="alert">
                        <div class="row">
                            <div>
                                <c:out value="${error}"/>
                            </div>
                        </div>
                    </div>
                </c:if>
                <div class="col-12">
                    <div class="grid">
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Libelle</label>
                            <input
                                    name="libelle"
                                    type="text"
                                    placeholder="Approvisonnement en ..."
                                    class="w-full md:w-30rem mb-3 form-control"
                                    required
                            />
                        </div>

                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Montant(F CFA)</label>
                            <input
                                    name="montant"
                                    type="number"
                                    class="w-full md:w-30rem mb-3 form-control"
                                    required
                            />
                        </div>
                    </div>

                    <div class="grid">
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Client</label>
                            <input
                                    name="beneficiaires"
                                    type="text"
                                    class="w-full md:w-30rem mb-3 form-control"
                                    required
                            />
                        </div>
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Adresse</label>
                            <input
                                    name="adresse"
                                    type="text"
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
                <a href="HomeVenteServlet" class="btn w-full p-2 flex gap-2 border-1 shadow-1 cursor-pointer "
                   style="background-color: #d9342b;border-radius: 10px;height: 3rem; color:white; text-align: center" ><span>Annuler</span></a>
            </div>
        </form>
    </div>
</div>
<%--    <div class="container-fluid">--%>
<%--        <div class="row">--%>
<%--            <div class="col-md-7 ">--%>
<%--                <div class="row">--%>
<%--                    <div>Recherche Bar--%>
<%--                    ${produits}--%>
<%--                    </div>--%>
<%--                    <div>--%>
<%--                        <section class="intro mt-1 p-1">--%>
<%--                        <div class="bg-image " >--%>
<%--                            <div class="mask d-flex align-items-center">--%>
<%--                                <div class="container">--%>
<%--                                    <div class="row justify-content-center">--%>
<%--                                        <div class="col-12">--%>
<%--                                            <div class="card">--%>
<%--                                                <div class="card-body p-1">--%>
<%--                                                    <div class="table-responsive table-scroll" data-mdb-perfect-scrollbar="true" style="position: relative;">--%>
<%--                                                        <table class="table table-striped mb-0">--%>
<%--                                                            <thead style="background-color: #425DAE; color: white;">--%>
<%--                                                            <tr>--%>
<%--                                                                <th scope="col">Code Product</th>--%>
<%--                                                                <th scope="col">Libelle</th>--%>
<%--                                                                <th scope="col">Prix</th>--%>
<%--                                                                <th scope="col">Quantity</th>--%>
<%--                                                            </tr>--%>
<%--                                                            </thead>--%>
<%--                                                            <tbody>--%>
<%--                                                            <c:forEach items="${produits}" var="produit">--%>
<%--                                                                <tr>--%>
<%--                                                                    <th>${produit.getCodeproduct()}</th>--%>
<%--                                                                    <th>${produit.getLibelle()}</th>--%>
<%--                                                                    <th>${produit.getPrice()}</th>--%>
<%--                                                                    <th>${produit.getQuantity()}</th>--%>
<%--                                                                </tr>--%>
<%--                                                            </c:forEach>--%>
<%--                                                            </tbody>--%>
<%--                                                        </table>--%>
<%--                                                    </div>--%>
<%--                                                </div>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </section>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="col-md-5">--%>
<%--                <div class="grid">--%>
<%--                    <div class="field col-md-6">--%>
<%--                        <input--%>
<%--                                name="codeproduit"--%>
<%--                                type="text"--%>
<%--                                placeholder="Code Du Produit"--%>
<%--                                class="w-full md:w-30rem mb-3 form-control"--%>
<%--                                required--%>
<%--                        />--%>
<%--                    </div>--%>
<%--                    <div class="field col-md-4">--%>
<%--                        <input--%>
<%--                                name="quantite"--%>
<%--                                type="number"--%>
<%--                                placeholder="Quantite "--%>
<%--                                class="w-full md:w-30rem mb-3 form-control"--%>
<%--                                required--%>
<%--                        />--%>
<%--                    </div>--%>
<%--                    <div class="field col-md-2">--%>
<%--                        <button class="btn w-full p-2 flex gap-2 border-1 shadow-1 cursor-pointer "--%>
<%--                                style="background-color: #425DAE;border-radius: 10px;height: 3rem; color:white; text-align: center" ><span>Enregistrer</span></button>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
</body>
</html>
