<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
<c:import url="head.jsp" />

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#climbTable').DataTable();
    } );
</script>
<html>
<body>
<c:import url="nav.jsp" />

<div class="container-fluid">
    <h1 class="w3-border-bottom w3-border-light-grey w3-padding-16 w3-panel" style="margin-top:10%;">Search Results: </h1>
    <table id="climbTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>ID</th>
        <th>Name</th>
        <th>State</th>
        <th>Difficulty</th>
        <th>Type</th>
        <th>User</th>
        </thead>
        <tbody>
        <c:forEach var="climb" items="${climbs}">
            <tr>
                <td>${climb.id}</td>
                <td>${climb.name}</td>
                <td>${climb.state}</td>
                <td>${climb.difficulty}</td>
                <td>${climb.type}</td>
                <td>${climb.user.firstName} ${climb.user.lastName}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
