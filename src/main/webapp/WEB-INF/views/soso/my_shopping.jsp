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
             <div class="check_box all_choice">
                   <input type="checkbox" name="checkbox" id="check01">
                  <label for="check01">
                  <img class="off" src="/assets/img/check_off.png">
                  <img class="on" src="/assets/img/check_on.png">
                  <p>전체선택</p>
                   </label>
               </div>
               <div class="check_area">
                   <div class="contents">
                     <div class="check_box">
                       <input type="checkbox" name="checkbox" id="check02" checked>
                      <label for="check02">
                      <img class="off" src="/assets/img/check_off.png">
                      <img class="on" src="/assets/img/check_on.png">
                       </label>
                   </div>
                       <div style="background-image: url('/assets/img/my/img01.png')" class="img"></div>
                       <p>비접촉 스캔 체온계 어피치<br>69,000원</p>
                       <div class="btn_area">
                           <a class="btn on">구매하기</a>
                           <a class="btn on">삭제하기</a>
                       </div>
                   </div>
                   <div class="contents">
                     <div class="check_box">
                       <input type="checkbox" name="checkbox" id="check03">
                      <label for="check03">
                      <img class="off" src="/assets/img/check_off.png">
                      <img class="on" src="/assets/img/check_on.png">
                       </label>
                   </div>
                       <div style="background-image: url('/assets/img/my/img02.png')" class="img"></div>
                       <p>죠르디 칫솔스탠드<br>13,000원</p>
                       <div class="btn_area">
                           <a class="btn">구매하기</a>
                           <a class="btn">삭제하기</a>
                       </div>
                   </div>
               </div>
               <a class="bottom_btn">장바구니</a>
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