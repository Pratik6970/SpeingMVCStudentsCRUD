<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@page isELIgnored="false"%>
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Change Student</h1>
				<form action="${pageContext.request.contextPath}/handle-student"
					method="post">
					<input type="text" value="${st.id}" name="id"/>
					
					<div class="form-group">
						<label for="name">student name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter Name here" value="${st.name}">

					</div>


					<div class="form-group">
						<label for="qualification">student qualification</label> <input
							type="text" class="form-control" id="qualification"
							name="qualification" placeholder="Enter qualification here"
							value="${st.qualification}">

					</div>




					<div class="form-group">
						<label for="result">student result</label> <input type="text"
							class="form-control" id="result" name="result"
							placeholder="Enter result here" value="${st.result}">

					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger">Back</a>

						<button type="submit" class="btn btn-warning">Update</button>
					</div>

				</form>
			</div>
		</div>

	</div>


</body>
</html>