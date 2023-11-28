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
        .col-2 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 16.6667%;
        }
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
<%@include file="../assets/components/navbar.jsp" %>
    <div class="container align-items-center justify-content-center  overflow-hidden min-h-screen min-w-screen">
    <div class="grid p-6 ">
        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #ED5867;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out" href="caisse/list">
            <div class="flex flex-column align-items-center justify-content-center">
                <img
                        src="./assets/images/icon-caisse.png"
                        alt="Menu Caisse"
                        class="mb-3 w-5rem flex-shrink-0"
                />
                <div class="text-900 text-3xl font-medium text-center">Caisse</div>
            </div>
        </div>
        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #FF7800;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">
            <div class="flex flex-column align-items-center justify-content-center">
                <img
                        src="./assets/images/icon-statistiques.png"
                        alt="Menu day"
                        class="mb-3 w-5rem flex-shrink-0"
                />
                <div class="text-900 text-3xl font-medium text-center">Ma Journee</div>
            </div>
        </div>
        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #52C4FE;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">
            <div class="flex flex-column align-items-center justify-content-center">
                <img
                        src="./assets/images/icon-stock.png"
                        alt="Menu Stock"
                        class="mb-3 w-5rem flex-shrink-0 "
                />
                <div class="text-900 text-3xl font-medium text-center">Stock</div>
            </div>
        </div>
        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #9B59B6;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">
            <div class="flex flex-column align-items-center justify-content-center">
                <img
                        src="./assets/images/icon-user.png"
                        alt="Menu Users"
                        class="mb-3 w-5rem flex-shrink-0 "
                />
                <div class="text-900 text-3xl font-medium text-center">Utilisateurs</div>
            </div>
        </div>
        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #1ABC9C;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">
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


        <div class="container">
            <div class="p-2 border-round-xl" style="background: white;border: 1px solid #ED5867;border-radius: .25rem; width: 300px;">
                <div class="content bg-white h-full p-2">
                    <div class="flex align-items-center gap-2 py-2 px-3">
                        <i class="bi bi-piggy-bank"></i>
                        <span class="font-medium text-gray-900">Nom Caisse</span>
                    </div>
                    <div class="mt-3 content-image-wrapper relative text-center w-full flex align-items-center justify-content-center">
                        <div class="content-image bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                            <img src="./assets/images/icon-caisse.png" alt="Prime Coffee Shop" class="w-full" />
                        </div>
                </div>
                <div class="content-info">
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <button class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200" style="border-radius: 50px;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Views</span>
                        </button>
                        <button class="p-3 flex align-items-center justify-content-center w-5 gap-2 bg-gray-900 shadow-1 border-none cursor-pointer hover:bg-gray-800 transition-duration-200" style="border-radius: 50px;">
                            <span class="font-medium white-space-nowrap">Traiter</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>
        </div>
</div>
</body>
</html>
