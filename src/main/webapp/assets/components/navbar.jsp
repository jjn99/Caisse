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
    <title>Title</title>
    <%@include file="../../styles/styles.jsp"%>
</head>
<body>
<nav class="navbar" style="background-color: #425DAE">
    <div class="container-fluid">
        <p class="navbar-brand pt-2" style="color: white !important; font-size:24px;  list-style: none !important;">
            <i class="bi bi-type-strikethrough mr-2"></i>Caisse-Pro</p>
        <div class="justify-content-center align-content-center">
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
