<%@include file="taglib.jsp"%>
<c:import url="head.jsp" />
<html>
<!-- TODO: implement actual logout logic -->
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
            <h4 class="noUser">Thanks for stopping by! Stay safe</h4>
            <h5><a href = "logIn">Log back in</a></h5>
        </div>
    <c:import url="footer.jsp" />
    </body>
</html>