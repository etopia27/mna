<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>Log in with your account</title>
</head>
<link href="${contextPath}/resources/css/lib/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
<body>

	<div class="container">
		<div style="padding-left: 500px;">
			<img alt="logo" src="./resources/images/logo.jpg" width="111px;">
		</div>
		<form id="loginform" class="form-signin">
			<h2 class="form-heading">Log in</h2>

			<div class="form-group ${error != null ? 'has-error' : ''}">
				<span>${message}</span> <input name="username" type="text"
					class="form-control" placeholder="Username" autofocus="true"
					id="login-username" /> <input name="password" type="password"
					class="form-control" placeholder="Password" id="login-password" />
				<span id="error" style="color: red; font: bold;">${error}</span> <input
					type="hidden" id="csrf_param" name="${_csrf.parameterName}"
					value="${_csrf.token}" /> <input
					class="btn btn-lg btn-primary btn-block" type="submit"
					value="Log In">


			</div>

		</form>

	</div>
	<!-- /container -->

	<script src="${contextPath}/resources/js/lib/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/lib/jquery-ui.min.js"></script>
	<script src="${contextPath}/resources/js/lib/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${contextPath}/resources/js/login.js"></script>
</body>
</html>
