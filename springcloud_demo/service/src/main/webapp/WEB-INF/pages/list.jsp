<%--
  Created by IntelliJ IDEA.
  User: gyl
  Date: 2020/4/12
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            text-align: center;
        }
    </style>
</head>
<body>
<a href="toAdd">添加</a><br>
<table border="1">
    <tr>
        <td>dicId</td>
        <td>type</td>
        <td>description</td>
        <td>value</td>
        <td>remark</td>
        <td>status</td>
        <td>orgId</td>
        <td>createBy</td>
        <td>createTime</td>
        <td>updateBy</td>
        <td>updateTime</td>
        <td>version</td>
        <td>操作</td>
        <td>操作</td>

    </tr>
<c:forEach items="${dictionaries}" var="dictionary">
    <tr>
        <td>${dictionary.dicId}</td>
        <td>${dictionary.dictionaryType.type}</td>
        <td>${dictionary.dictionaryType.description}</td>
        <td>${dictionary.value}</td>
        <td>${dictionary.remark}</td>
        <td>${dictionary.status}</td>
        <td>${dictionary.orgId}</td>
        <td>${dictionary.createBy}</td>
        <td>${dictionary.createTime}</td>
        <td>${dictionary.updateBy}</td>
        <td>${dictionary.updateTime}</td>
        <td>${dictionary.version}</td>
        <td><a href="toUpdate?id=${dictionary.dicId}">修改</a></td>
        <td><a href="deleteById?id=${dictionary.dicId}">删除</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
