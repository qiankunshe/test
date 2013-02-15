<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery/jquery-1.5.2.min.js"></script>
<script type="text/javascript">
	function loginNow(){
		$.post("loginAjax.do",
			{
			  "userName":$("#username").val(),
			  "userPassWrod":$("#password").val()
			},
			function(data){
				if(data.stauts === 0){
					window.location.href = "<%=request.getContextPath() %>"+data.url;
				}
				else{
					alert(data.errorMag);
				}
			});
	}
</script>
</head>
<body>
	<form action="" >
		<table>
			<tr>
				<td>
				 用户名
				</td>
				<td>
				<input name="username" id="username">
				</td>
			</tr>
			<tr>
				<td>
				密码
				</td>
				<td>
				<input name="password" id="password">
				</td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="button" value="登录" onclick="loginNow()">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>