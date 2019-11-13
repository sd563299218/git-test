<%--
  Created by IntelliJ IDEA.
  User: Pk
  Date: 2019/11/11
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/account/save" method="post">
    账户名称<input type="text" name="name"><br>
    账户金额<input type="text" name="money"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
