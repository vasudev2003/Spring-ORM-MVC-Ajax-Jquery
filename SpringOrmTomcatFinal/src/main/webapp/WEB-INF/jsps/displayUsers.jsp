<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/18/2023
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr><th>id</th><th>name</th><th>email</th></tr>
    <c:foreach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td> ${user.email}</td>
        </tr>

    </c:foreach>
</table>


</body>
</html>
