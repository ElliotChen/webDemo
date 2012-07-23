<%@ include file="/WEB-INF/jsp/common/base.jsp"%>
<script language="JavaScript">
<!--
$().ready(function(){
	var options = {
		target : "#listDiv",
		success : $.unblockUI
	};
	
	$("#searchForm").submit(function() {
		$(this).ajaxSubmit(options);
		$.blockUI();
		return false;
	});
	
});
	function search(){
		$("#searchForm").submit();
	}
	
//-->
</script>

<div id="functionButtonDiv">
<tiles:insertAttribute name="functionButton"/>
</div>

<div id="searchFormDiv">
<tiles:insertAttribute name="searchForm"/>
</div>

<div id="updateFormDiv">
<tiles:insertAttribute name="updateForm"/>
</div>

<div id="listDiv">
<tiles:insertAttribute name="list"/>
</div>