<%--
  Created by IntelliJ IDEA.
  User: Dao Van Trong
  Date: 22/08/2022
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chỉnh sửa khách hàng</h1>
<p>
    <a href="/sanpham1">Hiển thị danh sách sản phẩm</a>
</p>
<form method="post">
    <fieldset>
        <legend>Thông tin khách hàng</legend>
        <table>
            <tr>
                <td>id</td>
                <td><input type="text" name="id" id="id" value="${sanPham.id}"></td>
            </tr>
            <tr>
                <td>productName</td>
                <td><input type="text" name="productName" id="productName" value="${sanPham.productName}"></td>
            </tr>
            <tr>
                <td>priceName</td>
                <td><input type="text" name="priceName" id="priceName" value="${sanPham.priceName}"></td>
            </tr>
            <tr>
                <td>productDescription</td>
                <td><input type="text" name="productDescription" id="productDescription" value="${sanPham.productDescription}"></td>
            </tr>
            <tr>
                <td>producer</td>
                <td><input type="text" name="producer" id="producer" value="${sanPham.producer}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Nút Bấm"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
