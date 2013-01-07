$(document).ready(function(){
	$(".ajaxreq").click(function() {
		var link = $(this);
		$.ajax({
			url : link.attr("href"),
			success : function(res) {alert(res);},
			errors : function(res) {alert(res);}
		});
		return false;
	});
	
	$(".ajaxform").submit(function(event) {
		var form = $(this);
		var button = form.children(":first");
		$.ajax({ type: "POST", url: form.attr("action"), data: "foo", contentType: "text/plain", dataType: "text", success: function(text) { alert(text);}, error: function(xhr) {alert(xhr); }});
		return false;
	});
	
	$("#jsonRequest").click(function() {
		var link = $(this);
		$.ajax({
			url : link.attr("href"),
			contentType: "application/json",
			success : function(res) {alert(res);},
			error : function(res) {alert(res);}
		});
		return false;
	});
	
	$("#jsonResponse").click(function() {
		var link = $(this);
		$.ajax({
			url : link.attr("href"),
			beforeSend : function(req) {req.setRequestHeader("Accept", "application/json");},
			success : function(json) {alert(JSON.stringify(json)); alert(json.id);}
		});
		return false;
	});
});
function testAjax() {
}