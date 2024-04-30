<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>
<html>
<body>
<%@include file="nav.jsp"%>
<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
    <img class="w3-image" src="/w3images/architect.jpg" alt="Architecture" width="1500" height="800">
    <div class="w3-display-middle w3-margin-top w3-center">
        <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>BR</b></span> <span class="w3-hide-small w3-text-light-grey">Architects</span></h1>
    </div>
</header>
<c:choose>
    <c:when test="${empty userName}">
        <h4 class="noUser">Uh oh, looks like you're not logged in. Let's fix that you so can find some climbs</h4>
        <!--<h5><a href = "logIn">Log in</a></h5> -->
    </c:when>
    <c:otherwise>

        <h3>Welcome ${userName}</h3>
        <h2>Click here to find some <a href="results.jsp">climbs</a></h2>
    </c:otherwise>
</c:choose>
</body>
</html>