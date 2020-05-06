$("#loginform").submit(function(event){
    event.preventDefault();
    login();
    return false;
});


function login(){
	var dataLogin = {
			"username" : $("#login-username").val(),
			"password" : $("#login-password").val(),
		};
	$.ajax({
		url : "/user/authenticate",
		type : 'POST',
		data : JSON.stringify(dataLogin),
		dataType : 'json',
		contentType : 'application/json',
		success : function(data) {
			
			$("body").load("fileupload.jsp");
			 return false;
		},
		error : function(data) {
			$("#error").html("Invalid username or password")
			return false;
		}
	});
	return false;
}