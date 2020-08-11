<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>formularz rejestracji</title>
    <link rel="stylesheet" href="<c:url value="../../../resources/css/style.css"/>"/>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>
<body>
<c:import url="../header.jsp"/>

<form:form method="post" cssClass="form" modelAttribute="user" action="/registration">
    <form:hidden path="id"/>
    <label>Imie
    <form:input path="username" placeholder="twoja ksywka"/>
    <form:errors path="username"/>
    </label>
    <label>Email
        <form:input path="email" placeholder="twój email"/>
        <form:errors path="email"/>
    </label>
    <label>Hasło
        <form:input path="password" placeholder="twoje hasło"/>
        <form:errors path="password" />
    </label>

    <input type="submit" name="zarejestruj mnie">
</form:form>

</body>
</html>
