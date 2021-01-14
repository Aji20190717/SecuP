<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<c:choose>
			<c:when test="${dto.id eq null}">
				<form action="/bean/logininfo.do" method="post">
					<fieldset>
						<legend>Login</legend>
						<span>ID</span><input type="text" name="id" placeholder="id" />
						<span>PW</span><input type="text" name="pw" placeholder="pw" />
					</fieldset>
				</form>
			</c:when>
			<c:otherwise>
				${ dto.id }님 <a href="/bean/logoutSecurity.do">로그아웃</a>하세요 <br/><br/>
				<fieldset>
					<legend>${dto.id }님</legend>
					<span>이름	 : ${dto.name }</span>
					<span>주소	 : ${dto.addr }</span>
					<span>메일	 : ${dto.email }</span>
					<span>연락처	 : ${dto.name }</span>
				</fieldset>
			</c:otherwise>
		</c:choose>
	</div>
	
</body>
</html>