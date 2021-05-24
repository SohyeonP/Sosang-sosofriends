<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>상품 리스트 페이지</title>
    <link rel="stylesheet" href="/assets/css/style.css">
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="/assets/js/common.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/moonspam/NanumSquare/master/nanumsquare.css">
</head>
<body>
   <!--헤더 시작-->
   
       <div class="wrpDiv header_top">
           <a class="hd_logo" href="./">
               <img src="assets/img/main/logo.PNG">
           </a>
           <div class="hd_login">
               <a>로그인</a>
               <p>|</p>
               <a>회원가입</a>
               <p>|</p>
               <a>마이페이지</a>
               <p>|</p>
               <a>장바구니</a>
           </div>
       </div>
       
       <div class="wrp header_btm">
           <div class="wrpDiv hdBtmDiv">
               <a class="cgMenu"><img src="assets/img/main/category.png">카테고리</a>
               <div class="topMenu">
                   <ul>
                       <li><a href="./story">브랜드스토리</a></li>
                       <li><a>인기상품</a></li>
                       <li><a>공지사항</a></li>
                       <li><a>이벤트</a></li>
                       <li><a href="./store">매장안내</a></li>
                   </ul>
               </div>
           </div>
       </div>
   
   <!--헤더 끝-->  
   
    <div class="wrp">
       <div class="wrpDiv">
           <div class="prodListTab">
               <p class="tab01 on">카테고리</p>
               <p class="tab02">캐릭터</p>
           </div>
           <div class="tabDiv01">
               <ul>
                   <li class="on"><a>전체</a></li>
                   <li><a>토이</a></li>
                   <li><a>잡화</a></li>
                   <li><a>의류</a></li>
                   <li><a>여행레저</a></li>
                   <li><a>폰액세서리</a></li>
                   <li><a>테마기획전</a></li>
               </ul>
               <ul style="margin-top: 28px;">
                   <li><a>리빙</a></li>
                   <li><a>문구</a></li>
                   <li><a>파자마</a></li>
                   <li><a>생활테크</a></li>
                   <li><a>식품</a></li>
               </ul>
           </div>
           <div class="tabDiv02">
               <ul>
                   <li class="on">
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character01.png)"></div>
                           <p>라이언</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character02.png)"></div>
                           <p>어피치</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character03.png)"></div>
                           <p>무지</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character04.png)"></div>
                           <p>포르도</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character05.png)"></div>
                           <p>네오</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character06.png)"></div>
                           <p>튜브</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character07.png)"></div>
                           <p>제이지</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character08.png)"></div>
                           <p>콘</p>
                       </a>
                   </li>
                   
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character09.png)"></div>
                           <p>춘식</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(assets/img/product_list/character10.png)"></div>
                           <p>죠르디</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character11.png)"></div>
                           <p>스카피</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character12.png)"></div>
                           <p>양몬드</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character13.png)"></div>
                           <p>팬다주니어</p>
                       </a>
                   </li>
                   <li>
                       <a>
                           <div style="background-image: url(/assets/img/product_list/character14.png)"></div>
                           <p>꿈돌이</p>
                       </a>
                   </li>
               </ul>
           </div>
       </div>
        
    </div> 
   
   
   <!-- 상품리스트 contents01 시작-->
   
   <div class="wrp prodList01">
       <div class="wrpDiv mainCon03">
           <div class="conTitle">
               <a>당신을 위한 추천상품</a>
            </div>
           <div class="mainCon03slide">
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/main/item01.png)"></div>
                   <a class="itemName">비접촉 스캔 체온계 어피치</a>
                   <a class="itemPrice">69,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/main/item02.png)"></div>
                   <a class="itemName">죠르디 칫솔스탠드</a>
                   <a class="itemPrice">13,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/main/item03.png)"></div>
                   <a class="itemName">스윗드림바디필로우_라이언</a>
                   <a class="itemPrice">33,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/main/item04.png)"></div>
                   <a class="itemName">죠르디 페이스 말랑쿠션</a>
                   <a class="itemPrice">36,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
           </div>
       </div>
   </div>
   
   <!-- 상품리스트 contents01 끝-->
   
   <!-- 상품리스트 contents02 시작-->
   
   <div class="wrp prodList02">
       <div class="wrpDiv mainCon03">
         <div class="prodSelect">
              <select>
                  <option>인기순</option>
                  <option>추천순</option>
                  <option>리뷰순</option>
              </select>
           </div>
           <div class="mainCon03slide">
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/01.png)"></div>
                   <a class="itemName">라이언x오뚜기 소프트 펜케이스</a>
                   <a class="itemPrice">15,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/02.png)"></div>
                   <a class="itemName">라이언x오뚜기 핸드폰 거치대</a>
                   <a class="itemPrice">19,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/03.png)"></div>
                   <a class="itemName">라이언x오뚜기 포켓 장바구니</a>
                   <a class="itemPrice">12,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/04.png)"></div>
                   <a class="itemName">애플워치 충전 거치대 라이언</a>
                   <a class="itemPrice">22,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/05.png)"></div>
                   <a class="itemName">비접촉 스캔 체온계 라이언</a>
                   <a class="itemPrice">69,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/06.png)"></div>
                   <a class="itemName">멀티 등쿠션_라이언</a>
                   <a class="itemPrice">45,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/07.png)"></div>
                   <a class="itemName">소스볼 &amp; 버터 나이프 세트</a>
                   <a class="itemPrice">14,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/08.png)"></div>
                   <a class="itemName">스윗드림바디필로우_라이언</a>
                   <a class="itemPrice">33,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/09.png)"></div>
                   <a class="itemName">오토 손세정기_라이언</a>
                   <a class="itemPrice">39,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/10.png)"></div>
                   <a class="itemName">비접촉 스캔 체온계 어피치</a>
                   <a class="itemPrice">69,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/11.png)"></div>
                   <a class="itemName">런던에디션 소프트토이_근위병 라이언</a>
                   <a class="itemPrice"><span class="itemSale">46%</span>19,000원<span class="itemBfPrice">32,000원</span></a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/12.png)"></div>
                   <a class="itemName">도어가드_리틀라이언</a>
                   <a class="itemPrice">9,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/13.png)"></div>
                   <a class="itemName">비접촉 스캔 체온계 어피치</a>
                   <a class="itemPrice">69,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/14.png)"></div>
                   <a class="itemName">케이블홀더_리틀라이언</a>
                   <a class="itemPrice">10,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/15.png)"></div>
                   <a class="itemName">비접촉 스캔 체온계 어피치</a>
                   <a class="itemPrice">69,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/16.png)"></div>
                   <a class="itemName">얌얌 동전지갑 라이언</a>
                   <a class="itemPrice"><span class="itemSale">50%</span>3,500원<span class="itemBfPrice">7,000원</span></a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/01.png)"></div>
                   <a class="itemName">라이언x오뚜기 소프트 펜케이스</a>
                   <a class="itemPrice">15,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/02.png)"></div>
                   <a class="itemName">라이언x오뚜기 핸드폰 거치대</a>
                   <a class="itemPrice">19,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/03.png)"></div>
                   <a class="itemName">라이언x오뚜기 포켓 장바구니</a>
                   <a class="itemPrice">12,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               <div class="mainCon03item">
                   <div class="mainCon03img" style="background-image: url(assets/img/product_list/04.png)"></div>
                   <a class="itemName">애플워치 충전 거치대 라이언</a>
                   <a class="itemPrice">22,000원</a>
                   <a class="pickShop">
                        <img src="assets/img/main/bag.png">
                    </a>
               </div>
               
               
           </div>
       </div>
   </div>
   
   <!-- 상품리스트 contents02 끝-->
   
   <!-- 페이징 시작 -->
   <div class="wrp">
       <div class="pageNumber">
           <ul>
               <li class="on"><a>1</a></li>
               <li><a>2</a></li>
               <li><a>3</a></li>
               <li><a>4</a></li>
               <li><a>5</a></li>
               <li><a>6</a></li>
           </ul>
       </div>
   </div>
   <!-- 페이징 끝 -->
   
   
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
   
   
   
    
</body>
</html>