<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*"%>
<script>

function goWrite(bunho)
{
	var frm = document.form;	
	frm.action="list.jsp?bunho="+bunho;
	frm.submit();
}
</script>
<%
	String on_off;
	on_off = request.getParameter("on_off");
	String bunho = request.getParameter("bunho");
	if(on_off==null ||on_off.equals(""))
	{
		on_off="0";
	}
	if(bunho==null ||bunho.equals(""))
	{
		bunho="1";
	}
%>

<%
	request.setCharacterEncoding("UTF-8");
	String msg="";

	//db불러오기 
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");

	} catch (Exception e) {
		System.out.println("드라이버파일 없음");
	}

	//2.db와 연결하기 
	String url="jdbc:oracle:thin:@192.168.0.9:1521:XE";
	String id="hr";
	String pwd="hr1234";

	try {
		Connection conn = DriverManager.getConnection(url, id, pwd);
		//out.println("연결성공");
		Statement statement = conn.createStatement();	
		String sql;
		sql = "update pcroom set " + "on_off ='" + on_off + "' where bunho='" + bunho + "' ";
		msg = "수정되었습니다";
		System.out.println(sql);
		statement.execute(sql); //db에 등록
			
		sql = "select bunho,on_off from pcroom ORDER by bunho";
		ResultSet rs = statement.executeQuery(sql);
%>

<form name="form" method="post">
<table>
	<tr>
		<td>
			<%
			for(int i=1;i<=20;i++)
			{
			rs.next();
			int check_bunho = rs.getInt(1);
			int check_on_off = rs.getInt(2);					
			
			if(check_bunho==i && check_on_off==0) {	%>
			
			<a href="#none" onclick="goWrite(<%=i%>)"><%=i%></a>&nbsp;&nbsp;&nbsp;
			<%}	else if(check_bunho==i && check_on_off==1){ %>
			
			<a href="#none" onclick="goWrite(<%=i%>)"><font color="#cf0ff1"face="궁서체"><%=i%></a>&nbsp;&nbsp;&nbsp;
				<%}	//else if 종료	
				if(i%5==0)
				{
					%>
					</br></br>
				<% 	
				}
			}//for문 종료 %>
		</td>
	</tr>
</table>
</form>
<%

		sql = "update pcroom set " + "on_off ='" + on_off + "' where bunho='" + bunho + "' ";
		
		System.out.println(sql);
		statement.execute(sql); //db에 등록
	
		rs.close();
		statement.close();
		conn.close();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
%>

