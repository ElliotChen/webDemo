<%@ include file="/WEB-INF/jsp/common/base.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true"/></title>
<script language="JavaScript" type="text/javascript" src="<c:url value="/js/jquery-1.7.1.js" />"></script>
<script language="JavaScript" type="text/javascript" src="<c:url value="/js/jquery.form.js" />"></script>
<script language="JavaScript" type="text/javascript" src="<c:url value="/js/jquery.validate.min.js" />"></script>
<script language="JavaScript" type="text/javascript" src="<c:url value="/js/jquery.blockUI.js" />"></script>
</head>
<body>
<table>
	<tr>
		<td colspan="2"><tiles:insertAttribute name="header"/> </td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="menu"/></td><td><tiles:insertAttribute name="body"/></td>
	</tr>
	<tr>
		<td colspan="2"><tiles:insertAttribute name="footer"/></td>
	</tr>
</table>
</body>
</html>