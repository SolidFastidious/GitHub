<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Building Code Violation Data Center</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery-3.2.1.min.js" />"></script>

</head>
<body style="height: 1500px">

	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Building Code Violation Data Center</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="index.jsp">Home</a></li>
			<li><a href="welcome.jsp">Page 1</a></li>
			<li><a href="UploadBuildingCode.jsp">Upload Building Code Data</a></li>
			<li><a href="#">Download List</a></li>
		</ul>
	</div>
	</nav>
	<br>
<!-- 	<div class="container" style="margin-top: 50px">
		<h2>
			Hey You..!! This is your 1st Spring MCV Tutorial..<br> <br>
		</h2>
		<h3>
			<a href="welcome.jsp">Click here to See Welcome Message... </a>(to
			check Spring MVC Controller... @RequestMapping("/welcome"))
		</h3>
	</div> -->

	<div class="container" style="margin-top: 50px">
		<h2>Building Code Violation List</h2>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Violation ID</th>
					<th>Inspection ID</th>
					<th>Violation Category</th>
					<th>Violation Date</th>
					<th>Violation Date Closed</th>
					<th>Violation Type</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>194851</td>
					<td>001019</td>
					<td>Animals and Pests</td>
					<td>2012-01-03 0:00</td>
					<td>2012-02-02 0:00</td>
					<td>Animals and Pests, not specified</td>
				</tr>
				<tr>
					<td>014851</td>
					<td>081018</td>
					<td>Garbage and Refuse</td>
					<td>2012-01-03 0:00</td>
					<td>2012-02-02 0:00</td>
					<td>Refuse Accumulation</td>
				</tr>
				<tr>
					<td>024851</td>
					<td>123450</td>
					<td>Unsanitary Conditions</td>
					<td>2012-01-03 0:00</td>
					<td>2012-02-02 0:00</td>
					<td>Unsanitary conditions, not specified</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>