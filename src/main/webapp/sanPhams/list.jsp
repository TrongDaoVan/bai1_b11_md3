<%--
  Created by IntelliJ IDEA.
  User: Dao Van Trong
  Date: 22/08/2022
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>sanPhamsList</title>
</head>
<body>
<h1>sanPhams</h1>
<table border="2px">
    <tr>
        <td>id</td>
        <td>productName</td>
        <td>priceName</td>
        <td>productDescription</td>
        <td>producer</td>
    </tr>
    <c:forEach var="sp" items="${requestScope['sanPhams']}">
        <tr>
            <td>${sp.id}</td>
            <td>${sp.productName}</td>
            <td>${sp.priceName}</td>
            <td>${sp.productDescription}</td>
            <td>${sp.producer}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
