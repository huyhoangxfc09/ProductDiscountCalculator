<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 31-Jan-23
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String productDescription = request.getParameter("Product Description");
    double price = Double.parseDouble(request.getParameter("List Price"));
    double discountPercent = Double.parseDouble(request.getParameter("Discount Percent"));
    double discountAmount = price*discountPercent*0.01;
    double discountPrice = price - discountAmount;
%>
    <h1>Thông tin <%=productDescription%></h1>
    <h2>Giá sau khi chết khấu <%=discountPrice%></h2>
</body>
</html>
