<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 24/11/2023
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        .flex {
            display: flex !important;
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
        .text-xl {
            font-size: 1.25rem !important;
        }
        .mb-2 {
            margin-bottom: 0.5rem !important;
        }
        .w-full {
            width: 100% !important;
        }
        .form-control {
            display: block;
            width: 100%;
            padding: .375rem .75rem;
            font-size: 1rem;
            line-height: 1.5;
            color: #495057;
            background-color: #fff;
            background-clip: padding-box;
            border: 1px solid #ced4da;
            border-radius: .25rem;
            transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out
        }
        .btn {
            display: inline-block;
            font-weight: 400;
            text-align: center;
            white-space: nowrap;
            vertical-align: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
            border: 1px solid transparent;
            padding: .375rem .75rem;
            font-size: 1rem;
            line-height: 1.5;
            border-radius: .25rem;
            transition: color .15s ease-in-out, background-color .15s ease-in-out, border-color .15s ease-in-out, box-shadow .15s ease-in-out
        }
        .flex-shrink-0 {
            flex-shrink: 0 !important;
        }
        .surface-card {
            background-color: #ffffff !important;
        }
        .surface-ground {
            background-color: #ffffff !important;
        }
        .overflow-hidden {
            overflow: hidden !important;
        }
        .text-3xl {
            font-size: 1.75rem !important;
        }
        .font-medium {
            font-weight: 500 !important;
        }
        .mb-3 {
            margin-bottom: 1rem !important;
        }
        .block {
            display: block !important;
        }
        .md\:w-30rem {
            width: 30rem !important;
        }
    </style>
</head>
<body>
<div class="surface-ground flex align-items-center justify-content-center overflow-hidden">
    <div class="flex flex-column align-items-center justify-content-center">
        <img
                src="../../assets/images/caisse.png"
                alt="Caisse App"
                class="mb-3 w-10rem flex-shrink-0"
        />
        <form method="post" action="">
            <div>
                <div class="w-full surface-card" style="border-radius: 53px">
                    <div class="text-900 text-3xl font-medium text-center mb-3">FORMULAIRE CONNEXION</div>
                    <div>
                        <label class="block text-900 text-xl font-medium mb-2">Login</label>
                        <input
                                type="text"
                                class="w-full md:w-30rem mb-3 form-control"
                                style="padding: 1rem"
                        />
                        <label class="block text-900 font-medium text-xl mb-2"
                        >Mot de passe</label
                        >
                        <input
                                type="password"
                                class="w-full md:w-30rem mb-3 form-control"
                                style="padding: 1rem"
                        />
                        <button class="w-full btn"
                                style="background-color: #425DAE;height: 3rem; color:white;" ><span>S'identifier</span></button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
