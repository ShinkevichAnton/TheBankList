<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.10.2019
  Time: 23:11
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
    <th>sumAccount</th>
</tr>
<c:forEach items="${user}" var="user">
    <tr>
        <td>${user.account}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
