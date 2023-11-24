<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 24/11/2023
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .grid {
            display: flex;
            flex-wrap: wrap;
            margin-right: -0.5rem;
            margin-left: -0.5rem;
            margin-top: -0.5rem;
        }
        .col-6 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 50%;
        }
        .col-3 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 25%;
        }

        .col-4 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 33.3333%;
        }

        .col-5 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 41.6667%;
        }
        .col-2 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 16.6667%;
        }
        .col {
            flex-grow: 1;
            flex-basis: 0;
            padding: 0.5rem;
        }
        .p-3 {
            padding: 1rem !important;
        }
        .m-1 {
            margin: 0.25rem !important;
        }
        .p-1 {
            padding: 0.25rem !important;
        }
        .justify-content-center {
            justify-content: center !important;
        }
        .align-items-center {
            align-items: center !important;
        }
        .text-center {
            text-align: center !important;
        }
        .menu-items {
            border-radius: .25rem !important;
            color: white !important;
        }
        .cursor-pointer {
            cursor: pointer !important;
        }
        .row {
            display: -webkit-box;
            display: -ms-flexbox;
            display: flex;
            -ms-flex-wrap: wrap;
            flex-wrap: wrap;
            margin-right: -15px;
            margin-left: -15px
        }
    </style>
</head>
<body>
    <div class="grid p-1">
        <div class="col-4 m-1" style="background-color: #f7f8f9; border-radius: .25rem;">
            <div class="table">
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">Code</th>
                        <th scope="col">Libelle</th>
                        <th scope="col">Prix</th>
                    </tr>
                    </thead>
                </table>
            </div>
            <div class="order-total">
                <hr style="background-color: #425DAE">
                <div>
                    <div class="col m-1">Order total:</div>
                    <div class="col">15000f CFA</div>
                </div>
            </div>
        </div>
        <div class="col-2 m-1" style="background-color: #f7f8f9; border-radius: .25rem;">
            <div class="grid p-1 align-items-center justify-content-center">
                <div class="col-4 p-3 m-1 text-center menu-items cursor-pointer" style="background-color: #3b82f6;">Beers</div>
                <div class="col-4 p-3 m-1 text-center menu-items cursor-pointer" style="background-color: #76db9b;">Wines</div>
                <div class="col-4 p-3 m-1 text-center menu-items cursor-pointer" style="background-color: #a855f7;">Pizzas</div>
                <div class="col-4 p-3 m-1 text-center menu-items cursor-pointer" style="background-color: #d9342b;">Deposit</div>
                <div class="col-4 p-3 m-1 text-center menu-items cursor-pointer" style="background-color: #eab308;">Juice</div>
                <div class="col-4 p-3 m-1 text-center menu-items cursor-pointer" style="background-color: #64748b;">Teas</div>
            </div>
        </div>
        <div class="col-6"></div>
    </div>
</body>
</html>
