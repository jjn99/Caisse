<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 24/11/2023
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>
        .flex {
            display: flex !important;
        }
        .overflow-hidden {
            overflow: hidden !important;
        }
        .flex-column {
            flex-direction: column !important;
        }
        .justify-content-center {
            justify-content: center !important;
        }
        .align-items-center {
            align-items: center !important;
        }
        .text-900 {
            color: #212121 !important;
        }
        .text-center {
            text-align: center !important;
        }
        .flex-shrink-0 {
            flex-shrink: 0 !important;
        }
        .text-3xl {
            font-size: 1rem !important;
        }
        .font-medium {
            font-weight: 500 !important;
        }
        .mb-3 {
            margin-bottom: 1rem !important;
        }
        .grid {
            display: flex;
            flex-wrap: wrap;
            margin-right: -0.5rem;
            margin-left: -0.5rem;
            margin-top: -0.5rem;
        }
        .flex {
            display: flex !important;
        }
        .flex-column {
            flex-direction: column !important;
        }
        .cursor-pointer {
            cursor: pointer !important;
        }
        .w-5rem {
            width: 5rem !important;
        }
        .flex-shrink-0 {
            flex-shrink: 0 !important;
        }
        .min-h-screen {
            min-height: 100vh !important;
        }
        .min-w-screen {
            min-width: 100vw !important;
        }
        .col-6 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 50%;
        }
        .md\:col-3 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 25%;
        }
        .lg\:col-2 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 16.6667%;
        }
        .p-3 {
            padding: 1rem !important;
        }
        .m-2 {
            margin: 0.5rem !important;
        }
        .p-6 {
            padding: 4rem !important;
        }
    </style>
</head>
<body>
    <div class="container align-items-center justify-content-center  overflow-hidden min-h-screen min-w-screen">
    <div class="grid p-6 ">
        <div class="col-6 md:col-3 lg:col-2 stock m-2 cursor-pointer" style="border: 1px solid #ED5867;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out" href="caisse/list">
            <div class="flex flex-column align-items-center justify-content-center">
                <img
                        src="./assets/images/icon-caisse.png"
                        alt="Menu Caisse"
                        class="mb-3 w-5rem flex-shrink-0"
                />
                <div class="text-900 text-3xl font-medium text-center">Caisse</div>
            </div>
        </div>
        <div class="col-6 md:col-3 lg:col-2 stock m-2 cursor-pointer" style="border: 1px solid #FF7800;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">
            <div class="flex flex-column align-items-center justify-content-center">
                <img
                        src="./assets/images/icon-statistiques.png"
                        alt="Menu day"
                        class="mb-3 w-5rem flex-shrink-0"
                />
                <div class="text-900 text-3xl font-medium text-center">Ma Journee</div>
            </div>
        </div>
        <div class="col-6 md:col-3 lg:col-2 stock m-2 cursor-pointer" style="border: 1px solid #52C4FE;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">
            <div class="flex flex-column align-items-center justify-content-center">
                <img
                        src="./assets/images/icon-stock.png"
                        alt="Menu Stock"
                        class="mb-3 w-5rem flex-shrink-0 "
                />
                <div class="text-900 text-3xl font-medium text-center">Stock</div>
            </div>
        </div>
        <div class="col-6 md:col-3 lg:col-2 stock m-2 cursor-pointer" style="border: 1px solid #9B59B6;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">
            <div class="flex flex-column align-items-center justify-content-center">
                <img
                        src="./assets/images/icon-user.png"
                        alt="Menu Users"
                        class="mb-3 w-5rem flex-shrink-0 "
                />
                <div class="text-900 text-3xl font-medium text-center">Utilisateurs</div>
            </div>
        </div>
        <div class="col-6 md:col-3 lg:col-2 stock m-2 cursor-pointer" style="border: 1px solid #1ABC9C;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">
            <div class="flex flex-column align-items-center justify-content-center">
                <img
                        src="./assets/images/icon-parametres.png"
                        alt="Menu Settings"
                        class="mb-3 w-5rem flex-shrink-0"
                />
                <div class="text-900 text-3xl font-medium text-center">Parametres</div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
