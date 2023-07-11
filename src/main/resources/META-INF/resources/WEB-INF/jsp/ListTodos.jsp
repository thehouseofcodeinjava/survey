<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
		<div class="container">
		<hr>
			<h1>Your Todos</h1>
		</hr>
			<table class="table">
				<thead>
					<tr>
						<!--<th>id</th>-->
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
						<th>Delete/Update</th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${todos}" var="todo">
						<tr>
							<!--<td>${todo.id}</td>-->
							<td>${todo.description}</td>
							<td>${todo.target}</td>
							<td>${todo.done}</td>
							<td><a href= "delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a> &nbsp;&nbsp;<a href= "update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		<a href="add-todo" class="btn btn-success">Add ToDo</a>
		</div>
<%@ include file="common/footer.jspf" %>