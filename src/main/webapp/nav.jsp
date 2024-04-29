<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/7/24
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>W3.CSS Template</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<!-- Navbar (sit on top) -->
<div class="w3-top">
    <div class="w3-bar w3-white w3-wide w3-padding w3-card">
        <a href="${pageContext.request.contextPath}/login" class="w3-bar-item w3-button"><img src="images/png/logo-no-background.png"alt="logo" class="logo"></a>
        <!-- Float links to the right. Hide them on small screens -->
        <div class="w3-right w3-hide-small">
<c:choose>
    <c:when test="${empty userName}">
        <a href="${pageContext.request.contextPath}/login" class="w3-bar-item w3-button">Log In</a>
    </c:when>
    <c:otherwise>
            <a href="${pageContext.request.contextPath}/login" class="w3-bar-item w3-button">Log In</a>
            <a href="${pageContext.request.contextPath}/searchClimb" class="w3-bar-item w3-button">Search Climb</a>
            <a href="${pageContext.request.contextPath}/" class="w3-bar-item w3-button">Climbr Matches</a>
            <a href="logout" class="w3-bar-item w3-button">Log Out</a>
        </div>
        </c:otherwise>
        </c:choose>
    </div>
</div>
<!--
<div class="col-md-2">
    <div class="page-header">
        <img src="images/png/logo-no-background.png" alt="logo" class="logo">
    </div>
    <ul class="nav flex-column nav-pills">

        <c:choose>
            <c:when test="${empty userName}">
                <li class="nav-item">
                    <a class="nav-link" href="logIn">Log In</a>
                </li>
            </c:when>
            <c:otherwise>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/login">Log In</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/searchClimb">Search Climb</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/">Fun Fact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="logout">Log Out</a>
                </li>
            </c:otherwise>
        </c:choose>
    </ul>
</div>
-->