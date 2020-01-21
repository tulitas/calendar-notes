
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

      padding: 10px 0;
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
  </style>
  <title>${month}</title>

</head>
<body>

<h1>Sherlog Calendar</h1>

<strong style="padding-right: 50px"><a href="/addnew">Add New</a></strong>

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
        <div style="border: 1px solid black">
        <p style="color: #3e8e41">${day.additionalInformation}</p>

        <a href="${pageContext.request.contextPath}/options?work_date=${day.href}">${day.dayNumber}</a>
        </div>
      </c:if>
    </li>
  </c:forEach>
</ul>
</body>
</html>