<%@ page import="com.example.caisse.dao.impl.UserDao" %>
<%@ page import="com.example.caisse.entities.Gestionnaire" %><%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 30/11/2023
  Time: 12:02
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
            String login = request.getParameter("login");
            UserDao userDao = new UserDao();
            Gestionnaire user = userDao.findByLogin(login);
        %>
        <form method="post" action="UpdateUserServlet">
            <div class="flex flex-wrap">
                <div class="text-900 text-3xl font-medium text-center mb-3">FORMULAIRE</div>
                <div class="col-12">
                    <div class="grid">
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Nom</label>
                            <input
                                    name="nom"
                                    type="text"
                                    required
                                    value="<%= user.getNom()%>"
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>

                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Prenom</label>
                            <input
                                    name="prenom"
                                    type="text"
                                    required
                                    value="<%= user.getPrenom()%>"
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>
                    </div>

                    <div class="grid">
                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Login</label>
                            <input
                                    name="login"
                                    type="text"
                                    required
                                    value="<%= user.getLogin()%>"
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>

                        <div class="field col-12 col-md-6">
                            <label class="block text-900 text-xl font-medium mb-2">Telephone</label>
                            <input
                                    name="telephone"
                                    type="text"
                                    required
                                    value="<%= user.getTelephone()%>"
                                    class="w-full md:w-30rem mb-3 form-control"
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
                <a href="HomeUserServlet" class="btn w-full p-2 flex gap-2 border-1 shadow-1 cursor-pointer "
                   style="background-color: #d9342b;border-radius: 10px;height: 3rem; color:white; text-align: center" ><span>Annuler</span></a>
            </div>
        </form>
    </div>
</div>
</body>
</html>
