<%@page contentType="text/html;charset=UTF-8"%>

<section id="sidebar" class="parented">
			<p class="intro" align="justify">GBKing에 오신걸 환영합니다.
			</br>원하시는 날짜, 시간, 방번호를 선택하시면 예약이 완료 됩니다. 예약 후 예약확인에서 예약목록을 확인할 수 있습니다.
			</p>
			<nav>
				<ul id="sidenav" class="NanumPen">
					<li><a href="/GBKing/reserve/reserve.do" 
							<%if(leftMenu.equals("예약하기")){
							%>class="active"	
							<%}
							%>>예약하기</a></li>
					<li><a href="/GBKing/reserve/reserveConfirm.do"
							<%if(leftMenu.equals("예약확인")){
							%>class="active"	
							<%}
							%>>예약확인</a></li>
					<%if(userid.equals("master"))
					{
					%>		
					<li><a href="/GBKing/reserve/reserveList.do"
							<%if(leftMenu.equals("예약관리자")){
							%>class="active"	
							<%}
							%>>예약관리자</a></li>
					<%
					}
					%>
				</ul>
			</nav>
		</section>