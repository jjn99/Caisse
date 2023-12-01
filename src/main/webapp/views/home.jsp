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
    <title>Caisse-Pro</title>
    <style>
        <%@ include file="../styles/style.css" %>
    </style>
</head>
<body>
<%@include file="../assets/components/navbar.jsp" %>
    <div class="container align-items-center justify-content-center  overflow-hidden min-h-screen min-w-screen">
    <div class="grid p-6 ">
        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #ED5867;border-radius: .25rem; width: 250px;">
            <div class="bg-white p-2">
                <div class="mt-3 relative text-center w-full flex align-items-center justify-content-center">
                    <div class="bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-caisse.png" alt="Caisse" class="w-full" />
                    </div>
                </div>
                <div class="mt-2 mb-2 flex align-items-center justify-content-center gap-2 w-full ">
                    <div class="flex align-items-center justify-content-between py-2 px-3 gap-2">
                        <div class="flex align-items-center gap-2">
                            <i class="bi bi-piggy-bank"></i>
                            <span class="text-gray-900 white-space-nowrap">Nombre:</span>
                        </div>
                        <div class="flex align-items-center gap-2">
                            <span class="text-gray-900 white-space-nowrap">${caisses}</span>
                        </div>
                    </div>
                </div>
                <div >
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <a href="HomeCaisseServlet" class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200"
                           style="border-radius: 50px;text-decoration: none; color: black;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Caisse</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #52C4FE;border-radius: .25rem; width: 250px;">
            <div class="content bg-white p-2">
                <div class="mt-3 relative text-center w-full flex align-items-center justify-content-center">
                    <div class="bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-stock.png" alt="Stock" class="w-full" />
                    </div>
                </div>
                <div class="mt-2 mb-2 flex align-items-center justify-content-center gap-2 w-full ">
                    <div class="flex align-items-center justify-content-between py-2 px-3 gap-2">
                        <div class="flex align-items-center gap-2">
                            <i class="bi bi-server"></i>
                            <span class="font-small text-gray-900 white-space-nowrap">Nombre:</span>
                        </div>
                        <div class="flex align-items-center gap-2">
                            <span class="font-small text-gray-900 white-space-nowrap">
                                ${products}
                            </span>
                        </div>
                    </div>
                </div>
                <div >
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <a href="HomeProduits" class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200"
                           style="border-radius: 50px;text-decoration: none; color: black;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Stock</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #FF7800;border-radius: .25rem; width: 250px;">
            <div class="content bg-white p-2">
                <div class="mt-3 content-image-wrapper relative text-center w-full flex align-items-center justify-content-center">
                    <div class="content-image bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-statistiques.png" alt="Journee" class="w-full" />
                    </div>
                </div>
                <div class="mt-2 mb-2 flex align-items-center justify-content-center gap-2 w-full ">
                    <div class="flex align-items-center justify-content-between py-2 px-3 gap-2">
                        <div class="flex align-items-center gap-2">
                            <i class="bi bi-skip-start"></i>
                            <span class="font-small text-gray-900 white-space-nowrap">Vente</span>
                        </div>
                        <div class="flex align-items-center gap-2">
                            <span class="font-small text-gray-900 white-space-nowrap"></span>
                        </div>
                    </div>
                </div>
                <div>
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <a href="HomeVenteServlet" class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200"
                           style="border-radius: 50px;text-decoration: none; color: black;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Vente</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #9B59B6;border-radius: .25rem; width: 250px;">
            <div class="content bg-white p-2">
                <div class="mt-3 content-image-wrapper relative text-center w-full flex align-items-center justify-content-center">
                    <div class="content-image bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-user.png" alt="Utilisateur" class="w-full" />
                    </div>
                </div>
                <div class="mt-2 mb-2 flex align-items-center justify-content-center gap-2 w-full ">
                    <div class="flex align-items-center justify-content-between py-2 px-3 gap-2">
                         <div class="flex align-items-center gap-2">
                             <i class="bi bi-server"></i>
                             <span class="font-small text-gray-900 white-space-nowrap">Nombre:</span>
                         </div>
                         <div class="flex align-items-center gap-2">
                             <span class="font-small text-gray-900 white-space-nowrap">
                                 ${users}
                             </span>
                         </div>
                    </div>
                </div>
                <div >
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <a href="HomeUserServlet" class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200"
                           style="border-radius: 50px;text-decoration: none; color: black;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Utilisateurs</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #1ABC9C;border-radius: .25rem; width: 250px;">
            <div class="content bg-white p-2">
                <div class="mt-3 content-image-wrapper relative text-center w-full flex align-items-center justify-content-center">
                    <div class="content-image bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-parametres.png" alt="Parametres" class="w-full" />
                    </div>
                </div>
                <div class="mt-2 mb-2 flex align-items-center justify-content-center gap-2 w-full ">
                    <div class="flex align-items-center justify-content-between py-2 px-3 gap-2">
                        <div class="flex align-items-center gap-2">
                            <i class="bi bi-gear"></i>
                            <span class="font-small text-gray-900 white-space-nowrap">Statistique</span>
                        </div>
                        <div class="flex align-items-center gap-2">
                            <span class="font-small text-gray-900 white-space-nowrap"></span>
                        </div>
                    </div>
                </div>
                <div >
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <a href="DRGenerateServlet" class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200"
                           style="border-radius: 50px;text-decoration: none; color: black;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Parametres</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
