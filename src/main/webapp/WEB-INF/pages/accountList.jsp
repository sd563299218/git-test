<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Pk
  Date: 2019/11/11
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示账户数据列表</title>
</head>
<body>
    <h1>显示账户数据列表</h1>
    <table border="1">
        <tr>
            <td>账户id</td>
            <td>账户名称</td>
            <td>账户金额</td>
        </tr>
        <c:forEach items="${accountList}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
        </c:forEach>
    </table>

</body>
</html>
