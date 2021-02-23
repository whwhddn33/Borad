<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id = "udao" class = "dao.UserDAO"/>
    <jsp:useBean id = "udto" class = "dto.UserDTO"/>
    <jsp:setProperty property="*" name="udto"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입완료</title>
</head>
<body>
<%
	if(udao.join(udto)){
		
	}
%>

</body>
<script>
		alert("회원가입 완료!");
</script>


</html>