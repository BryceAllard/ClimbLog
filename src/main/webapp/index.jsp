<%@include file="taglib.jsp"%>
<c:import url="head.jsp" />
<html>

<body>
<c:import url="navLoginCheck.jsp" />
<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
    <img class="w3-image" src="images/climberBlueSky.jpg" alt="Climber with a blue sky" width="1500">
    <div class="w3-display-middle w3-margin-top w3-center">
        <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>Climb</b></span> <span class="w3-hide-small w3-text-light-grey">Log</span></h1>
    </div>
</header>

<!-- Page content -->
<div class="w3-content w3-padding" style="max-width:1564px">
    <c:choose>
    <c:when test="${empty userName}">
    <h4 class="noUser">Uh oh, looks like you're not logged in. Let's fix that you so can find some climbs</h4>
    <h5><a href = "logIn">Log in</a></h5>
    </c:when>
    <c:otherwise>

    <!-- Project Section -->
    <div class="w3-container w3-padding-32" id="projects">
        <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Check us out</h3>
    </div>

    <div class="w3-row-padding">
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Find a route</div>
                <img src="images/walkingPath2.jpg" alt="Hiker hiking down a path" style="width:99%">
            </div>
        </div>
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Training Plans</div>
                <img src="images/trainingPlan1.jpg" alt="Climber with chalk" style="width:99%">
            </div>
        </div>
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Climbr Matches</div>
                <img src="images/partner4.jpg" alt="Partners climbing" style="width:99%">
            </div>
        </div>
        <div class="w3-col l3 m6 w3-margin-bottom">
            <div class="w3-display-container">
                <div class="w3-display-topleft w3-black w3-padding">Monthly Spotlight</div>
                <img src="images/closeUp.jpg" alt="Climber portrait" style="width:99%">
            </div>
        </div>
    </div>
        </c:otherwise>
        </c:choose>
</body>
</html>