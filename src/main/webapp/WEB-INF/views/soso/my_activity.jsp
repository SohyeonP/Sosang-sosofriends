<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>내 활동</title>
    <link rel="stylesheet" href="/assets/css/style.css">
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="/assets/js/common.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/moonspam/NanumSquare/master/nanumsquare.css">
</head>

<body>
    <!--헤더 시작-->

    <c:import url="./header.jsp"></c:import>

    <!--헤더 끝-->

    <div class="wrp">
        <div class="wrpDiv">
            <p class="sub_title">내 활동</p>

            <div class="my_side_menu">
                <ul>
                    <li><a href="recentlist">최근 본 상품</a></li>
                    <li class="on"><a href="./myactivity">내 활동</a></li>
                    <li><a href="./shopping">장바구니</a></li>
                    <li><a>주문내역</a></li>
                </ul>
            </div>

            <div class="check_list">
                
            </div>
        </div>
    </div>

<c:if test="${sessionScope.userid eq null}">
    <div class="popup">
        <div class="bg"></div>
        <div class="popup_area my_activity">
            <button class="close"><img src="/assets/img/close.png"></button>
            <div class="contents">
                <img src="/assets/img/my/login.png">
                <p>로그인 후에 이용해주세요!</p>
                <p>로그인을 해야 확인이 가능합니다! 로그인 후 이용하기❤️</p>
                <a onclick="loginpop();"><img src="/assets/img/kakao_login.png"></a>
            </div>
        </div>
    </div>
</c:if>



    <!--footer 시작-->

    <div class="wrp footer">
        <div class="wrpDiv ft01">
            <a>회사소개</a>
            <p>|</p>
            <a>개인정보처리방침</a>
            <p>|</p>
            <a>이용약관</a>
            <p>|</p>
            <a>공지사항</a>
        </div>
        <div class="wrp ft02">
            <div class="wrpDiv">
                <p>
                    <img src="/assets/img/main/footer.png">
                    카카오프렌즈 I 대표 : 소소프즈 I 인천광역시 부평구 부평동1234 <br>사업자등록번호 : 380-41-00272 I 고객센터 이메일 : sosofriends@naver.com <br>Copyright © SOSOFriends All rights reserved.
                </p>
            </div>
        </div>
    </div>

    <!--footer 끝-->


<script>
$(document).ready(function(){
	$(".close").click(function(){
		$(".popup").hide();
	})
})

function loginpop(){
	var left = ($(window).width() / 2) - 200;
	var top  = ($(window).height() / 2) - 300;
	var specs = "width = "+400+", height = "+600+", top = "+top+", left = "+left+", location = no, menubar=no, status=no, toolbar=no";
	
	window.open("./sosologin","로그인",specs);
}
</script>



</body>

</html>