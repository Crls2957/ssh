<%--
  Created by IntelliJ IDEA.
  User: luosen
  Date: 2019/2/22
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/add" method="get">
    <table align="center" border="1" bgcolor="aqua">
        <tr>
            <td align="right">用户名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td align="right">密&nbsp;&nbsp;码:</td>
            <td><input type="password" name="passwd"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="添加"></td>
        </tr>
    </table>
</form>
</body>
</html>
