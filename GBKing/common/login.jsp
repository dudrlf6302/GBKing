<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="com.utility.*"%>


<% 
	if (session.getAttribute("userid") == null || session.getAttribute("userid").equals("") ||
		session.getAttribute("check") == null || session.getAttribute("check").equals("") || request.getAttribute("logout")=="out"){
		session.removeAttribute("userid");
		session.removeAttribute("check");
		session.setAttribute("userid", request.getAttribute("session_id"));
	    session.setAttribute("check", request.getAttribute("session_check"));
	
	} else {
		session.setAttribute("userid", session.getAttribute("userid"));
	    session.setAttribute("check", session.getAttribute("check"));
	} 

%>
<script>
	function goLogin() {	
		
		if (document.getElementById("userid").value == "") {
			alert("ID를 입력해주세요");
			document.getElementById("userid").focus();
			return false;

		}
		if (document.getElementById("pw").value == "") {
			alert("Password를 입력해주세요");
			document.getElementById("pw").focus();
			return false;

		}
		
		var frm = document.log_form;
		frm.action = "/<%=CommonUtil.commonURL%>/board/login.do";
		frm.submit();
	
	}
	function goLogout() {

		var frm = document.log_form2;
		frm.action = "/<%=CommonUtil.commonURL%>/board/logout.do";
		frm.submit();
	}
	function goRegister(){

	//	var frm = document.form;
	//	window.open("","listinfo","width=700, height=250,top=250,left=250");
	//	frm.target = "listinfo";//타켓을 변경
	//	frm.action="/<%=CommonUtil.commonURL%>/member/write.do";
	//	frm.submit();
		
		var frm = document.form;
		window.open("","register","width=1000, height=500,left=250,top=250, scrollbars=yes");
		frm.target = "register";//타켓을 변경
		frm.action="/<%=CommonUtil.commonURL%>/member/write.do";
		frm.submit();
		
	}
</script>


<body>

	<%
		String check = "";
		if (session.getAttribute("check") == null || session.getAttribute("check").equals("")) {
			check = "0";
		} else {
			check = session.getAttribute("check").toString();
		}
		
		
	%>
	
  <!-- Login Set  -->


	<%
	System.out.println("check " + session.getAttribute("check"));
	System.out.println("ID : " + session.getAttribute("userid"));
	System.out.println("request ID : " + request.getAttribute("userid"));
	System.out.println("request PW : " + request.getAttribute("password"));
		if (check.equals("0")) { 
	%>
	
	<form name="log_form" method="post">
		<table style="border:2px dashed red" align="center" class="bdl">
		<td></br></td>
			<tr>
				<td><b><font size="3">&nbsp;&nbsp;ID : </font></b><input type="text" style="width: 70px" style="height:20px" name="userid" id="userid" value=""></input></td>
				<td><b><font size="3">&nbsp;&nbsp;Pass : </font></b><input type="password" style="width: 70px" style="height:15px" name="pw" id="pw" value=""></input></td>
			</tr>
			<td></br></td>
			<tr align="center">
				<td><input type="image" src = "/GBKing/images/btn_login.gif"  onclick="goLogin()"></input></td>
				<td><input type="image" src="/GBKing/images/btn_join.gif" onclick="goRegister()"></input></td>
			</tr>
		<td></br></td>
		</table>
	</form>
	<%
		} else if (check.equals("1")) {  
	%>
	
	<form name="log_form2" method="post">
		<table style="border:2px dashed red" align="center">
		<td></br></td>
			<tr>
				<td><b><font size="3">&nbsp;&nbsp;msg : </font></b><input type="text" style="width: 150px" style="height:20px" name="userid" id="userid" 
				value="<%=(String)session.getAttribute("userid") %>님 환영합니다." readonly></input></td>
			</tr>
			
			<tr align="center">
				<td><input type="image" src = "/GBKing/images/btn_logout.gif"  onclick="goLogout()"></input></td>
			</tr>
		<td></br></td>
		</table>
	</form>
	
	<%
		}
	%>
	
	<%
		String loginConfirm=(String)request.getAttribute("loginConfirm");
		
		if(loginConfirm==null)
		{
			loginConfirm="";
		}
		
		if(loginConfirm=="fail")
		{

		%>
			   <script>
                  alert('아이디 또는 비밀번호를 다시 확인하세요. 등록되지 않은 아이디이거나, 아이디 또는 비밀번호를 잘못 입력하셨습니다.');
               </script>			
			
		<%
		}
		%>
</body>
</html>
