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
<!DOCTYPE html>
<html>
<head>
    <title>Climbr Matches</title>
    <c:import url="head.jsp" />
</head>
<body>
<c:import url="nav.jsp" />

<!-- Main Content -->
<section class="w3-content w3-padding" style="max-width:1564px">
    <h1 class="w3-border-bottom w3-border-light-grey w3-padding-16 w3-panel" style="margin-top:10%;">Climbr Matches</h1>
    <div class="w3-responsive">
        <table class="w3-table-all">
            <thead>
            <tr class="w3-light-grey">
                <th>ID</th>
                <th>Username</th>
                <th>Email</th>
                <th>Rating</th>
                <th>Favorite Animal</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="match" items="${matches}">
                <tr>
                    <td>${match.id}</td>
                    <td>${match.username}</td>
                    <td>${match.email}</td>
                    <td>${match.rating}</td>
                    <td>${match.favAnimal}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</section>

<c:import url="footer.jsp" />
</body>
</html>
