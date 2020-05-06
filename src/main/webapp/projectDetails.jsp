<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<link rel="stylesheet"
	href="${contextPath}/resources/css/lib/ui.jqgrid.css">
<link rel="stylesheet"
	href="${contextPath}/resources/css/lib/bootstrap.min.css">
<link rel="stylesheet"
	href="${contextPath}/resources/css/lib/bootstrap-multiselect.css">
<link rel="stylesheet"
	href="${contextPath}/resources/css/lib/jquery-ui.min.css">
<link rel="stylesheet"
	href="${contextPath}/resources/css/lib/jquery.timepicker.css" />
<link rel="stylesheet" href="${contextPath}/resources/css/mna.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="loginHeader.jsp"></jsp:include>
	<%-- <jsp:include page="scheduledInspection.jsp"></jsp:include> --%>
	<div id="dialog-confirm" style="display: none"></div>
	<br />
	<br />
	<div class="container" style="z-index: -1">
		<button type="button"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-state-highlight projectButtons"
			style="height: 40px; width: 200px;" id="addNewProject">Add
			New</button>
		<button type="button"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-state-highlight projectButtons"
			style="height: 40px; width: 200px;" id="editProject">Edit</button>
		<button type="button"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-state-highlight projectButtons"
			style="height: 40px; width: 200px;" id="deleteProject">
			Delete</button>

		<table id="projectConfigurationList"></table>
		<div id="projectConfigurationListPager"></div>
	</div>
	<script src="${contextPath}/resources/js/lib/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/lib/jquery-ui.min.js"></script>
	<script src="${contextPath}/resources/js/lib/bootstrap.min.js"></script>
	<script src="${contextPath}/resources/js/lib/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/lib/bootstrap.min.js"></script>
	<script
		src="${contextPath}/resources/js/lib/bootstrap-multiselect.min.js"></script>
	<script src="${contextPath}/resources/js/lib/jquery-ui.min.js"></script>
	<script src="${contextPath}/resources/js/lib/grid.locale-en.js"></script>
	<script src="${contextPath}/resources/js/lib/jquery.blockUI.js"></script>
	<script src="${contextPath}/resources/js/lib/notify.js"></script>
	<script src="${contextPath}/resources/js/lib/jquery.timepicker.min.js"></script>


	<script src="${contextPath}/resources/js/lib/jquery.jqGrid.js"></script>
	<script src="${contextPath}/resources/js/lib/jszip.min.js"></script>
	<script type="text/javascript"
		src="${contextPath}/resources/js/projectmanagement.js"></script>
</body>
</html>