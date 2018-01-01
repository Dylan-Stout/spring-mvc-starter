
<%-- 
    Document   : Login - Wrx
    Created on : 3/31/17
    Author     : Dylan Stout
    
    Default login authentication page for wrx web client
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Warehouse Rx - Client</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Login to WRXJ">

<!-- Static Include -->
<%@include file="_template/header.jspf"%>

</head>

<body class="login-body">
	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="login-card">
					<img class="login-logo"
						src="<spring:url 
						value="/resources/img/wrx_lg_logo.png"/>"
						alt="App Logo Login Page"> 
					<img class="profile-img"
						 src="<spring:url value="/resources/img/nouser.png"/>" 
						 alt="App User Image"	>
						 	 
					<form:form id="loginForm" method="post" cssClass="form-signin"
						action="${pageContext.request.contextPath}/login" modelAttribute="login">
						
						<form:input id="userName" path="username" 
							cssClass="form-control" placeholder="User"
							required="required" autofocus="autofocus"/>
							
						 <form:input type="password" id="password"
							path="password" value='' cssClass="form-control"
							placeholder="Password" required="required"/>
						<button class="btn btn-lg btn-primary btn-block" type="submit">
							Login</button>
						<c:if test="${loginError}">
							<div class="alert alert-danger" role="alert">
 								<c:out value="${loginErrorMessage}" />
							</div>
						</c:if>


					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>