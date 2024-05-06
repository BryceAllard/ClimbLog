<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/4/24
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>
<html>
<%@include file="nav.jsp"%>
<body>
<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
    <img class="w3-image" src="images/climberBlueSky.jpg" alt="Climber with a blue sky" width="1500">
    <div class="w3-display-middle w3-margin-top w3-center">
        <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>Climb</b></span> <span class="w3-hide-small w3-text-light-grey">Log</span></h1>
    </div>
</header>

<!-- Page content -->
<div class="w3-content w3-padding" style="max-width:1564px">
    <!-- Project Section -->
    <div class="w3-container w3-padding-32" id="projects">
        <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Climb Deleted Successfully</h3>
        <p>Your climb has been deleted successfully. Check it out on the</p>
        <a href="${pageContext.request.contextPath}/searchClimb">Climb List</a>
    </div>
</div>
</body>
</html>
