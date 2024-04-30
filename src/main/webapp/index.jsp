<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>
<html>
<%@include file="nav.jsp"%>
<body>
<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
    <img class="w3-image" src="images/ClimberBlueSky.jpg" alt="Climber with a blue sky" width="1500">
    <div class="w3-display-middle w3-margin-top w3-center">
        <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>Climb</b></span> <span class="w3-hide-small w3-text-light-grey">Log</span></h1>
    </div>
</header>

<!-- Page content -->
<div class="w3-content w3-padding" style="max-width:1564px">
    <c:choose>
    <c:when test="${empty userName}">
    <h4 class="noUser">Uh oh, looks like you're not logged in. Let's fix that you so can find some climbs</h4>
    <!--<h5><a href = "logIn">Log in</a></h5> -->
    </c:when>
    <c:otherwise>

    <!-- Project Section -->
    <div class="w3-container w3-padding-32" id="projects">
        <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Projects</h3>
    </div>

    <div class="w3-row-padding">
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Summer House</div>
                <img src="/w3images/house5.jpg" alt="House" style="width:100%">
            </div>
        </div>
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Brick House</div>
                <img src="/w3images/house2.jpg" alt="House" style="width:100%">
            </div>
        </div>
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Renovated</div>
                <img src="/w3images/house3.jpg" alt="House" style="width:100%">
            </div>
        </div>
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Barn House</div>
                <img src="/w3images/house4.jpg" alt="House" style="width:100%">
            </div>
        </div>
    </div>

    <div class="w3-row-padding">
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Summer House</div>
                <img src="/w3images/house2.jpg" alt="House" style="width:99%">
            </div>
        </div>
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Brick House</div>
                <img src="/w3images/house5.jpg" alt="House" style="width:99%">
            </div>
        </div>
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Renovated</div>
                <img src="/w3images/house4.jpg" alt="House" style="width:99%">
            </div>
        </div>
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Barn House</div>
                <img src="/w3images/house3.jpg" alt="House" style="width:99%">
            </div>
        </div>
    </div>
        </c:otherwise>
        </c:choose>
</body>
</html>

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