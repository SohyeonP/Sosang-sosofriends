<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>장바구니</title>
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
          <p class="sub_title">장바구니</p>
           
           <div class="my_side_menu">
               <ul>
                   <li><a>최근 본 상품</a></li>
                   <li><a>내 활동</a></li>
                   <li class="on"><a>장바구니</a></li>
                   <li><a>주문내역</a></li>
               </ul>
           </div>
           
           <div class="check_list">
               
           </div>
       </div>
    </div> 
   
   
   
   
   
   
   
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
   
   
   
    
</body>
</html>