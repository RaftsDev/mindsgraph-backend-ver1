<%@ include file="common/header.jspf" %>

		My JSP page with body for Mindsgraph-backend version 1
<br>

				<table>
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

<%@ include file="common/footer.jspf" %>