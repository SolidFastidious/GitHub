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
			<li><a href="downloadList.jsp">Download List</a></li>
		</ul>
	</div>
	</nav>
	<br>
	
	
	<div class="container-fluid" style="margin-top: 50px">
		<div class="jumbotron">
			<h2>Download Building List</h2>
			<p>Download a specific list in excel or in pdf format.</p>

			<button type="button" class="btn btn-primary">
				Download Excel file <i class="glyphicon glyphicon-download-alt"></i>
			</button>
		</div>

	</div>
</body>
</html>