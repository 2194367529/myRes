<%--
  Created by IntelliJ IDEA.
  User: gyl
  Date: 2020/4/14
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="update">
    id:<input type="text" name="dicId" value="${dic.dicId}" disabled>
    value:<input type="text" name="value" value="${dic.value}"><br>
    remark:<input type="text" name="remark" value="${dic.remark}"><br>
    status:<input type="text" name="status" value="${dic.status}"><br>
    orgId:<input type="text" name="orgId" value="${dic.orgId}"><br>
    createBy:<input type="text" name="updateBy" value="${dic.updateBy}"><br>
    version:<input type="text" name="version" value="${dic.version}"><br>
    typeId:<select name="typeId">
    <option>...</option>
    <option value="1">level</option>
    <option value="2">age</option>
</select><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
