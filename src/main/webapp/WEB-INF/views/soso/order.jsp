<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>main</title>
    <link rel="stylesheet" href="/assets/css/style.css">
    <link rel="stylesheet" href="https://cdn.rawgit.com/moonspam/NanumSquare/master/nanumsquare.css">
    <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css">

    <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="https://unpkg.com/aos@next/dist/aos.js"></script>
	<script type="text/javascript" src="/assets/js/common.js"></script>
</head>
<body>
<%--aos.js 적용부분--%>
<script type="text/javascript">
    AOS.init();
   /*  $("#social_login").click(function (){
    	 common.additems();
    }); */

</script>

<!--헤더 시작-->
<c:import url="./header.jsp"></c:import>

<!--헤더 끝-->

<!--메인 contents02 시작-->
<div class="wrp">
 <p class="sub_title">결제하기</p>
  
  <div class="check_list" style="width:100%;">
  <table class="ordertable" style="text-align:center; width:1280px; margin:0 auto;">
  	<thead>
  	<tr style="font-size:20px; font-weight: bold;">
  	<td style="border-bottom: 2px solid #000000; padding-bottom:20px;">상품정보</td>
  	<td style="border-bottom: 2px solid #000000; padding-bottom:20px;">배송비</td>
  	<td style="border-bottom: 2px solid #000000; padding-bottom:20px;">수량</td>
  	<td style="border-bottom: 2px solid #000000; padding-bottom:20px;">할인</td>
  	<td style="border-bottom: 2px solid #000000; padding-bottom:20px;">가격</td>
  	</tr>
  	</thead>
  	<tbody class="tbody">
  	
  	</tbody>
  </table>
  
  <div style="border-top: 1px dashed #000000; width:1280px; margin:20px auto; padding:20px;">
  <div style="float:right;">
  <p style="font-size:20px; font-weight:bold; display:inline-block">총 결제금액</p>
  <p style="font-size:20px; font-weight:bold; display:inline-block; color:#FF731B;"><span class="price"></span>원</p>
  </div>
  </div>
  
  <div style=" width:1280px; margin:50px auto;">
  <p style="font-size:25px; font-weight:bold; margin-bottom:20px;">배송지 정보</p>
  
  <input type="text" class="doro" style="width:500px;" placeholder="주소를 입력해주세요."/>
  <input type="text" placeholder="상세주소를 입력해주세요." class="detailjuso" style="width:1250px;"/>
  <p style="font-size:18px; font-weight:bold; margin:50px 0 20px;">배송시 요청사항</p>
  <input type="text" placeholder="배송 요청사항을 입력해주세요." class="deliverytext" style="width:1250px;"/>
  </div>
      <a class="bottom_btn orderbtn" style="margin:40px auto; float: none;">결제하기</a>
  </div>
</div>
<!--메인 contents02 끝-->




<!--footer 시작-->

<div class="wrp footer">
    <div class="wrpDiv ft01">
        <a>카카오프렌즈 브랜드스토리</a>
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
                카카오프렌즈 I 대표 : 경기도 안양시 동안구 비산동 임곡로 29 <br>사업자등록번호 : 380-41-00272 I 고객센터 이메일 : sosofriends@naver.com <br>Copyright © SOSOFriends All rights reserved.
            </p>
        </div>
    </div>
</div>

<!--footer 끝-->



<script type="text/javascript" src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
<script type="text/javascript">
    
    $(document).ready(function(){
    	common.orderlist();
    	
    	$(".orderbtn").click(function(){
    		var price = $(".price").text();
    		var address= $(".doro").val() + $(".detailjuso").val();
    		console.log(price, address);
    		
    		common.order(price, address);
    	})
    })
</script>
</body>
</html>
