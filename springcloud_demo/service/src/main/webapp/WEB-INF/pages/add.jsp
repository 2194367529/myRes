<%--
  Created by IntelliJ IDEA.
  User: gyl
  Date: 2020/4/14
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="add">
value:<input type="text" name="value"><br>
remark:<input type="text" name="remark"><br>
status:<input type="text" name="status"><br>
orgId:<input type="text" name="orgId"><br>
createBy:<input type="text" name="createBy"><br>
version:<input type="text" name="version"><br>
typeId:<select name="typeId">
<option value="1">level</option>
<option value="2">age</option>
</select><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
