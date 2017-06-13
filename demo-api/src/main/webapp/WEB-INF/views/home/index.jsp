<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/13 0013
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="application/javascript">
    function aa() {
        alert($("#productName").text());
    }
</script>
<html>
<head>
    <title>${title}</title>
    <link rel="stylesheet" href="${rc.contextPath}/css/index.css" />
    <script src="${rc.contextPath}/js/jquery-1.12.1.min.js"></script>
</head>
<body>
    <h3>index</h3>
    <p id="productName" class="content">productName:${productName}</p>
    <p>productPrice:${productPrice}</p>
<p>
    <ul>
        <c:forEach items="${myList}" var="item">
            <li>${item}</li>
        </c:forEach>
    </ul>
</p>
    <p><input type="button" value="点击" onclick="aa()"></p>
</body>
</html>
