<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
fieldset {
	width: 500px;
	height: 150px;
}
</style>
</head>
<body>

	<div>
		<c:choose>
			<c:when test="${dto.id eq null}">
				<form action="/practice/logininfo.do" method="post">
					<fieldset>
						<legend>Login</legend>
						<span style="margin-right: 50px">ID</span><input type="text" name="id" placeholder="id" /><br/><br/>
						<span style="margin-right: 43px">PW</span><input type="password" name="pw" placeholder="pw" /><br/><br/><br/>
						<input type="submit" value="login" />
					</fieldset>
				</form>
			</c:when>
			<c:otherwise>
				${ dto.id }님 <a href="/practice/logoutSecurity.do">로그아웃</a>하세요 <br/><br/>
				<fieldset>
					<legend>${dto.id }님</legend>
					<span>이름	 : ${dto.name }</span><br/>
					<span>주소	 : ${dto.addr }</span><br/>
					<span>메일	 : ${dto.email }</span><br/>
					<span>연락처	 : ${dto.name }</span>
				</fieldset>
			</c:otherwise>
		</c:choose>
	</div>
	
</body>
</html>