<%@page contentType="text/html;charset=UTF-8"%>

<section id="sidebar">
			<p class="intro" align="justify">GBKing에 오신걸 환영합니다.
			</br>원하시는 음료와 개수를 입력하시고 주문버튼을 클릭하시면 주문이 완료됩니다. </br>다양한 디저트도 준비되어 있으니 많은 이용 부탁드립니다.
			주문 후 주문확인에서 확인을 꼭 해주세요.
			</p>
			
			<nav>
				<ul id="sidenav" class="NanumPen">
					<li><a href="/GBKing/menu/list_drink.do" 
							<%if(leftMenu.equals("list") && menuMode==1){
							%>class="active"	
							<%}
							%>>음료</a></li>
					<li><a href="/GBKing/menu/list_food.do" 
							<%if(leftMenu.equals("list") && menuMode==2){
							%>class="active"	
							<%}
							%>>디저트</a></li>
					<li><a href="/GBKing/menu/menu_Confirm.do"
							<%if(leftMenu.equals("Confirm")){
							%>class="active"
							<%}
							%>>주문확인</a></li>
					<%if(userid.equals("master"))
					{
					%>		
					<li><a href="/GBKing/menu/menu_List.do"
							<%if(leftMenu.equals("alllist")){
							%>class="active"
							<%}
							%>>주문관리자</a></li>
					<li><a href="/GBKing/menu/write.do"
							<%if(leftMenu.equals("write")){
							%>class="active"
							<%}
							%>>상품등록</a></li>
					<%
					}%>
				</ul>

				<a href="/GBKing/menu/list_food.do" class="b">
					<h4 class="NanumPen">추천메뉴</h4>
					<p class="imgcat">
						<img src="/GBKing/images/catering-mini.png" width="101"
							height="82" alt="" />
					</p>
					<p>
						샌드위치 <br />맛있음
					</p>
				</a>
			</nav>
		</section>