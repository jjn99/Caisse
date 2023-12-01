<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 01/12/2023
  Time: 13:55
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
<%@ include file="../../assets/components/navbar.jsp" %>
<div class="container-fluid h-7rem p-4" style="background-color: #f5f7fa;">Barre de recherche</div>
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
                            <c:if test="${caisse.isActif() == true}">
                              <a  class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
                                  style="background-color: #425DAE; ">
                                <span class="font-medium text-gray-900 white-space-nowrap" style="color: white !important;">Gérer</span>
                              </a>
                            </c:if>
                            <c:if test="${caisse.isActif() == false}">
                              <a href="DecompteAlimenterServlet?caisseId=${caisse.getId()}"  class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "
                                  style="background-color: #425DAE; ">
                                <span class="font-medium text-gray-900 white-space-nowrap" style="color: white !important;">Alimenter</span>
                              </a>
                            </c:if>
<%--                            <c:if test="${caisse.isActif() == true}">--%>
<%--                              <a  class="btn p-2 flex align-items-center justify-content-center gap-2 border-1 shadow-1 cursor-pointer "--%>
<%--                                  style="background-color: #425DAE; ">--%>
<%--                                <span class="font-medium text-gray-900 white-space-nowrap" style="color: white !important;">Arrêter</span>--%>
<%--                              </a>--%>
<%--                            </c:if>--%>
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
