<%--
  Created by IntelliJ IDEA.
  User: SergejK
  Date: 3/7/2020
  Time: 11:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            background: url("https://good-surf.ru/forum/urok/css/fon/images/big.jpg") no-repeat;

            background-size: 100%;

        }


        .navbar a {
            float: left;
            font-size: 16px;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }


        .navbar a:hover, .dropdown:hover :focus {
            background-color: red;
        }


        .dropdown-content a {
            float: none;
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
            text-align: left;
        }

        .dropdown-content a:hover {
            background-color: #ddd;
        }


        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        textarea {

            position: absolute;
            top: 98px;
            right: 450px;


        }

        table {
            position: absolute;
            top: 200px;
            left: 210px;
        }

        @import url(https://fonts.googleapis.com/css?family=Lora);


        h2 {
            font-family: monospace;
            color: #606060;
        }

        nav {

            width: 200px;
            margin: 0 auto 30px;

        }

        ul {
            list-style: none;
            margin: 0;
            padding: 0;
        }

        .topmenu > li {

            display: grid;
            margin-right: 20px;
            position: relative;


        }

        .topmenu > li:last-child {
            margin-right: 20px;
        }

        .menu {

            display: block;
            padding: 10px 15px;
            text-decoration: none;
            outline: none;
            font-family: 'Lora', serif;
            transition: .5s linear;
        }

        .fa {
            font-family: "FontAwesome";
            color: inherit;
            padding-left: 10px;
        }

        .submenu {
            position: absolute;
            top: 100%;
            left: 0;
            width: 100%;
            z-index: 10;
            -webkit-transition: 0.5s ease-in-out;
            -moz-transition: 0.5s ease-in-out;
            -o-transition: 0.5s ease-in-out;
            transition: 0.5s ease-in-out;
        }

        .four ul {
            background: #FFD7A7;
            left: 50px;
        }

        .four .submenu {
            -webkit-transform: scaleY(0);
            -ms-transform: scaleY(0);
            transform: scaleY(0);
            -webkit-transform-origin: 0 0;
            -ms-transform-origin: 0 0;
            transform-origin: 0 0;
            background: #FFAB51;
        }

        .four ul li:hover .submenu {
            -webkit-transform: scaleY(1);
            -ms-transform: scaleY(1);
            transform: scaleY(1);
        }

        .four ul a {
            color: #9B4222;
        }

        .submenu li a {
            border-bottom: 1px solid rgba(255, 255, 255, .3);
            color: white;
        }

        .delete {

            width: auto;
            padding: 5px 10px;
            text-decoration: none;
            outline: none;
            font-family: 'Lora', serif;
            /*transition: .5s linear;*/
        }

        aside {
            float: left;
            width: 250px;
        }

        section {
            margin-left: 280px;
            padding-bottom: 50px;
        }

        table {
            font-family: "Times New Roman";
            font-size: 18px;
            text-align: center;
            margin-left: 50px;
        }

        th {
            font-size: 18px;
            font-weight: normal;
            background: #b9c9fe;
            border-top: 4px solid #aabcfe;
            border-bottom: 1px solid #fff;
            color: #039;
            padding: 8px;
        }

        td {
            background: #e8edff;
            border-bottom: 1px solid #fff;
            color: #669;
            border-top: 1px solid transparent;
            padding: 8px;
        }

        tr:hover td {
            background: #ccddff;
        }

        #blink1 {
            -webkit-animation: blink1 3s linear infinite;
            animation: blink1 3s linear infinite;
        }

        @-webkit-keyframes blink1 {
            0% {
                color: rgba(34, 34, 34, 1);
            }
            50% {
                color: rgba(34, 34, 34, 0);
            }
            100% {
                color: rgba(34, 34, 34, 1);
            }
        }

        @keyframes blink1 {
            0% {
                color: rgba(34, 34, 34, 1);
            }
            50% {
                color: rgba(34, 34, 34, 0);
            }
            100% {
                color: rgba(34, 34, 34, 1);
            }
        }

    </style>
    <title>Title</title>
</head>
<body>
<a><img src="https://www.sherloglatvia.com/wp-content/uploads/2016/06/logo.png" alt="sherlog" width="90"
        height="50"/></a>


<br/>
<aside>
    <nav class="four">

        <ul class="topmenu">
            <li><a class="menu" href="/">Home</a></li>

            <li><a href="#">Menu<i class="fa fa-angle-down"></i></a>
                <ul class="submenu">
                    <li><a class="menu" href="/statistics">Statistika</a></li>
                    <li><a class="menu" href="/addnew">Pievienot jaunu</a></li>
                </ul>
            </li>

        </ul>
    </nav>
</aside>
<h1 id="blink1">Jus pievienojat ierakstu, parbaudiet
    un neazmirstiet izmainit rezultatu uz PABEIGTS, kad darbs bus pabeigts!!!</h1>
<div>
    <section>
        <table>
            <tr>
                <th>Date</th>
                <th>Order</th>
                <th>Work</th>
                <th>Car</th>
                <th>Sistem</th>
                <th>Client</th>
                <th>Manager</th>
                <th>Info</th>
                <th>Action</th>
            </tr>
            <c:forEach var="jobForm" items="${optionsList}">

                <tr>
                    <td width=auto><b>${jobForm.workdate}</b><br><b>${jobForm.time}</b></td>
                    <td width=auto><b>Nr.</b>${jobForm.ordernum}</td>
                    <td width=auto>${jobForm.work}<br/><b>Pas: </b>${jobForm.worknote}</td>
                    <td width=auto><b>car: </b> ${jobForm.car}<br>
                        <b>modelis: </b>${jobForm.car_model}<br>
                        <b>V/N: </b>${jobForm.car_plate}<br>
                        <b>gads: </b>${jobForm.car_year}</td>
                    <td width=auto><b>Pieslegums: </b>${jobForm.sistem}<br>
                        <d><b>Cena: </b></d>
                            ${jobForm.price}</td>

                    <td width=auto><b>Vards: </b>${jobForm.client}<br>
                        <b>tel.: </b>${jobForm.phone}</td>
                    <td width="50">${jobForm.manager}</td>
                    <td width="50">${jobForm.info}</td>
                    <td width="50"><a class="delete" style="background: tomato"
                                      href="/options/delete${jobForm.id}">Delete</a><br/>
                        <br/><a class="delete" style="background: #3e8e41 " href="/options/edit${jobForm.id}">Edit</a>
                        <form action="${pageContext.request.contextPath}/options/sms" method="post">
                            <button class="sms">sms</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </section>
</div>
</body>
</html>
