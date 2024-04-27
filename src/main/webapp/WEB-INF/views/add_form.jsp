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

	<h1 class="text-center">Welcome To add page here</h1>

	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-3">

				<h1 class="text-center mb-3">Fill The Form</h1>

				<form action="handle-student" method="post">

					<div class="form-group">
						<label for="name">Enter Student Name</label> <input type="text"
							class="form-control" name="name" id="name"
							placeholder="Enter Student name">
					</div>


					
        <div class="form-group">
        <label for="Enter Qualification ">Enter Qualification</label>
        <input type="text" class="form-control" name="qualification" id=" qualification" placeholder="Enter Qualification here">
        
        </div>
        
        <div class="form-group">
        <label for="Result">Enter Result</label>
        <input type="text" class="form-control" name="result" id="result" placeholder="Enter Result Here"> 
        
        </div>
        
        <div class="container text-center">
       <a href="${pageContext.request.contextPath}/"class="btn btn-outline-danger">Back</a>
        
        <button type="submit" class="btn btn-primary">ADD</button>
        </div>


				






				</form>
			</div>


		</div>


	</div>







</body>
</html>