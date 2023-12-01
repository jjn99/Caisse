<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 25/11/2023
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@ include file="../../styles/style.css" %>
    </style>
</head>
<body>
<nav class="navbar" style="background-color: #425DAE">
    <div class="container-fluid">
        <a class="navbar-brand bi bi-type-strikethrough mr-2" href="homeServlet"
           style="color: white !important; text-decoration: none; font-size:24px;  list-style: none !important;"
        >Caisse-Pro</a>
        <div class="justify-content-center align-content-center">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0"></ul>
            <form class="d-flex">
                <div class="dropdown">
                    <button class="btn btn-light dropdown-toggle" type="button"
                            id="dropdownMenuButton1" data-bs-toggle="dropdown"
                            aria-expanded="false">Admin</button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                        <li><a class="dropdown-item" href="#">Logout</a></li>
                    </ul>
                </div>
            </form>
        </div>
    </div>
</nav>
</body>
</html>
