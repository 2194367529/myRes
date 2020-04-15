<%--
  Created by IntelliJ IDEA.
  User: gyl
  Date: 2020/4/12
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user/login" method="post">
    用户名：<input type="text" name="username"><br>
    密&ensp;&ensp;码：<input type="password" name="password"><br>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
${msg}
</body>
</html>
