<%@page import="com.exam.vo.MemberVo"%>
<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// post전송 파라미터값 한글처리
request.setCharacterEncoding("utf-8");

// id  passwd  파라미터값 가져오기
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");

// DAO 객체 준비
MemberDao memberDao = new MemberDao();

// id에 해당하는 VO객체 리턴
MemberVo memberVo = memberDao.getMemberById(id);

if (memberVo != null) { // 아이디 일치
	if (passwd.equals(memberVo.getPasswd())) { // 패스워드 일치
		// 로그인 처리
		session.setAttribute("id", id);
		// index.jsp를 요청하게 하기
		response.sendRedirect("/index.jsp");
	} else {
		%>
		<script>
			alert('패스워드가 일치하지 않습니다.');
			history.back(); // 뒤로가기
		</script>
		<%
	}
} else { // memberVo == null
	%>
	<script>
		alert('없는 아이디 입니다.');
		history.back(); // 뒤로가기
	</script>
	<%
}

%>





