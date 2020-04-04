<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        * {
            box-sizing: border-box;
        }

        ul {
            list-style-type: none;
        }

        body {
            font-family: Verdana, sans-serif;
        }

        .month {
            padding: 25px 25px;
            width: 100%;
            background: #1abc9c;
            text-align: center;
        }

        .month ul {
            margin: 0;
            padding: 0;
        }

        .month ul li {
            color: white;
            font-size: 20px;
            text-transform: uppercase;
            letter-spacing: 3px;
        }

        .month .prev {
            float: left;
            padding-top: 10px;
        }

        .month .next {
            float: right;
            padding-top: 10px;
        }

        .weekdays {
            margin: 0;
            padding: 10px 0;
            background-color: #ddd;
        }

        .weekdays li {
            display: inline-block;
            width: 13.6%;
            color: #666;
            text-align: center;
        }

        .days {

            padding: 5px 0;
            background: #eee;
            margin: 0;

        }

        .days li {
            list-style-type: none;
            display: inline-block;
            width: 13.6%;
            text-align: center;
            margin-bottom: 5px;
            font-size: 12px;
            color: #777;
        }

        .days li .active {
            padding: 5px;
            background: #1abc9c;
            color: white !important
        }


        /* Add media queries for smaller screens */
        @media screen and (max-width: 720px) {
            .weekdays li, .days li {
                width: 13.1%;
            }
        }

        @media screen and (max-width: 420px) {
            .weekdays li, .days li {
                width: 12.5%;
            }

            .days li .active {
                padding: 2px;
            }
        }

        @media screen and (max-width: 290px) {
            .weekdays li, .days li {
                width: 12.2%;
            }
        }

        @font-face {
            font-family: 'Open Sans';
            font-style: normal;
            font-weight: 700;
            src: local('Open Sans Bold'), local('OpenSans-Bold'), url(http://themes.googleusercontent.com/static/fonts/opensans/v6/k3k702ZOKiLJc3WVjuplzKRDOzjiPcYnFooOUGCOsRk.woff) format('woff');
        }

        body {
            background: #00008B;
            font-family: 'Open Sans', sans-serif;
        }

        h1 {
            text-transform: uppercase;
            text-align: center;
            font-weight: bold;
            font-style: italic;
            font-size: 40px;
        }

        h1.pink {
            color: #ffffff;
            text-shadow: 0 0 5px #ffffff,
            0 0 10px #ffffff,
            0 0 20px #ffffff,
            0 0 40px #ff00de,
            0 0 80px #ff00de,
            0 0 90px #ff00de,
            0 0 100px #ff00de,
            0 0 150px #ff00de;
        }

        .dayHref {
            padding: 25px;

        }

        .bord {
             border: 1px solid black
        }
    </style>

    <title>${month}</title>

</head>
<body>

<h1 class="pink">Sherlog Calendar</h1>

<button class="five"> <a href="/addnew">Add New</a></button>

<div class="month">
    <ul>
        <li class="prev"><a href="${previousMonth}">❮</a></li>
        <li class="next"><a href="${nextMonth}">❯</a></li>
        <li>${month}<br>
            <span style="font-size:18px">${year}</span>
        </li>
    </ul>
</div>

<ul class="weekdays">
    <li>Mo</li>
    <li>Tu</li>
    <li>We</li>
    <li>Th</li>
    <li>Fr</li>
    <li>Sa</li>
    <li>Su</li>
</ul>
<ul class="days">
    <c:forEach var="day" items="${days}">
        <li>

            <c:if test="${day.dayNumber != null}">
                <div class="bord" >
                    <p style="color: #3e8e41">${day.additionalInformation}</p>

                    <a class="dayHref"
                       href="${pageContext.request.contextPath}/options?workDate=${day.href}">${day.dayNumber}</a>
                </div>
            </c:if>
        </li>
    </c:forEach>
</ul>
</body>
</html>