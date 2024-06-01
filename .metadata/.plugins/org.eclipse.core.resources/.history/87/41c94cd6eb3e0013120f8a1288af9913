<%@page contentType="text/html;charset=UTF-8"%>
<%@page session="false"%>
<%@taglib prefix="c" 
    uri="http://java.sun.com/jstl/core_rt"%>
<%@page import ="com.utility.*" %>

<html>
	<head>
		<title>Zip Code </title>
</head>
<script>
	function goFind()
	{
		var frm = document.form;
		if(frm.dong.value.length<1)
			{
				alert("input dong, please");
				frm.dong.focus();
				return false;
			}
		
		frm.action = "/<%=CommonUtil.commonURL%>/member/zipcode.do";
		frm.submit();
	}
	
	function goSelect(zipcode, address){
		opener.document.getElementById("zipcode").value=zipcode;
		opener.document.getElementById("address1").value=address;
		self.close();
	}
</script>
	

<form name ="form" method ="post">
	Here Input Dong, please
	<input type="text" name ="dong" value="${dong}">
	&nbsp;&nbsp;&nbsp;&nbsp;
	<input type ="button" value ="검색"  onclick="return goFind()">
	<body>
	<table border="1" width="100%">
		<c:forEach items="${list}" var="item">
		<tr>
				<td><a href="#none#" onclick="goSelect('${item.ZIPCODE}','${item.ADDRESS}')">
				${item.ZIPCODE}</a></td>
				<td><a href="#none#" onclick="goSelect('${item.ZIPCODE}','${item.ADDRESS}')">
				${item.ADDRESS}</a></td>
			</tr>
		</c:forEach>
	</table>
</form>
	</body>
</html>


