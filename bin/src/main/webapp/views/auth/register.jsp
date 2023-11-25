<%--
  Created by IntelliJ IDEA.
  User: 13476
  Date: 24/11/2023
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .flex {
            display: flex !important;
        }
        .flex-wrap {
            flex-wrap: wrap !important;
        }
        .col-12 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 100%;
        }
        .grid {
            display: flex;
            flex-wrap: wrap;
            margin-right: -0.5rem;
            margin-left: -0.5rem;
            margin-top: -0.5rem;
        }
        .field {
            margin-bottom: 1rem;
        }
        .md\:col-6 {
            flex: 0 0 auto;
            padding: 0.5rem;
            width: 50%;
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
        .flex-column {
            flex-direction: column !important;
        }
        .sm\:flex-row {
            flex-direction: row !important;
        }
        .justify-content-between {
            justify-content: space-between !important;
        }
        .align-items-center {
            align-items: center !important;
        }
        .gap-3 {
            gap: 1rem !important;
        }
        .py-2 {
            padding-top: 0.5rem !important;
            padding-bottom: 0.5rem !important;
        }
        .surface-ground {
            background-color: #ffffff !important;
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
        .justify-content-center {
            justify-content: center !important;
        }
        .overflow-hidden {
            overflow: hidden !important;
        }
    </style>
</head>
<body>
<div class="surface-ground flex align-items-center justify-content-center overflow-hidden">
    <div class="flex flex-column align-items-center justify-content-center">
    <form>
        <div class="flex flex-wrap">
            <div class="col-12">
                <div class="grid">
                    <div class="field col-12">
                        <label>Nom</label>
                        <input
                                type="text"
                                class="w-full form-control"
                        />
                    </div>

                    <div class="field col-12">
                        <label>Prenom</label>
                        <input
                                type="text"
                                class="w-full  form-control"
                        />
                    </div>
                </div>

                <div class="grid">
                    <div class="field col-12">
                        <label>Nom d'utilisateur</label>
                        <input
                                type="text"
                                class="w-full form-control"
                        />
                    </div>

                    <div class="field col-12 ">
                        <label>Email</label>
                        <input
                                type="email"
                                class="w-full form-control"
                        />
                    </div>
                </div>
            </div>
        </div>
        <div
                class="flex flex-column sm:flex-row justify-content-between align-items-center gap-3 p-2"
        >
            <button class="w-full btn"
                    style="background-color: #425DAE;height: 3rem; color:white;" ><span>S'identifier</span></button>
            <button class="w-full btn"
                    style="background-color: #d9342b;height: 3rem; color:white;" ><span>Annuler</span></button>
        </div>
    </form>
    </div>
</div>
</body>
</html>
