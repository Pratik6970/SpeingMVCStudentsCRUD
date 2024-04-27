<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-6 offset-3">

				<h1 class="text-center">Index Page</h1>
				<table class="table table-hover table-dark">


					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Name</th>
							<th scope="col">Qualification</th>
							<th scope="col">Result</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
                     
                     
						<c:forEach items="${students}" var="s">
							<tr>
								<th scope="row">${s.id}</th>
								<td>${s.name}</td>
								<td>${s.qualification}</td>
								<td>${s.result}</td>
								<td>
								
								<a href="delete/${s.id}"><i class="fas fa-trash text-danger"></i></a>
								
								<a href="update/${s.id}"><i class="fas fa-pen-square"></i></a>
								
								</td>
							</tr>
						</c:forEach>

                     
					
					</tbody>
				</table>

				<div class="containetr text-center">
					<a href="addss" class="btn btn-outline-succes">ADD Student</a>

				</div>



			</div>

		</div>

	</div>
</body>
</html>