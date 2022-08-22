<%--
  Created by IntelliJ IDEA.
  User: Dao Van Trong
  Date: 22/08/2022
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Tạo sp mới</h1>
<p>
    <a href="/sanpham1">Trở lại danh sách</a>
</p>
<form method="post">
    <legend>Thông tin khách hàng</legend>
    <table>
        <tr>
            <td>id</td>
            <td><input type="text" name="id" id="id"></td>
        </tr>
        <tr>
            <td>productName</td>
            <td><input type="text" name="productName" id="productName"></td>
        </tr>
        <tr>
            <td>priceName</td>
            <td><input type="text" name="priceName" id="priceName"></td>
        </tr>
        <tr>
            <td>productDescription</td>
            <td><input type="text" name="productDescription" id="productDescription"></td>
        </tr>
        <tr>
            <td>producer</td>
            <td><input type="text" name="producer" id="producer"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Nut bấm"></td>
        </tr>
    </table>
</form>
</body>
</html>
