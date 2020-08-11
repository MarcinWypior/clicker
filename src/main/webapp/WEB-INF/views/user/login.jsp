<%--
  Created by IntelliJ IDEA.
  User: dariu
  Date: 27.05.2020
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>formularz logowania</title>
    <link rel="stylesheet" href="<c:url value="../../../resources/css/style.css"/>"/>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>
<body>
<c:import url="../header.jsp"/>

    <c:if test="${not empty message}">
        ${message}
    </c:if>

    <form method="post">
        <div><label> nazwa urzytkownika: <input type="text" name="username"/> </label></div>
        <div><label> hasło: <input type="password" name="password"/> </label></div>
        <div><input type="submit" value="Sign In" name="zaloguj się"/></div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>


</body>
</html>
