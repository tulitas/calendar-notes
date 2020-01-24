<?xml version="1.0" encoding="UTF-8"?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" %>

    <html>
    <head>
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
    </head>
    <body>

    <h2>Years List</h2>
    <td><c:out value="${message}"/></td>
    <table>
      <tr>
        <th>Year</th>
      </tr>
      <tr>
        <!--            ssilka na 2019-->
        <td><strong><a href="${pageContext.request.contextPath}/calendar/year/2019">2019</a></strong></td>
      </tr>
      <tr>
        <td><a href="${pageContext.request.contextPath}/calendar/year/2020"/> 2020</td>

      </tr>
      <tr>
        <td><a href="${pageContext.request.contextPath}/calendar/year/2021"/> 2021</td>

      </tr>
      <tr>
        <td><a href="${pageContext.request.contextPath}/calendar/year/2022"/>2022</td>

      </tr>
      <tr>
        <td>2023</td>

      </tr>
      <tr>
        <td>2024</td>

      </tr>
    </table>

    </body>
    </html>
