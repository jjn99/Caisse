<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 30/11/2023
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%@ include file="../../styles/style.css" %>
    </style>
</head>
<body>

<%@ include file="../../assets/components/navbar.jsp"%>
<div class="surface-ground mt-3 flex align-items-center justify-content-center overflow-hidden">
    <div class="flex flex-column align-items-center justify-content-center">
        <button type="button" class="btn btn-primary" id="liveToastBtn">Show live toast</button>

        <div class="position-fixed bottom-0 end-0 p-3" style="z-index: 11">
            <div id="liveToast" class="toast hide" role="alert" aria-live="assertive" aria-atomic="true">
                <div class="toast-header">
                    <img src="..." class="rounded me-2" alt="...">
                    <strong class="me-auto">Bootstrap</strong>
                    <small>11 mins ago</small>
                    <button type="button" class="btn-close" data-bs-dismiss="toast" aria-label="Close"></button>
                </div>
                <div class="toast-body">
                    Hello, world! This is a toast message.
                </div>
            </div>
        </div>
<%--        <form>--%>
<%--            <div class="flex flex-wrap">--%>
<%--                <div class="text-900 text-3xl font-medium text-center mb-3">FORMULAIRE</div>--%>
<%--                <div class="col-12">--%>
<%--                    <div class="grid">--%>
<%--                        <div class="field col-12 col-md-4">--%>
<%--                            <label class="block text-900 text-xl font-medium mb-2">Nom</label>--%>
<%--                            <input--%>
<%--                                    name="nom"--%>
<%--                                    type="text"--%>
<%--                                    class="w-full md:w-30rem mb-3 form-control"--%>
<%--                            />--%>
<%--                        </div>--%>

<%--                        <div class="field col-12 col-md-4">--%>
<%--                            <label class="block text-900 text-xl font-medium mb-2">Prenom</label>--%>
<%--                            <input--%>
<%--                                    name="prenom"--%>
<%--                                    type="text"--%>
<%--                                    class="w-full md:w-30rem mb-3 form-control"--%>
<%--                            />--%>
<%--                        </div>--%>
<%--                        <div class="field col-12 col-md-4">--%>
<%--                            <label class="block text-900 text-xl font-medium mb-2">Telephone</label>--%>
<%--                            <input--%>
<%--                                    name="telephone"--%>
<%--                                    type="text"--%>
<%--                                    class="w-full md:w-30rem mb-3 form-control"--%>
<%--                            />--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <div class="grid">--%>
<%--                        <div class="field col-12 col-md-6">--%>
<%--                            <label class="block text-900 text-xl font-medium mb-2">Login</label>--%>
<%--                            <input--%>
<%--                                    name="login"--%>
<%--                                    type="text"--%>
<%--                                    class="w-full md:w-30rem mb-3 form-control"--%>
<%--                            />--%>
<%--                        </div>--%>

<%--                        <div class="field col-12 col-md-6">--%>
<%--                            <label class="block text-900 text-xl font-medium mb-2">Password</label>--%>
<%--                            <input--%>
<%--                                    name="password"--%>
<%--                                    type="password"--%>
<%--                                    class="w-full md:w-30rem mb-3 form-control"--%>
<%--                            />--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div--%>
<%--                    class="flex align-items-center justify-content-center pt-2 px-3 gap-2"--%>
<%--            >--%>
<%--                <button class="btn w-full p-2 flex gap-2 border-1 shadow-1 cursor-pointer "--%>
<%--                        style="background-color: #425DAE;border-radius: 10px;height: 3rem; color:white; text-align: center" ><span>S'identifier</span></button>--%>
<%--                <a href="HomeUserServlet" class="btn w-full p-2 flex gap-2 border-1 shadow-1 cursor-pointer "--%>
<%--                   style="background-color: #d9342b;border-radius: 10px;height: 3rem; color:white; text-align: center" ><span>Annuler</span></a>--%>
<%--            </div>--%>
<%--        </form>--%>
    </div>
</div>
<script>
    var toastElList = [].slice.call(document.querySelectorAll('.toast'))
    var toastList = toastElList.map(function (toastEl) {
        return new bootstrap.Toast(toastEl, option)
    })
</script>
</body>
</html>
