<%--
  Created by IntelliJ IDEA.
  User: Dao Van Trong
  Date: 22/08/2022
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Xóa Sản Phẩm</h1>
<p>
    <a href="/sanpham1">Về Trang Danh Sách Sản Phẩm</a>
</p>
<form method="post">
    <h3>Bạn có chắc không</h3>
    <fieldset>
        <legend>Thông Tin Sản Phẩm</legend>
        <table>
            <tr>
                <td>id</td>
                <td>${sanPham.id}</td>
            </tr>
            <tr>
                <td>Name</td>
                <td>${sanPham.productName}</td>
            </tr>
            <tr>
                <td>priceName</td>
                <td>${sanPham.priceName}</td>
            </tr>
            <tr>
                <td>productDescription</td>
                <td>${sanPham.productDescription}</td>
            </tr>
            <tr>
                <td>producer</td>
                <td>${sanPham.producer}</td>
            </tr>
            <tr>
                <input type="submit" value="Xóa là ân hận đấy :)">
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
