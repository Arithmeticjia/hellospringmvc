<%--
  Created by IntelliJ IDEA.
  User: Arithmetic
  Date: 2020/10/3
  Time: 10:28 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<b>登陆</b>
<form action="<%=request.getContextPath()%>/user/login" method="post">
    <table border="1" bgcolor="#add8e6" align="center">
        <tr>
            <td>姓名：</td>
            <td>
                <input type="text" name="uname" value="${uname}">
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <input type="text" name="upass" >
            </td>
        </tr>
        <tr>
            <td>确定密码：</td>
            <td>
                <input type="text" name="reupass" >
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登陆">
            </td>
        </tr>
    </table>
</form>
${msg}
</body>
</html>
