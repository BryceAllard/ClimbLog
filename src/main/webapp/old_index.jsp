<%@include file="taglib.jsp"%>
<c:import url="head.jsp" />
<html>
<body>
<h2>ClimbLog - Adventure Awaits</h2>
<form action="searchClimb" class="form-inline">
    <div class="form-group">
        <label for="searchTerm">Search</label>
        <input type="text" class="form-control" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter location">
    </div>
    <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
    <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all users</button>
</form>
</body>
</html>