<%@page contentType="text/html;charset=UTF-8"%>


<section id="sidebar" class="parented">
			<p class="intro" align="justify">GBKing에 오신걸 환영합니다.
			</br>일반 회원님들은 자유게시판 , 리뷰게시판에서 글 작성이 가능합니다. 다양한 이벤트와 공지는 공지사항 게시판을 참고해주세요.
			</p>
			<nav>
				<ul id="sidenav" class="NanumPen">
					<li><a href="#none" onclick="return goBoard('0')"
							<%if(type.equals("0")){
							%>class="active"	
							<%}
							%>>공지사항</a></li>
					
					<li><a href="#none" onclick="return goBoard('1')"
							<%if(type.equals("1")){
							%>class="active"	
							<%}
							%>>자유게시판</a></li>
					
					<li><a href="#none" onclick="return goBoard('2')"
							<%if(type.equals("2")){
							%>class="active"	
							<%}
							%>>Review</a></li>
				</ul>
			</nav>
</section>