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
        	<a id="social_login" href="https://kauth.kakao.com/oauth/authorize?client_id=d7a451134c2548e9b0b111051f80c34e&redirect_uri=http://localhost:8080/login&response_type=code">
        		<img src="/assets/img/main/kakao_login.PNG" style="margin-top:-8px;"/>
        	</a>
        </c:if>
        <c:if test="${sessionScope.userid ne null }">
        	<a href="./logout">로그아웃</a>
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
    