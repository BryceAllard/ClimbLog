<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/7/24
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="taglib.jsp"%>
<c:import url="head.jsp" />
<!-- Navbar (sit on top) -->
<div class="w3-top">
    <div class="w3-bar w3-white w3-wide w3-padding w3-card">
        <a href="${pageContext.request.contextPath}/logIn" class="w3-bar-item w3-button"><img src="images/png/logo-no-background.png"alt="logo" class="logo"></a>
        <!-- Float links to the right. Hide them on small screens -->
        <c:choose>
            <c:when test="${empty userName}">
                <div class="w3-right w3-hide-small">
                    <a href="${pageContext.request.contextPath}/logIn" class="w3-bar-item w3-button">Log In</a>
                </div>
            </c:when>
            <c:otherwise>
        <div class="w3-right w3-hide-small">
            <a href="${pageContext.request.contextPath}/searchClimb" class="w3-bar-item w3-button">Search Climb</a>
            <a href="${pageContext.request.contextPath}/match" class="w3-bar-item w3-button">Climbr Matches</a>
            <a href="${pageContext.request.contextPath}/createClimb" class="w3-bar-item w3-button">Create</a>
            <a href="${pageContext.request.contextPath}/deleteClimb" class="w3-bar-item w3-button">Create</a>
            <a href="logout" class="w3-bar-item w3-button">Log Out</a>
        </div>
            </c:otherwise>
        </c:choose>
    </div>
</div>
