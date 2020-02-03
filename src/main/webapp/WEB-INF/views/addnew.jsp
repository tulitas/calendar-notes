<!--
Created by IntelliJ IDEA.
User: SergejK
Date: 12/9/2019
Time: 8:09 PM
To change this template use File | Settings | File Templates.
-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <style>

        button:hover {

            background-color: #3e8e41;
        }

        button:active {


            background-color: #3e8e41;
            box-shadow: 0 5px #666;
            transform: translateY(4px);
        }

        .add_button {
            padding: 15px 25px;
            font-size: 24px;
            text-align: center;
            cursor: pointer;
            outline: none;
            color: #fff;
            background-color: #00008B;
            border: none;
            border-radius: 15px;
            box-shadow: 0 9px #999;
        }

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

        input[type=text] {
            border: 2px coral;
            border-radius: 4px;
            background: cadetblue;
        }

        select {
            background: cadetblue;
            border-radius: 4px;
        }

        input {

            background: cadetblue;
            border-radius: 4px;
        }

        textarea {

            background: cadetblue;
            border-radius: 4px;

            top: 50%;
        }

        #wrapper {
            max-width: 960px;
            margin: 0;
        }


        aside {
            float: left;
            width: 250px;
        }

        section {
            margin-left: 280px;
            padding-bottom: 50px;
        }
    </style>
    <title>Sherlog Calendar</title></head>
<body>


<div id="wrapper">
    <header>
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
    </aside>
</div>
<br/>


<div>
    <section>
        <form action="${pageContext.request.contextPath}/options/create" method="post">
            <label for="car">Ievadi A/M marku un numuru</label><br/>
            <input type="text" name="car" id="car" size="40"/><br/>
            <br/>

            <label for="client">Ievadi klientu un tel.</label><br/>
            <input id="client" type="text" name="client" size="40"/>
            <br/>


            <label for="sistem">Izvelejies sistemu</label>
            <div><select id="sistem" name="sistem"> size="3" multiple="multiple"
                <option value="Optimum"/>
                optimum
                <option value="mini"/>
                mini
                <option value="premium"/>
                premium
                <option value="minibasic"/>
                mini basic
                <option value="minibasicpluss"/>
                mini basic pluss
                <option value="mapon"/>
                mapon
                <option value="igla"/>
                igla
                <option value="cita iekarta"/>
                cita iekarta

            </select></div>
            <br/>

            <div><label for="work">Izvelejies darba veidu</label><br/>
                <select id="work" name="work">
                    <option value="Montaz"/>
                    Montāža
                    <option value="Peremontaz"/>
                    Pārmontāža
                    <option value="Demontaz"/>
                    Demontāža
                    <option value="Remont"/>
                    Remonts
                    <option value="Zamena mesta"/>
                    Vietas maiņa
                    <option value="Downgrade"/>
                    Downgrade
                    <option value="Upgrade"/>
                    Upgrade
                    <option value="Pielikt GM"/>
                    Pielikt GM
                    <option value="Mainit GM"/>
                    Mainit GM
                    <option value="AKB Maina"/>
                    AKB Maiņa
                    <option value="Cita darbiba"/>
                    Cita darbība
                </select></div>
            <br/>

            <div><label for="manager">Kas veic ierakstu</label><br/>

                <select id="manager" name="manager"> size="3" multiple="multiple"
                    <option value="Agnese"/>
                    Agnese
                    <option value="Kristine"/>
                    Kristine
                    <option value="Inese"/>
                    Inese
                    <option value="Aigars"/>
                    Aigars
                </select></div>

            <p><label for="date"> Выберите дату: </label><br/>
                <input id="date" type="date" name="workdate"/>

            </p>

            <br/>


            <textarea id="info" cols="60" rows="6" name="info">info: </textarea>

            <p>
                <button class="add_button"> Pievienot</button>
            </p>

        </form>
    </section>
</div>

</body>
</html>
