<%--
  Created by IntelliJ IDEA.
  User: hgg
  Date: 2018/6/10
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>登录界面</title>
</head>
<body>

    <h1 style="color:red">登录</h1>
    <form action="${pageContext.request.contextPath}/login.action" method="post">
        <table border="0">
            <tr>
                <td>账号：</td>
                <td><input id="loginAccount" type="text" name="loginAccount"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="loginPassword" type="password" name="loginPassword">
                </td>
            </tr>
        </table>
        <br>
        <input type="submit" value="登录" >
    </form>


</body>
</html>
