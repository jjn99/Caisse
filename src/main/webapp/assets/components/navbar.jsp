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
<%--    <style>--%>
<%--        .navbar {--%>
<%--            display: none--%>
<%--        }--%>
<%--        .navbar-expand-lg {--%>
<%--            -webkit-box-orient: horizontal;--%>
<%--            -webkit-box-direction: normal;--%>
<%--            -ms-flex-flow: row nowrap;--%>
<%--            flex-flow: row nowrap;--%>
<%--            -webkit-box-pack: start;--%>
<%--            -ms-flex-pack: start;--%>
<%--            justify-content: flex-start--%>
<%--        }--%>
<%--        .navbar-light .navbar-nav {--%>
<%--            color: rgba(0, 0, 0, .5)--%>
<%--        }--%>
<%--        .bg-blue-50 {--%>
<%--            background-color: #f5f9ff !important;--%>
<%--        }--%>
<%--        .container-fluid {--%>
<%--            width: 100%;--%>
<%--            padding-right: 15px;--%>
<%--            padding-left: 15px;--%>
<%--            margin-right: auto;--%>
<%--            margin-left: auto--%>
<%--        }--%>
<%--        .navbar-brand {--%>
<%--            display: inline-block;--%>
<%--            padding-top: .3125rem;--%>
<%--            padding-bottom: .3125rem;--%>
<%--            margin-right: 1rem;--%>
<%--            font-size: 1.25rem;--%>
<%--            line-height: inherit;--%>
<%--            white-space: nowrap--%>
<%--        }--%>
<%--        .pt-3 {--%>
<%--            padding-top: 1rem !important;--%>
<%--        }--%>
<%--        .mr-2 {--%>
<%--            margin-right: 0.5rem !important;--%>
<%--        }--%>
<%--        .justify-content-center {--%>
<%--            -webkit-box-pack: center !important;--%>
<%--            -ms-flex-pack: center !important;--%>
<%--            justify-content: center !important--%>
<%--        }--%>
<%--        .align-content-center {--%>
<%--            -ms-flex-line-pack: center !important;--%>
<%--            align-content: center !important--%>
<%--        }--%>
<%--        .d-flex {--%>
<%--            display: -webkit-box !important;--%>
<%--            display: -ms-flexbox !important;--%>
<%--            display: flex !important--%>
<%--        }--%>
<%--    </style>--%>
</head>
<body>
<nav class="navbar" style="background-color: #3F1F2B">
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
