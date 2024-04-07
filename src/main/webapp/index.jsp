<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>
<html>
<body>
<c:choose>
    <c:when test="${empty userName}">
        <h4>Uh oh, looks like you're not logged in. Let's fix that you so can find some climbs</h4>
        <h5><a href = "logIn">Log in</a></h5>
    </c:when>
    <c:otherwise>
        <h3>Welcome ${userName}</h3>
        <h2>Click here to find some <a href="results.jsp">climbs</a></h2>
    </c:otherwise>
</c:choose>
</body>
</html>