<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 24/11/2023
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Caisse-Pro</title>
  <style>
      <%@ include file="../../styles/style.css"%>
  </style>
</head>
<body>
<div class="surface-ground flex align-items-center justify-content-center overflow-hidden">
    <div class="flex flex-column align-items-center justify-content-center">
        <img
                src="./assets/images/caisse.png"
                alt="Caisse App"
                class="mb-3 w-10rem flex-shrink-0"
        />
        <c:if test="${ !empty error_message}">
            <div class="alert alert-danger h-max-15rem d-flex text-align-center" role="alert">
               <div class="row">
                   <div>
                       <c:out value="${error_message}"/>
                   </div>
               </div>
            </div>
        </c:if>
        <form method="post" action="AuthLoginServlet">
            <div>
                <div class="w-full surface-card" style="border-radius: 53px">
                    <div class="text-900 text-3xl font-medium text-center mb-3">FORMULAIRE CONNEXION</div>
                    <div>
                        <label class="block text-900 text-xl font-medium mb-2">Login</label>
                        <input
                                type="text"
                                name="login"
                                class="w-full md:w-30rem mb-3 form-control"
                                style="padding: 1rem"
                                required
                        />
                        <label class="block text-900 font-medium text-xl mb-2"
                        >Mot de passe</label
                        >
                        <input
                                type="password"
                                name="password"
                                class="w-full md:w-30rem mb-3 form-control"
                                style="padding: 1rem"
                                required
                        />
                        <button class="w-full btn"
                                style="background-color: #425DAE;height: 3rem; color:white;" ><span>S'identifier</span></button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
