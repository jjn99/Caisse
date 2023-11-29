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
</head>
<body>
<%@include file="../assets/components/navbar.jsp" %>
    <div class="container align-items-center justify-content-center  overflow-hidden min-h-screen min-w-screen">
    <div class="grid p-6 ">

        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #ED5867;border-radius: .25rem; width: 250px;">
            <div class="content bg-white p-2">
                <div class="mt-3 content-image-wrapper relative text-center w-full flex align-items-center justify-content-center">
                    <div class="content-image bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-caisse.png" alt="Prime Coffee Shop" class="w-full" />
                    </div>
                </div>
                <div class="mt-2 mb-2 flex align-items-center justify-content-center gap-2 w-full ">
                    <div class="flex align-items-center justify-content-between py-2 px-3 gap-2">
                        <div class="flex align-items-center gap-2">
                            <i class="bi bi-piggy-bank"></i>
                            <span class="font-small text-gray-900 white-space-nowrap">Nombre:</span>
                        </div>
                        <div class="flex align-items-center gap-2">
                            <span class="font-small text-gray-900 white-space-nowrap">00</span>
                        </div>
                    </div>
                </div>
                <div class="content-info">
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <button class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200" style="border-radius: 50px;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Caisse</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>

        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #52C4FE;border-radius: .25rem; width: 250px;">
            <div class="content bg-white p-2">
                <div class="mt-3 content-image-wrapper relative text-center w-full flex align-items-center justify-content-center">
                    <div class="content-image bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-stock.png" alt="Prime Coffee Shop" class="w-full" />
                    </div>
                </div>
                <div class="mt-2 mb-2 flex align-items-center justify-content-center gap-2 w-full ">
                    <div class="flex align-items-center justify-content-between py-2 px-3 gap-2">
                        <div class="flex align-items-center gap-2">
                            <i class="bi bi-server"></i>
                            <span class="font-small text-gray-900 white-space-nowrap">Nombre:</span>
                        </div>
                        <div class="flex align-items-center gap-2">
                            <span class="font-small text-gray-900 white-space-nowrap">00</span>
                        </div>
                    </div>
                </div>
                <div class="content-info">
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <button class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200" style="border-radius: 50px;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Stock</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>

        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #FF7800;border-radius: .25rem; width: 250px;">
            <div class="content bg-white p-2">
                <div class="mt-3 content-image-wrapper relative text-center w-full flex align-items-center justify-content-center">
                    <div class="content-image bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-statistiques.png" alt="Prime Coffee Shop" class="w-full" />
                    </div>
                </div>
                <div class="mt-2 mb-2 flex align-items-center justify-content-center gap-2 w-full ">
                    <div class="flex align-items-center justify-content-between py-2 px-3 gap-2">
                        <div class="flex align-items-center gap-2">
                            <i class="bi bi-skip-start"></i>
                            <span class="font-small text-gray-900 white-space-nowrap">Action</span>
                        </div>
                        <div class="flex align-items-center gap-2">
                            <span class="font-small text-gray-900 white-space-nowrap"></span>
                        </div>
                    </div>
                </div>
                <div class="content-info">
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <button class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200" style="border-radius: 50px;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Ma Journee</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>

        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #9B59B6;border-radius: .25rem; width: 250px;">
            <div class="content bg-white p-2">
                <div class="mt-3 content-image-wrapper relative text-center w-full flex align-items-center justify-content-center">
                    <div class="content-image bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-user.png" alt="Prime Coffee Shop" class="w-full" />
                    </div>
                </div>
                <div class="mt-2 mb-2 flex align-items-center justify-content-center gap-2 w-full ">
                    <div class="flex align-items-center justify-content-between py-2 px-3 gap-2">
                         <div class="flex align-items-center gap-2">
                             <i class="bi bi-server"></i>
                             <span class="font-small text-gray-900 white-space-nowrap">Nombre:</span>
                         </div>
                         <div class="flex align-items-center gap-2">
                             <span class="font-small text-gray-900 white-space-nowrap">00</span>
                         </div>
                    </div>
                </div>
                <div class="content-info">
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <button class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200" style="border-radius: 50px;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Utilisateurs</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>

        <div class="col m-2 p-2 border-round-xl" style="background: white;border: 1px solid #1ABC9C;border-radius: .25rem; width: 250px;">
            <div class="content bg-white p-2">
                <div class="mt-3 content-image-wrapper relative text-center w-full flex align-items-center justify-content-center">
                    <div class="content-image bg-cover bg-no-repeat bg-center h-auto w-7rem z-4" style="border-radius: 70px;">
                        <img src="./assets/images/icon-parametres.png" alt="Prime Coffee Shop" class="w-full" />
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
                <div class="content-info">
                    <div class="flex align-items-center justify-content-center pt-2 px-3 gap-2">
                        <button class="p-3 flex align-items-center justify-content-center w-7 gap-2 bg-white border-1 shadow-1 cursor-pointer hover:bg-black-alpha-10 transition-duration-200" style="border-radius: 50px;">
                            <span class="font-medium text-gray-900 white-space-nowrap">Parametres</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>

    <%--        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #ED5867;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out" href="caisse/list">--%>
<%--            <div class="flex flex-column align-items-center justify-content-center">--%>
<%--                <img--%>
<%--                        src="./assets/images/icon-caisse.png"--%>
<%--                        alt="Menu Caisse"--%>
<%--                        class="mb-3 w-5rem flex-shrink-0"--%>
<%--                />--%>
<%--                <div class="text-900 text-3xl font-medium text-center">Caisse</div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #FF7800;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">--%>
<%--            <div class="flex flex-column align-items-center justify-content-center">--%>
<%--                <img--%>
<%--                        src="./assets/images/icon-statistiques.png"--%>
<%--                        alt="Menu day"--%>
<%--                        class="mb-3 w-5rem flex-shrink-0"--%>
<%--                />--%>
<%--                <div class="text-900 text-3xl font-medium text-center">Ma Journee</div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #52C4FE;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">--%>
<%--            <div class="flex flex-column align-items-center justify-content-center">--%>
<%--                <img--%>
<%--                        src="./assets/images/icon-stock.png"--%>
<%--                        alt="Menu Stock"--%>
<%--                        class="mb-3 w-5rem flex-shrink-0 "--%>
<%--                />--%>
<%--                <div class="text-900 text-3xl font-medium text-center">Stock</div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #9B59B6;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">--%>
<%--            <div class="flex flex-column align-items-center justify-content-center">--%>
<%--                <img--%>
<%--                        src="./assets/images/icon-user.png"--%>
<%--                        alt="Menu Users"--%>
<%--                        class="mb-3 w-5rem flex-shrink-0 "--%>
<%--                />--%>
<%--                <div class="text-900 text-3xl font-medium text-center">Utilisateurs</div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="col-2 stock m-2 cursor-pointer" style="border: 1px solid #1ABC9C;border-radius: .25rem; transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out">--%>
<%--            <div class="flex flex-column align-items-center justify-content-center">--%>
<%--                <img--%>
<%--                        src="./assets/images/icon-parametres.png"--%>
<%--                        alt="Menu Settings"--%>
<%--                        class="mb-3 w-5rem flex-shrink-0"--%>
<%--                />--%>
<%--                <div class="text-900 text-3xl font-medium text-center">Parametres</div>--%>
<%--            </div>--%>
<%--        </div>--%>
    </div>
</div>
</body>
</html>
