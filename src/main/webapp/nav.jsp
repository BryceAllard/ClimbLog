<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/7/24
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="col-md-2">
    <div class="page-header">
        <img src="images/mainLogo" alt="logo" class="logo">
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
