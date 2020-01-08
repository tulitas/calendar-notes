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

        <title>Statistics</title>
    </head>

    <body>

    <h1>Statistics</h1>
    <div>
        <table>
            <tr>
                <th>Montazi</th>
                <td>
                    <c:out value="${statlist}"/>
                </td>
                <th>Minibasic</th>
                <td>
                    <c:out value="${minibasic}"/>
                </td>
                <th>Mini basic pluss</th>
                <td>
                    <c:out value="${minibasicpluss}"/>
                </td>
                <th>Optimum</th>
                <td>
                    <c:out value="${optimum}"/>
                </td>
                <th>Mini</th>
                <td>
                    <c:out value="${mini}"/>
                </td>
                <th>Premium</th>
                <td>
                    <c:out value="${premium}"/>
                </td>
            </tr>
            <tr>
                <th>Remonti</th>
                <td>
                    <c:out value="${remontList}"/>
                </td>
            </tr>
            <tr>
                <th>Snjatie</th>
                <td>
                    <c:out value="${snjatieList}"/>
                </td>
            </tr>
        </table>
    </div>
    <div style="float: right">
        <form action="${pageContext.request.contextPath}/options/getstatistics">
            <p>
                <label for="date"> Выберите месяц: </label><br/>
                <input id="date" type="month" name="date2"/>

                <br/>
                <button class="add_button"> Pievienot</button>

            </p>
        </form>
    </div>

    <div style="height: 200px; width: 100px; border: 3px dashed #e03c32; float: left">
        <p>
            <strong><a href="/">Years list</a></strong> <br/>
            <strong><a href="/addnew">Add New</a></strong>

        </p>
    </div>
    </body>
    </html>
