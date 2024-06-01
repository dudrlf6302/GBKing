<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>한밭대학교</title>
</head>
<script>
	function goSend() {
		opener.document.getElementById("idcheck").value = "Y";
		opener.document.getElementById("user_id").readOnly = true;
		self.close();
	}
	function goExit() {
		opener.document.getElementById("idcheck").value = "N";
		opener.document.getElementById("user_id").readOnly = false;

		self.close();
	}
</script>

<%
	String userid = request.getAttribute("user_id").toString();
	int result = Integer.parseInt(request.getAttribute("idcheck").toString());
	if (result == 1){
		out.println(userid + "를 사용 하실수 없습니다. " + "중복됨");
%>
 <input type="button" value="닫기" onclick="goExit()">
<%
	}else if (result == 0) {
		out.println(userid + "를 사용 하실 수 있습니다. ");
		out.println("사용가능");
%>
	<input type="button" value="사용하기" onclick="goSend()">
	<% 
	}
	else
		out.println("중복체크 실패");
	
	%>
	
	
	
	
	
	
	
	
	
