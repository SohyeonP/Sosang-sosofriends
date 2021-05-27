<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="wrpDiv header_top">
    <a class="hd_logo" href="./">
        <img src="/assets/img/main/logo.PNG">
    </a>
    <div class="hd_login">
        <a>회원가입</a>
        <p>|</p>
        <a>마이페이지</a>
        <p>|</p>
        <a>장바구니</a>
        <p>|</p>
        <c:if test="${sessionScope.userid eq null}">
        	<a onclick="loginpop();">로그인</a>
        </c:if>
        <c:if test="${sessionScope.userid ne null }">
        	<c:if test="${sessionScope.lo_info eq 'k' }">
        		<a href="./kakaologout">로그아웃</a>
        	</c:if>
        	<c:if test="${sessionScope.lo_info eq 'n' }">
        		<a href="./naverlogout">로그아웃</a>
        	</c:if>
       </c:if>
    </div>
</div>

<div class="wrp header_btm">
    <div class="wrpDiv hdBtmDiv">
        <a class="cgMenu"><img src="/assets/img/main/category.png">카테고리</a>
        <div class="topMenu">
            <ul>
               <li><a href="./story">브랜드스토리</a></li>
               <li><a>인기상품</a></li>
               <li><a href="./notice">공지사항</a></li>
               <li><a>이벤트</a></li>
               <li><a href="./store">매장안내</a></li>
            </ul>
        </div>
    </div>
</div>

<script type="text/javascript">
	function loginpop(){
		var left = ($(window).width() / 2) - 200;
		var top  = ($(window).height() / 2) - 300;
		var specs = "width = "+400+", height = "+600+", top = "+top+", left = "+left+", location = no, menubar=no, status=no, toolbar=no";
		
		window.open("./sosologin","로그인",specs);
	}
</script>
    