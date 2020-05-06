<html>
<head>

<link href="${contextPath}/resources/css/lib/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="loginHeader.jsp"></jsp:include>
	<br></br>

	<div class="container">



		<form method="POST" enctype="multipart/form-data" id="fileUploadForm"
			class="form-signin">
			<h2 class="form-heading">Upload File</h2>
			<br /> <br /> <input type="file" name="files" /><br /> <br /> <input
				type="file" name="files" /><br /> <br /> <input type="submit"
				value="Submit" id="btnSubmit"
				class="btn btn-lg btn-primary btn-block" /> <br> <b><span
				id="result" style="color: green;"></span></b>


		</form>

		<script type="text/javascript"
			src="${contextPath}/resources/js/lib/jquery.min.js"></script>

		<script type="text/javascript"
			src="${contextPath}/resources/js/fileupload.js"></script>
	</div>
</body>
</html>