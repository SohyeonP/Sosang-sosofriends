<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>인기상품</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="assets/js/common.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/moonspam/NanumSquare/master/nanumsquare.css">
</head>
<body>
   <!--헤더 시작-->
   
       <c:import url="./header.jsp"></c:import>
   
   <!--헤더 끝-->  
   
    <div class="wrp">
       <div class="wrpDiv ">
          <p class="sub_title">인기상품</p>
           <div class="hot_item_list01">
               <a style="background-image: url('assets/img/hot/img01.png')"><img class="pickShop" src="assets/img/hot_bag.png">
               	<input type="hidden" class="itemName" value="복근라이언과 조교춘식이"/>
               	<input type="hidden" class="itemPrice" value="35000"/>
               	<input type="hidden" class="itemCode" value="R0007T2021061500"/>
               </a>
               <a style="background-image: url('assets/img/hot/img02.png')"><img class="pickShop" src="assets/img/hot_bag.png">
               	<input type="hidden" class="itemName" value="라이언정리함 무선충전거치대"/>
               	<input type="hidden" class="itemPrice" value="52000"/>
               	<input type="hidden" class="itemCode" value="R0003T2021061421"/>
               </a>
               <a style="background-image: url('assets/img/hot/img03.png')"><img class="pickShop" src="assets/img/hot_bag.png">
               	<input type="hidden" class="itemName" value="피규어 마스크스트랩 어피치"/>
               	<input type="hidden" class="itemPrice" value="8500"/>
               	<input type="hidden" class="itemCode" value="A0004T2021061500"/>
               </a>
               <a style="background-image: url('assets/img/hot/img04.png')"><img class="pickShop" src="assets/img/hot_bag.png">
               	<input type="hidden" class="itemName" value="죠르디 핑거퍼펫세트"/>
               	<input type="hidden" class="itemPrice" value="19000"/>
               	<input type="hidden" class="itemCode" value="J0008T2021061500"/>
               </a>
               <a style="background-image: url('assets/img/hot/img05.png')"><img class="pickShop" src="assets/img/hot_bag.png">
               	<input type="hidden" class="itemName" value="차량용목쿠션 죠르디"/>
               	<input type="hidden" class="itemPrice" value="12000"/>
               	<input type="hidden" class="itemCode" value="J0007T2021061500"/>
               </a>
           </div>
           <div class="hot_item_list02">
               <a style="background-image: url('assets/img/hot/img06.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img07.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img08.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img09.png')"><img src="assets/img/hot_bag.png"></a>
           </div>
           <div class="hot_item_list03">
              <div>
               <a style="background-image: url('assets/img/hot/img10.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img11.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img12.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img13.png')"><img src="assets/img/hot_bag.png"></a>
            </div>
               <a style="background-image: url('assets/img/hot/img14.png')"><img src="assets/img/hot_bag.png"></a>
           </div>
           <div class="hot_item_list02">
               <a style="background-image: url('assets/img/hot/img15.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img16.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img17.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img18.png')"><img src="assets/img/hot_bag.png"></a>
           </div>
           <div class="hot_item_list01">
               <a style="background-image: url('assets/img/hot/img01.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img02.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img03.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img04.png')"><img src="assets/img/hot_bag.png"></a>
               <a style="background-image: url('assets/img/hot/img05.png')"><img src="assets/img/hot_bag.png"></a>
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
                   <img src="assets/img/main/footer.png">
                   카카오프렌즈 I 대표 : 소소프즈 I 인천광역시 부평구 부평동1234 <br>사업자등록번호 : 380-41-00272 I 고객센터 이메일 : sosofriends@naver.com <br>Copyright © SOSOFriends All rights reserved.
               </p>
           </div>
       </div>
   </div>
   
   <!--footer 끝-->
   
   
   <script>
   $(document).ready(function(){
   	$(".pickShop").click(function(){
   		var name = $(this).parent().children(".itemName").val();
   		var price = $(this).parent().children(".itemPrice").val();
   		var num = $(this).parent().children(".itemCode").val();
   		
   		common.addbags(name, price, num);
   	})
   })
   </script>
   
    
</body>
</html>