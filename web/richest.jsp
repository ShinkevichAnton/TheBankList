<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.10.2019
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
table>
<tr>
    <th>Id</th>
    <th>Name</th>
    <th>Surname</th>
</tr>
<c:forEach items="${user}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.surname}</td>

    </tr>
</c:forEach>
</body>
</html>
