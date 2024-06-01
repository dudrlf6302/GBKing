<%@page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@page import="java.util.*" %>
<%@page import="java.sql.*"%>
<script>
function goOk(on_off)
{
	var frm = document.form;	
	frm.action="logon.jsp?on_off="+on_off;
	frm.submit();
}
</script>
<% 

	String bunho = request.getParameter("bunho");
%>
<%=bunho %>

<form name="form" method="post">
<input type="hidden" name="bunho"   value="<%=bunho%>">
<table>
	<tr>
		<td>
			<a href="#none" onclick="goOk(1)">확인</a>&nbsp;&nbsp;&nbsp;
			<a href="#none" onclick="goOk(0)">취소</a>&nbsp;&nbsp;&nbsp;
			
	</tr>
</table>
</form>

