<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<form action="/bean/logininfo.do" method="post">
			<fieldset>
				<legend>Login</legend>
				<span>ID</span><input type="text" name="id" placeholder="id" />
				<span>PW</span><input type="text" name="pw" placeholder="pw" />
			</fieldset>
		</form>
	</div>

</body>
</html>