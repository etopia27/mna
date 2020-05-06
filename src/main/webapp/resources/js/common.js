$("#fileupload").click(function(event){
    event.preventDefault();
	$("body").load("fileupload.jsp");
    return false;
});

$("#projects").click(function(event){
    event.preventDefault();
	$("body").load("projectDetails.jsp");
    return false;
});

$("#logout_link").click(function(event){
    event.preventDefault();
	$("body").load("login.jsp");
    return false;
});


