<%@ include file="common/header.jspf" %>

		<h1>My JSP page with body for Mindsgraph-backend version 1.</h1>

<div class="container">
				<table class="table">
        			<tr>
        				<th>Id</th>
        				<th>First name</th>
        				<th>Last name</th>
        			</tr>
        			<c:forEach var="user" items="${users}">

        				<tr>
        					<td>${user.userId}</td>
        					<td>${user.firstName}</td>
        					<td>${user.lastName}</td>
        			    </tr>
        			</c:forEach>
        		</table>
<container>
<%@ include file="common/footer.jspf" %>