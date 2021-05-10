<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


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

</head>
<body>
<%--aos.js 적용부분--%>
<script type="text/javascript">
    AOS.init();
    $("#social_login").click(function (){

    });

</script>

<!--헤더 시작-->
<div class="wrpDiv header_top">
    <a class="hd_logo">
        <img src="/assets/img/main/logo.PNG">
    </a>
    <div class="hd_login">
        <a id="social_login">로그인</a>
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
        <a class="cgMenu"><img src="/assets/img/main/category.png">카테고리</a>
        <div class="topMenu">
            <ul>
                <li><a>브랜드스토리</a></li>
                <li><a>인기상품</a></li>
                <li><a>공지사항</a></li>
                <li><a>이벤트</a></li>
                <li><a>매장안내</a></li>
            </ul>
        </div>
    </div>
</div>

<!--헤더 끝-->

<!--메인슬라이드 시작-->
<div class="wrp mainSlide">
    <div class="mainSlideImg">
        <div class="wrpDiv">
            <p class="conTopTxt"><span>카카오 프렌즈</span> 배경화면 출시!</p>
            <p class="conBtmTxt">매월마다 나오는 카카오 프렌즈 배경화면을 지금 바로 다운받아서 이용해보세요.</p>
            <a class="veiwMore">다운받으러 가기<img src="/assets/img/main/arrow.png"></a>
        </div>
    </div>
</div>
<!--메인슬라이드 끝-->

<!--메인 contents01 시작-->
<div class="wrp mainCon01">
    <p>카카오 데일리 스토리</p>
    <p>실시간 프렌즈들의 소식을 확인해보세요!</p>
</div>
<!--메인 contents01 시작-->

<!--메인 contents02 시작-->
<div class="wrp">
    <div class="wrpDiv mainCon02 swiper-container">
        <div class="swiper-wrapper">
            <div class="swiper-slide">
                <div class="con02left"  style="background-image: url(/assets/img/main/con02.png)"></div>
                <div class="con02right">
                    <div class="profile">
                        <div style="background-image: url(/assets/img/main/prof.png)"></div>
                        <p class="profileTxt"><span>죠르디</span><br>1일전</p>
                    </div>
                    <a class="rightTit">왕초보운전자 필수템🚨</a>
                    <a class="rightCon">귀염뽀짝 차량용품 나가신다 길을비켜라!!</a>
                    <div class="rightLike">
                        <a><img src="/assets/img/main/like.png">좋아요 268</a>
                        <a><img src="/assets/img/main/comment.png">댓글 265</a>
                        <a><img src="/assets/img/main/share.png">공유하기</a>
                    </div>
                    <input type="text" placeholder="댓글을 달아주세요" class="rightInput">
                    <p class="pickTit"><span>PICK!</span> 추천 상품</p>
                    <div class="pickItem">
                        <a class="pickItemCon">
                            <div class="pickImg" style="background-image: url(/assets/img/main/pickimg.png)"></div>
                            <p>차량용목쿠션_죠르디<br><span>12,000원</span></p>
                        </a>
                        <a class="pickShop">
                            <img src="/assets/img/main/bag.png">
                        </a>
                    </div>
                </div>
            </div>

            <div class="swiper-slide">
                <div class="con02left"  style="background-image: url(/assets/img/main/con02.png)"></div>
                <div class="con02right">
                    <div class="profile">
                        <div style="background-image: url(/assets/img/main/prof.png)"></div>
                        <p class="profileTxt"><span>죠르디</span><br>1일전</p>
                    </div>
                    <a class="rightTit">왕초보운전자 필수템🚨</a>
                    <a class="rightCon">귀염뽀짝 차량용품 나가신다 길을비켜라!!</a>
                    <div class="rightLike">
                        <a><img src="/assets/img/main/like.png">좋아요 268</a>
                        <a><img src="/assets/img/main/comment.png">댓글 265</a>
                        <a><img src="/assets/img/main/share.png">공유하기</a>
                    </div>
                    <input type="text" placeholder="댓글을 달아주세요" class="rightInput">
                    <p class="pickTit"><span>PICK!</span> 추천 상품</p>
                    <div class="pickItem">
                        <a class="pickItemCon">
                            <div class="pickImg" style="background-image: url(/assets/img/main/pickimg.png)"></div>
                            <p>차량용목쿠션_죠르디<br><span>12,000원</span></p>
                        </a>
                        <a class="pickShop">
                            <img src="/assets/img/main/bag.png">
                        </a>
                    </div>
                </div>
            </div>

            <div class="swiper-slide">
                <div class="con02left"  style="background-image: url(/assets/img/main/con02.png)"></div>
                <div class="con02right">
                    <div class="profile">
                        <div style="background-image: url(/assets/img/main/prof.png)"></div>
                        <p class="profileTxt"><span>죠르디</span><br>1일전</p>
                    </div>
                    <a class="rightTit">왕초보운전자 필수템🚨</a>
                    <a class="rightCon">귀염뽀짝 차량용품 나가신다 길을비켜라!!</a>
                    <div class="rightLike">
                        <a><img src="/assets/img/main/like.png">좋아요 268</a>
                        <a><img src="/assets/img/main/comment.png">댓글 265</a>
                        <a><img src="/assets/img/main/share.png">공유하기</a>
                    </div>
                    <input type="text" placeholder="댓글을 달아주세요" class="rightInput">
                    <p class="pickTit"><span>PICK!</span> 추천 상품</p>
                    <div class="pickItem">
                        <a class="pickItemCon">
                            <div class="pickImg" style="background-image: url(/assets/img/main/pickimg.png)"></div>
                            <p>차량용목쿠션_죠르디<br><span>12,000원</span></p>
                        </a>
                        <a class="pickShop">
                            <img src="/assets/img/main/bag.png">
                        </a>
                    </div>
                </div>
            </div>

            <div class="swiper-slide">
                <div class="con02left"  style="background-image: url(/assets/img/main/con02.png)"></div>
                <div class="con02right">
                    <div class="profile">
                        <div style="background-image: url(/assets/img/main/prof.png)"></div>
                        <p class="profileTxt"><span>죠르디</span><br>1일전</p>
                    </div>
                    <a class="rightTit">왕초보운전자 필수템🚨</a>
                    <a class="rightCon">귀염뽀짝 차량용품 나가신다 길을비켜라!!</a>
                    <div class="rightLike">
                        <a><img src"/assets/img/main/like.png">좋아요 268</a>
                        <a><img src"/assets/img/main/comment.png">댓글 265</a>
                        <a><img src"/assets/img/main/share.png">공유하기</a>
                    </div>
                    <input type="text" placeholder="댓글을 달아주세요" class="rightInput">
                    <p class="pickTit"><span>PICK!</span> 추천 상품</p>
                    <div class="pickItem">
                        <a class="pickItemCon">
                            <div class="pickImg" style="background-image: url(/assets/img/main/pickimg.png)"></div>
                            <p>차량용목쿠션_죠르디<br><span>12,000원</span></p>
                        </a>
                        <a class="pickShop">
                            <img src"/assets/img/main/bag.png">
                        </a>
                    </div>
                </div>
            </div>

            <div class="swiper-slide">
                <div class="con02left"  style="background-image: url(/assets/img/main/con02.png)"></div>
                <div class="con02right">
                    <div class="profile">
                        <div style="background-image: url(/assets/img/main/prof.png)"></div>
                        <p class="profileTxt"><span>죠르디</span><br>1일전</p>
                    </div>
                    <a class="rightTit">왕초보운전자 필수템🚨</a>
                    <a class="rightCon">귀염뽀짝 차량용품 나가신다 길을비켜라!!</a>
                    <div class="rightLike">
                        <a><img src"/assets/img/main/like.png">좋아요 268</a>
                        <a><img src"/assets/img/main/comment.png">댓글 265</a>
                        <a><img src"/assets/img/main/share.png">공유하기</a>
                    </div>
                    <input type="text" placeholder="댓글을 달아주세요" class="rightInput">
                    <p class="pickTit"><span>PICK!</span> 추천 상품</p>
                    <div class="pickItem">
                        <a class="pickItemCon">
                            <div class="pickImg" style="background-image: url(/assets/img/main/pickimg.png)"></div>
                            <p>차량용목쿠션_죠르디<br><span>12,000원</span></p>
                        </a>
                        <a class="pickShop">
                            <img src"/assets/img/main/bag.png">
                        </a>
                    </div>
                </div>
            </div>
        </div>
        <div class="slidePage"></div>
        <div class="slidePageBtn">
            <button class="prev">&lt;</button>
            <button class="next">&gt;</button>
        </div>
    </div>
</div>
<!--메인 contents02 끝-->

<!--메인 contents03 시작-->

<div class="wrp">
    <div class="wrpDiv mainCon03">
        <div class="conTitle">
            <a><span>BEST!</span> 카카오상품</a>
            <a>더보기</a>
        </div>
        <div class="mainCon03slide">
            <div class="mainCon03item">
                <div class="mainCon03img" style="background-image: url(/assets/img/main/item01.png)"></div>
                <a class="itemName">비접촉 스캔 체온계 어피치</a>
                <a class="itemPrice">69,000원</a>
                <a class="pickShop">
                    <img src"/assets/img/main/bag.png">
                </a>
            </div>
            <div class="mainCon03item">
                <div class="mainCon03img" style="background-image: url(/assets/img/main/item02.png)"></div>
                <a class="itemName">죠르디 칫솔스탠드</a>
                <a class="itemPrice">13,000원</a>
                <a class="pickShop">
                    <img src"/assets/img/main/bag.png">
                </a>
            </div>
            <div class="mainCon03item">
                <div class="mainCon03img" style="background-image: url(/assets/img/main/item03.png)"></div>
                <a class="itemName">스윗드림바디필로우_라이언</a>
                <a class="itemPrice">33,000원</a>
                <a class="pickShop">
                    <img src"/assets/img/main/bag.png">
                </a>
            </div>
            <div class="mainCon03item">
                <div class="mainCon03img" style="background-image: url(/assets/img/main/item04.png)"></div>
                <a class="itemName">죠르디 페이스 말랑쿠션</a>
                <a class="itemPrice">36,000원</a>
                <a class="pickShop">
                    <img src="/assets/img/main/bag.png">
                </a>
            </div>
        </div>
    </div>
</div>

<!--메인 contents03 끝-->

<!--메인 contents04 시작-->

<div class="wrp">
    <div class="wrpDiv mainCon04">
        <div class="leftDiv" data-aos="fade-right" data-aos-offset="200" data-aos-duration="2500">
            <p class="conTopTxt">누구에게나 사랑받는, <br>국민 캐릭터 카카오프렌즈</p>
            <p class="conBtmTxt">저마다의 개성과 매력을 지닌 라이언, 무지, 어피치, 프로도, 네오, 튜브, 콘, 제이지. <br>카카오프렌즈의 위트넘치는 표정과 행동은 폭넓은 공감과 유쾌한 웃음을 선사합니다.</p>
            <a class="veiwMore">자세히 보기<img src="/assets/img/main/arrow.png"></a>
        </div>
        <div class="rightDiv" data-aos="fade-left" data-aos-offset="200" data-aos-duration="2500">
            <div class="rightDivImg" style="background-image: url(/assets/img/main/con04.png)"></div>
        </div>
    </div>
</div>

<!--메인 contents04 끝-->

<!--메인 contents05 시작-->

<div class="wrp">
    <div class="wrpDiv mainCon05">
        <div class="conTitle">
            <a>WALLPAPER</a>
            <a>더보기</a>
        </div>
        <div class="conDiv" data-aos="fade-up" data-aos-offset="300" style="background-image: url(/assets/img/main/wp01.png)">
            <p>2021년 <br>2월의 배경화면</p>
            <a>
                <img src="/assets/img/main/b_arrow.png">
            </a>
        </div>
        <div class="conDiv" data-aos="fade-up" data-aos-offset="300" data-aos-delay="100" style="background-image: url(/assets/img/main/wp02.png)">
            <p>2021년 <br>3월의 배경화면</p>
            <a>
                <img src="/assets/img/main/b_arrow.png">
            </a>
        </div>
        <div class="conDiv" data-aos="fade-up" data-aos-offset="300" style="background-image: url(/assets/img/main/wp03.png)">
            <p>2021년 <br>4월의 배경화면</p>
            <a>
                <img src="/assets/img/main/b_arrow.png">
            </a>
        </div>
    </div>
</div>

<!--메인 contents05 끝-->

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
                카카오프렌즈 I 대표 : 소소프즈 I 인천광역시 부평구 부평동1234 <br>사업자등록번호 : 380-41-00272 I 고객센터 이메일 : sosofriends@naver.com <br>Copyright © SOSOFriends All rights reserved.
            </p>
        </div>
    </div>
</div>

<!--footer 끝-->



<script type="text/javascript" src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
<script type="text/javascript">
    const swiper = new Swiper('.swiper-container', {
        effect: 'coverflow',
        loop: true,
        loopAdditionalSlides : 1,
        navigation: {
          nextEl: '.slidePageBtn .next',
          prevEl: '.slidePageBtn .prev',
        },
        autoplay:{
          delay: 5000,
          disableOnInteraction : false
        },
        pagination: {
            el: '.slidePage',
            type: 'fraction',
        },
        allowTouchMove : false
    });
</script>
</body>
</html>
