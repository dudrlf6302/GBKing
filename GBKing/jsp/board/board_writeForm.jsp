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
<title>GBKing</title>
<link rel="stylesheet" href="/GBKing/css/style.css" />
<link rel="stylesheet" href="/GBKing/css/list_style.css" />
<link type="text/css" rel="stylesheet" href="../../ckeditor/_samples/sample.css" />
<script type="text/javascript" src="/GBKing/ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="/GBKing/ckfinder/ckfinder.js"></script>
<script src="/GBKing/js/modernizr-1.6.min.js"></script>
</head>

<script>
function goWrite()
{
	var frm = document.form;
	if(frm.title.value=="")
	{
		alert("제목을 입력하세요");
		frm.title.focus();
		return false;
	}
	
	if(frm.writer.value=="")
	{
		alert("이름을 입력하세요");
		frm.writer.focus();
		return false;
	}
	
	if(frm.contents.value==null)
	{
		alert("내용을 입력하세요");
		frm.contents.focus();
		return false;
	}
	frm.action="/<%=CommonUtil.commonURL%>/board/save.do";	
	frm.target="_self"; //내창으로 	
	frm.submit();
}

function goBoard(type)
{
	var frm = document.form;
	frm.action="/<%=CommonUtil.commonURL%>/board/list.do";
	frm.type.value = type;
	frm.target = "_self"; //내창으로 
	frm.submit();
}

</script>
<%
	BoardDto dto = (BoardDto) request.getAttribute("dto");
	String mode = (String) request.getAttribute("mode");
	String seq = (String) request.getAttribute("seq");
	String type = (String) request.getAttribute("type");
	String board_list = (String) request.getAttribute("board_list");
	String writer = (String) session.getAttribute("userid");
%>
<%=writer%>


<body class="board_wirte">
	<header>
		<%
			String headerMenu ="Board";
		%>

		<%@include file="../../common/header.jsp"%>
	</header>

	<div class="wrapper content">
		<div id=left>
			<%@include file="../../common/board_left.jsp"%>
		</div>

	

		<section id="main">
			</br>
			<h3>
				<font size="5">게시글 작성</font>
			</h3>
			</br>
			<form name="form" method="post">
				<input type="hidden" name=searchWord> <input type="hidden"
					name="searchKey"> <input type="hidden" name="seq"
					value="<%=seq%>"> <input type="hidden" name="mode"
					value="<%=mode%>"> <input type="hidden" name="type"
					value="<%=type%>"> <input type="hidden" name="board_list"
					value="<%=board_list%>"> <input type="hidden"
					name="group_id" value="<c:out value="${dto.group_id}"/>"> <input
					type="hidden" name="group_depth"
					value="<c:out value="${dto.group_depth}"/>"> <input
					type="hidden" name="group_seq"
					value="<c:out value="${dto.group_seq}"/>">

				<!-- quickArea S -->
				<div id="quickArea">
					<!-- contentArea S -->
					<div id="content">
						<!-- bbs default write S -->
						<table cellspacing="0" class="bdw">
							<colgroup>
								<col width="10" />
								<col width="10" />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row" class="first"><label for="formname01">제목</label></th>
									<td class="last"><input name="title" size="60"
										maxlength="100" value="<c:out value="${dto.title}"/>"></td>
								</tr>

								<tr>
									<th scope="row" class="first"><label for="formname02">작성자</label></th>
									<td class="last"><input name="writer" readonly size="10"
										maxlength="40" value="<%=writer%>" /></td>
								</tr>

								<tr>
									<th scope="row" class="first"><label for="memo">내용</label></th>
									<td class="last"><textarea rows="10" cols="40"
											id="contents" name="contents"></textarea></td>
								</tr>

								<tr>
									<th scope="row" class="first"><label for="atchfile">첨부파일</label></th>
									<td class="last"><input type="file" id="atchfile"
										name="atchfile" size="50" class="atchfile" /></td>
								</tr>
							</tbody>
						</table>

						<script type="text/javascript">
							// This is a check for the CKEditor class. If not defined, the paths must be checked.
							if (typeof CKEDITOR == 'undefined') {
								document
										.write('<strong><span style="color: #ff0000">Error</span>: CKEditor not found</strong>.'
												+ 'This sample assumes that CKEditor (not included with CKFinder) is installed in'
												+ 'the "/ckeditor/" path. If you have it installed in a different place, just edit'
												+ 'this file, changing the wrong paths in the &lt;head&gt; (line 5) and the "BasePath"'
												+ 'value (line 32).');
							} else {
								var editor = CKEDITOR.replace('contents');
								editor.setData('');

								// Just call CKFinder.setupCKEditor and pass the CKEditor instance as the first argument.
								// The second parameter (optional), is the path for the CKFinder installation (default = "/ckfinder/").
								CKFinder.setupCKEditor(editor, '../ckfinder/');
								//ckfinder 경로 잡기

								// It is also possible to pass an object with selected CKFinder properties as a second argument.
								// CKFinder.setupCKEditor( editor, { basePath : '../', skin : 'v1' } ) ;
							}
						</script>
						<!-- bbs default write E -->

						<!-- bbs footer S -->
						<div class="bft">
							<div class="bb">
								<ul>
									<li class="inputBtn"><a href="#none" onclick="goWrite()">등록</a></li>
									<li><a href="#" onclick="goBoard('<%=type%>')">취소</a></li>
								</ul>
							</div>
						</div>
						<!-- bbs footer E -->
					</div>
					<!-- content E -->
				</div>
				<!-- quickArea E -->
			</form>
		</section>
</body>

<section id="copyright">
		<div class="wrapper">
			<p>&#169; Copyright 2013 Keith Homemade Cakes</p>
			<p id="koodoz"><a title="Web design Melbourne"><strong>Web Design <span>Melbourne</span></strong></a></p>
		</div>
		</section>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.js"></script>
<script src="http://maps.google.com/maps/api/js?sensor=false"></script>

<script>
	//<![CDATA[
	!window.jQuery
			&& document
					.write(unescape('%3Cscript src="js/libs/jquery-1.4.2.min.js"%3E%3C/script%3E'));
	//]]>
</script>

<script>
	SROOTPATH = '/'
</script>
<script src="/GBKing/js/plugins.js"></script>
<script src="/GBKing/js/init.js"></script>

<script>
	//<![CDATA[
	var _gaq = [ [ '_setAccount', 'UA-3019794-38' ], [ '_trackPageview' ] ];
	(function(d, t) {
		var g = d.createElement(t), s = d.getElementsByTagName(t)[0];
		g.async = true;
		g.src = ('https:' == location.protocol ? 'https://ssl' : 'http://www')
				+ '.google-analytics.com/ga.js';
		s.parentNode.insertBefore(g, s);
	})(document, 'script');
	//]]>
</script>

</html>