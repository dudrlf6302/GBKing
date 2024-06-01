<%@page contentType="text/html;charset=UTF-8"%>

<div class="wrapper">
	<h1>
		<a href="/GBKing/board/main.do" title="Go back to the homepage"
			class="img">Keith Homemade Cakes</a>
	</h1>

	<nav>
		<ul>
			<li id="m-home"><a href="/GBKing/board/main.do" 
							<%if(headerMenu.equals("Home")){
							%>class="img active"	
							<%}
							else{
							%>class="img"<%
							}%>>Home</a></li>
							
			<li id="m-about"><a href="/GBKing/board/list.do"
							<%if(headerMenu.equals("Board")){
							%>class="img active"	
							<%}
							else{
							%>class="img"<%
							}%>>Board</a></li>
							
			<li id="m-range"><a href="/GBKing/pcroom/pcroom.jsp";
							<%if(headerMenu.equals("Reservation")){
							%>class="img active"	
							<%}
							else{
							%>class="img"<%
							}%>>Seat</a></li>
							
			<li id="m-catering"><a href="/GBKing/menu/list_drink.do" 
							<%if(headerMenu.equals("Order")){
							%>class="img active"	
							<%}
							else{
							%>class="img"<%
							}%>>Order</a></li>

			<li id="m-contact"><a href="/GBKing/qna/qna.do"
							<%if(headerMenu.equals("Q&A")){
							%>class="img active"	
							<%}
							else{
							%>class="img"<%
							}%>>Q&A</a></li>
		</ul>
	</nav>

</div>
</html>

