<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 29.09.2019
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <button><a href="dao.jsp">Перейти к выборке из БД</a> </button>
  <hr>
  <form action="richestuser" method="get">
    <input type="text" name="richestuser" placeholder="richest user" disabled="disabled" /><input type="submit" value="get" />
  </form>
  <form action="accounts sum" method="get">
    <input type="text" name="accountssum" placeholder="accounts sum" disabled="disabled" /><input type="submit" value="get" />
  </form>

  </body>
</html>
