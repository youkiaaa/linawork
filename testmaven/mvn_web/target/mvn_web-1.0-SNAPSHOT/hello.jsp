<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/7/18
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<table>
    <tr>
        <h2>hello maven</h2>
    </tr>
    <tr>
        <td>username:</td><td><%=request.getParameter("username")%></td>
    </tr>
    <tr>
        <td>password:</td><td><%=request.getParameter("password")%></td>
    </tr>
</table>
</body>
</html>
