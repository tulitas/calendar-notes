<!--
Created by IntelliJ IDEA.
User: SergejK
Date: 11/20/2019
Time: 4:27 PM
To change this template use File | Settings | File Templates.
-->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>

<head>
    <style>
        body {
            background: url("https://good-surf.ru/forum/urok/css/fon/images/big.jpg") no-repeat;
            background-size: 100%;

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

        a {

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

        aside {
            float: left;
            width: 250px;
        }

        section {
            margin-left: 280px;
            padding-bottom: 50px;
        }

        #choosedate {
            float: left;
            margin-top: 200px;
            margin-left: 20px;

        }

        table {
            font-family: "Times New Roman";
            font-size: 18px;
            text-align: center;
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
    </style>


</head>

<body>

<div id="wrapper">
    <header>
        <title>Statistics</title>
        <img src="https://www.sherloglatvia.com/wp-content/uploads/2016/06/logo.png" alt="sherlog" width="90"
             height="50"/>


    </header>


</div>

<div>
    <aside>

        <nav class="four">

            <ul class="topmenu">
                <li><a href="/">Home</a></li>

                <li><a href="#">Menu<i class="fa fa-angle-down"></i></a>
                    <ul class="submenu">
                        <li><a href="/statistics">Statistika</a></li>
                        <li><a href="/addnew">Pievienot jaunu</a></li>
                    </ul>
                </li>

            </ul>
        </nav>
        <div id="choosedate">
            <form action="${pageContext.request.contextPath}/options/getstatistics">
                <p>
                    <label for="date"> Выберите месяц: </label><br/>
                    <input id="date" type="month" name="date2"/>

                    <br/>
                    <button class="add_button"> Pievienot</button>

                </p>
            </form>
        </div>
    </aside>
</div>
<br/>


<section>
    <h1>Statistics</h1>
    <div>
        <table>
            <tr>
                <th>Darba veids</th>

                <th>Kopa</th>


                <th>Minibasic</th>
                <th>Minibasic pluss</th>
                <th>Optimum</th>
                <th>Mini</th>
                <th>Premium</th>
                <th>Mapon</th>
                <th>Igla</th>
                <th>Cita iekarta</th>
                <th>Summa</th>


            </tr>

            <tr>
                <th>Montaza</th>
                <td><c:out value="${statlist}"/></td>
                <td><c:out value="${minibasic}"/></td>
                <td><c:out value="${minibasicpluss}"/></td>
                <td><c:out value="${optimum}"/></td>
                <td><c:out value="${mini}"/></td>
                <td><c:out value="${premium}"/></td>
                <td><c:out value="${mapon}"/></td>
                <td><c:out value="${igla}"/></td>
                <td><c:out value="${citaiekarta}"/></td>
                <td><c:out value="${summa}"/></td>


            </tr>
            <tr>
                <th>Demontaza</th>

                <td><c:out value="${snjatieList}"/></td>


            </tr>
            <tr>
                <th>Remonts</th>
                <td><c:out value="${remontList}"/></td>
                <td><c:out value="${remminibasic}"/></td>
                <td><c:out value="${remminibasicplus}"/></td>
                <td><c:out value="${remoptimum}"/></td>
                <td><c:out value="${remmini}"/></td>
                <td><c:out value="${rempremium}"/></td>
                <td><c:out value="${remmapon}"/></td>
                <td><c:out value="${remigla}"/></td>
                <td><c:out value="${remcitaiekarta}"/></td>

            </tr>
            <tr>
                <th>Upgrade</th>
                <td><c:out value="${upgardes}"/></td>
            </tr>
            <tr>
                <th>Downgrade</th>
            </tr>
            <tr>
                <th>Pielikt GM</th>
            </tr>
            <tr>
                <th>AKB Maina</th>
            </tr>
            <tr>
                <th>Cita darbiba</th>
            </tr>
        </table>
    </div>
</section>


</body>
</html>
