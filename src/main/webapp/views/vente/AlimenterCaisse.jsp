<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 01/12/2023
  Time: 15:24
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
<div class="container surface-ground mt-3 flex align-items-center justify-content-center overflow-hidden">
    <div class="flex flex-column align-items-center justify-content-center">
        <form method="post" action="DecompteAlimenterServlet">
            <div class="flex flex-wrap">
                <div class="text-900 text-3xl font-medium text-center mb-3" style="text-align: center;">FORMULAIRE</div>
                <div class="col-12">
                    <div class="grid">
                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 10000 FCFA</label>
                            <input
                                    name="nb10000"
                                    type="number"
                                    required
                                    value="0"
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>

                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 5000 FCFA</label>
                            <input
                                    name="nb5000"
                                    type="number"
                                    value="0"
                                    required
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>
                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 2000 FCFA</label>
                            <input
                                    name="nb2000"
                                    type="number"
                                    value="0"
                                    required
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>
                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 1000 FCFA</label>
                            <input
                                    name="nb1000"
                                    type="number"
                                    value="0"
                                    required
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>
                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 500 FCFA</label>
                            <input
                                    name="nb500"
                                    type="number"
                                    value="0"
                                    required
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>
                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 250 FCFA</label>
                            <input
                                    name="nb250"
                                    type="number"
                                    value="0"
                                    required
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>
                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 200 FCFA</label>
                            <input
                                    name="nb200"
                                    type="number"
                                    value="0"
                                    required
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>
                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 100 FCFA</label>
                            <input
                                    name="nb100"
                                    type="number"
                                    value="0"
                                    required
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>
                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 50 FCFA</label>
                            <input
                                    name="nb50"
                                    type="number"
                                    value="0"
                                    required
                                    class="w-full md:w-30rem mb-3 form-control"
                            />
                        </div>
                        <div class="field col-12 col-md-4">
                            <label class="block text-900 text-xl font-medium mb-2">Nombre de 25 FCFA</label>
                            <input
                                    name="nb25"
                                    type="number"
                                    value="0"
                                    required
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
                <a href="venteHome.jsp" class="btn w-full p-2 flex gap-2 border-1 shadow-1 cursor-pointer "
                   style="background-color: #d9342b;border-radius: 10px;height: 3rem; color:white; text-align: center" ><span>Annuler</span></a>
            </div>
        </form>
    </div>
</div>
</body>
</html>
