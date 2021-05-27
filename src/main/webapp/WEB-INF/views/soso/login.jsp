<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="google-signin-client_id" content="166917974905-hpbuk02e74hrvbpbjo5afk059s4ip4of.apps.googleusercontent.com">
    <title>로그인</title>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="https://accounts.google.com/gsi/client" async defer></script>
	
    <link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/moonspam/NanumSquare/master/nanumsquare.css">
    <link rel="stylesheet" type="text/css" href="/assets/css/login.css">
</head>
<body>
<div>
	<img src="/assets/img/main/logo.PNG">
	<img src="/assets/img/story/item01.PNG" style="margin:20px 0;">
	<a id="kakao_login" href="./kakaologin">
   		<img src="/assets/img/main/kakao_login_large.PNG"/>
   	</a>
   	
   	<a id="naver_login" href="./naverlogin">
   		<img src="/assets/img/main/naver_login.PNG"/>
   	</a>
   	
	<a id="google_login" href="./googlelogin">
   		<img src="/assets/img/main/google_login.PNG"/>
   	</a>
</div>

<script type="text/javascript">
var code = '${sessionScope.l_code}';

	$(document).ready(function(){
		if(code != ""){
			opener.parent.location.reload();
			
			window.close();
			
		}
	});
</script>
</body>
</html>