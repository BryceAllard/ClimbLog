<%@include file="taglib.jsp"%>
<c:set var="title" value="Match" />
<c:import url="head.jsp" />
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/30/24
  Time: 5:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="climblog.com.climr.Match" %>
<%@ page import="climblog.persistence.MatchDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Climbr Matches</title>
</head>
<body>
<h1>Climbr Matches</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Email</th>
        <!-- TODO: Add more? -->
    </tr>
    </thead>
    <tbody>
    <c:forEach var="match" items="${matches}">
        <tr>
            <td>${match.id}</td>
            <td>${match.username}</td>
            <td>${match.email}</td>
            <!-- TODO: Add more? -->
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
