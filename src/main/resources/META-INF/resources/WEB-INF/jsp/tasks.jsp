<%@ include file="common/header.jspf" %>

		<h1>My JSP page with body for Mindsgraph-backend version 1.</h1>
		<h2> Table Tasks<h2>

<div class="container">
				<table class="table">
        			<tr>
        				<th>Task Id</th>
        				<th>Parent Id</th>
        				<th>Name</th>
        				<th>Description</th>
        				<th>User Id</th>
        			</tr>
        			<c:forEach var="task" items="${tasks}">

        				<tr>
        					<td>${task.taskId}</td>
        					<td>${task.parentId}</td>
        					<td>${task.name}</td>
        					<td>${task.description}</td>
        					<td>${task.parentId}</td>
        			    </tr>
        			</c:forEach>
        		</table>
<container>
<%@ include file="common/footer.jspf" %>