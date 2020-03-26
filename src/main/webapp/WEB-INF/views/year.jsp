<!--
Created by IntelliJ IDEA.
User: SergejK
Date: 25-Jul-19
Time: 15:46
To change this template use File | Settings | File Templates.
-->

<%@ page import="java.time.format.DateTimeFormatter" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head><title>Year ${year}</title></head>
<head>
  <h1></h1>
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
<h1>Month list</h1>
<table>
  <tr>
    <th>${year}</th>
  </tr>

  <c:forEach var="month" items="${months}">
    <tr>
      <td>
        <strong>
          <a href="/calendar/month/${month}">${month.format(DateTimeFormatter.ofPattern("MMMM"))}
          </a>
        </strong>
      </td>
    </tr>
  </c:forEach>
</table>

<strong><a href="/">Back to first page</a></strong>
</body>
</html>
