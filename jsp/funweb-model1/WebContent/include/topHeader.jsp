<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 세션값 가져오기
String id = (String) session.getAttribute("id");

// 세션값 있으면  ..님 반가워요  [로그아웃]   [회원가입]없어짐
// 세션값 없으면  [로그인]  [회원가입]
%>
<header>
	<div id="login">
		<%
		if (id != null) {
			%>
			<%=id %>님 반가워요~
			<a href="/member/logout.jsp">로그아웃</a>
			<%
		} else {
			%>
			<a href="/member/login.jsp">로그인</a>
			 | <a href="/member/join.jsp">회원가입</a>
			<%
		}
		%>
	</div>
	<div class="clear"></div>
	<div id="logo">
		<a href="/">
			<img src="/images/logo.gif" width="265" height="62" alt="Fun Web">
		</a>
	</div>
	<nav id="top_menu">
		<ul>
			<li><a href="/">HOME</a></li>
			<li><a href="/company/welcome.jsp">COMPANY</a></li>
			<li><a href="#">SOLUTIONS</a></li>
			<li><a href="/center/notice.jsp">게시판</a></li>
			<li><a href="#">CONTACT US</a></li>
		</ul>
	</nav>
</header>