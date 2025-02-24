<!DOCTYPE html>

<!--[if IE 7 ]><html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]><html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]><html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]> <!-->
<html lang="en" class="no-js" xmlns="http://www.w3.org/1999/xhtml">
<!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://ckeditor.com" prefix="ckeditor"%>
<%@page import="com.hanbat.board.dto.*"%>
<%@page import="java.util.*"%>
<%@page import="com.utility.*"%>
<%@page session="true"%>

<head>
<meta content="text/html; charset=utf-8" http-equiv="content-type" />
<title>GBKing 회원가입</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<link rel="stylesheet" href="/GBKing/css/list_style.css" />
<link type="text/css" rel="stylesheet" href="../../ckeditor/_samples/sample.css" />
<script type="text/javascript" src="/GBKing/ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="/GBKing/ckfinder/ckfinder.js"></script>
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>

<script>

function goIDCheck()
{
	var frm = document.form;
	if(frm.user_id.value=="")
	{
		alert("아이디를 입력 해주세요.");
		frm.user_id.focus();
		return false;
	}
	document.getElementById("idcheck").value="N";
	//window.open("idcheck.jsp", "제목", "height=300, width=400, top=200, left=200, scrollbars=no");
	
	//post 방식으로 넘기기
	var post = window.open("", "popwindow", "height=300, width=400, top=200, left=200, scrollbars=no");
	
	frm.action="/<%=CommonUtil.commonURL%>/member/idcheck.do";
	frm.method="post";
	frm.target = "popwindow";
	frm.submit();
	
}


	function goWrite()
	{
		
		var frm = document.form;
		if(frm.user_id.value=="")
		{
			alert("아이디를 입력 해주세요.");
			frm.user_id.focus();
			return false;
		}
		
		if(frm.idcheck.value=="N")
		{
			alert("사용가능한 아이디로 중복체크를 해주세요.");
			frm.user_id.focus();
			return false;
		}
		if(frm.password.value=="")
		{
			alert("패스워드를 입력 해주세요.");
			frm.password.focus();
			return false;
		}
		if(frm.password.value!=frm.password2.value)
		{
			alert("패스워드를 확인해 주세요.");
			frm.password.focus();
			return false;
		}
		if(frm.address1.value=="")
		{
			alert("우편번호를 검색 해주세요.");
			frm.address1.focus();
			return false;
		}
		if(frm.address2.value=="")
		{
			alert("상세주소를 입력 해주세요.");
			frm.address2.focus();
			return false;
		}
		if(frm.user_name.value=="")
		{
			alert("이름 입력 해주세요.");
			frm.user_name.focus();
			return false;
		}
		
		
		frm.action="/<%=CommonUtil.commonURL%>/member/save.do";
		frm.target="_self";//내창으로
		frm.submit();
		alert("회원가입이 완료 되었습니다.");
		
		self.close();
		
	}
	
	
	function goZipcode()
	{
		var frm = document.form;
		window.open("","zipcode","width=400, height=400,left=300,top=300");
		frm.target = "zipcode";//타켓을 변경
		frm.action="/<%=CommonUtil.commonURL%>/member/zipcode.do";
		frm.submit();
	}

</script>


</br></br><h2><font size="5"><b>회원가입</b></font></h2>
<body>
	<form name="form" method="post">
		<input type="hidden" name="idcheck" id="idcheck" value="N">
		<table width="80%" border="1" class="bdw">
			<tr>
				<th scope="row" class="first">아이디</th>
				<td width="20%"><input type="text" size="10" name="user_id" id="user_id"></td>
				<td><input type="button" value="중복체크" onclick="goIDCheck()"></td>
			</tr>
			<tr>
				<th scope="row" class="first">패스워드</th>
				<td colspan="2"><input type="password" name="password"></td>
			</tr>
			<tr>
				<th scope="row" class="first">패스워드 확인</th>
				<td colspan="2"><input type="password" name="password2"></td>
			</tr>
			<tr>
				<th scope="row" class="first">주소</th>
				<td colspan="2">우편번호 : <input type="text" name="zipcode" id="zipcode"
					readonly> &nbsp;&nbsp; <input type="button" value="우편번호검색"
					onclick="goZipcode()"> <br /> 기본주소 : <input type="text"
					name="address1" id="address1" readonly> <br /> 상세주소 : <input
					type="text" name="address2">
				</td>
			</tr>
			<tr>
				<th scope="row" class="first">이름</th>
				<td colspan="2"><input type="text" name="user_name"></td>
			</tr>
			<tr>
				<th scope="row" class="first">완료</th>
				<td colspan="2"><input type="button" value="회원가입" onclick="return goWrite()"></td>
			</tr>
		</table>
	</form>
</body>

</html>

