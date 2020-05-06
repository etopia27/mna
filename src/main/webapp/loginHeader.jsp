<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />


<html>
<head>

<title>Create an account</title>



<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="container">
		<div>
			<img alt="logo" src="./resources/images/logo.jpg" width="111px;">
		</div>



		<h2>
			Welcome Admin | <a id="logout_link">Logout</a>
		</h2>
		<jsp:include page="menu.jsp"></jsp:include>
	</div>
	<div></div>
	<script src="${contextPath}/resources/js/lib/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/lib/jquery-ui.min.js"></script>
	<script src="${contextPath}/resources/js/lib/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${contextPath}/resources/js/common.js"></script>
</body>
</html>
