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

<%@include file="head.jsp"%>
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
        <!-- Project Section -->
        <div class="w3-container w3-padding-32" id="projects">
        <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Add Your Climb</h3>
        <form action="createClimb" method="post">
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
        </div>

<%@include file="footer.jsp"%>
        </body>
</html>
