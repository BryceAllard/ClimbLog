<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/4/24
  Time: 6:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="taglib.jsp"%>
<!DOCTYPE html>
<html>

<c:import url="head.jsp" />
<c:choose>
    <c:when test="${empty User}">
        <c:import url="nav.jsp" />
    </c:when>
    <c:otherwise>
        <c:import url="navIfLoggedIn.jsp" />
    </c:otherwise>
</c:choose>


<body>


<section class="header16 cid-u7iIcWYjMC mbr-fullscreen mbr-parallax-background" id="hero-17-u7iIcWYjMC">
    <div class="mbr-overlay" style="opacity: 0.3; background-color: rgb(0, 0, 0);"></div>
    <div class="container-fluid col-12 col-md-4" style="background-color: blanchedalmond">
        <form action="createClimb" method="post">
            <h2>Add Your Climb</h2>
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name">
            </div>
            <div class="form-group">
                <label for="state">State:</label>
                <input type="text" id="state" name="state">
            </div>
            <div class="form-group">
                <label for="difficulty">Difficulty:</label>
                <input type="number" id="difficulty" name="difficulty">
            </div>
            <div class="form-group">
                <label for="type">Type:</label>
                <input type="text" id="type" name="type">
            </div>
            <div class="form-group">
                <label for="userId">User ID:</label>
                <input type="text" id="userId" name="userId">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>
</body>
<c:import url="footer.jsp" />
</html>

