<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="header">

    <sec:authorize access="isAuthenticated()">
        <p class="inline-block">Zalogowany jako: <sec:authentication property="principal.username"/></p>
<%--        <p class="inline-block">Posiada role: <sec:authentication property="principal.authorities"/></p>--%>
    </sec:authorize>

    <sec:authorize access="isAuthenticated()">
        <form class="inline-block" action="<c:url value="/logout"/>" method="post">
            <input type="submit" value="Wyloguj">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </sec:authorize>
</header>
