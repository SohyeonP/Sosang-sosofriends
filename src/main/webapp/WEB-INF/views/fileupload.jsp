<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="contextpath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<<<<<<< Updated upstream
    <script type="text/javascript" src="/assets/js/common.js"></script>
=======
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
>>>>>>> Stashed changes
    <link rel="stylesheet" href="/assets/css/fileupload.css">
    <title>Insert title here</title>
</head>
<body>
    <H2>제품 업로드 페이지</H2>
    <form class="upload" name="itemform">
        <div class="mb-3">
            <%--이미지,가격,제품 이름, 제품 등록번호,상세설명--%>
            <label for="name" class="form-label">제품 이름</label>
            <input type="name" class="form-control" id="name">
            <label for="price" class="form-label">제품 가격</label>
            <input type="number" class="form-control" id="price">
            <label for="charselect" class="form-label">캐릭터 종류</label>
            <select class="form-select form-select-sm" aria-label=".form-select-sm example" id="charselect">
                <option selected>캐릭터 선택</option>
                    <option value="R">라이언</option>
                    <option value="A">어피치</option>
                    <option value="M">무지</option>
                    <option value="F">프로도</option>
                    <option value="N">네오</option>
                    <option value="T">튜브</option>
                    <option value="Z">제이지</option>
                    <option value="C">콘</option>
                    <option value="J">죠르디</option>
                    <option value="S">스카피</option>
                    <option value="G">앙몬드</option>
                    <option value="P">팬다주이너</option>
                </select>
                <label for="cateselect" class="form-label">카테고리 종류</label>
                <select class="form-select form-select-sm" aria-label=".form-select-sm example" id="cateselect">
                    <option selected>카테고리 선택</option>
                    <option value="Y">테마기획전</option>
                    <option value="T">토이</option>
                    <option value="L">리빙</option>
                    <option value="D">잡화</option>
                    <option value="M">문구</option>
                    <option value="O">의류</option>
                    <option value="P">파자마</option>
                    <option value="V">여행/래저</option>
                    <option value="H">생활테크</option>
                    <option value="A">폰액세서리</option>
                    <option value="F">식품</option>
                </select>
        </div>
        <div class="mb-3">
            <div class="mb-3">
                <label for="input-image" class="form-label">상품 이미지</label>
                <img style="width: 200px;margin-top: 40px; margin-bottom: 40px;" id="preview-image" src="">
                <input  class="form-control form-control-sm" id="input-image" type="file">
            </div>

        </div>
        <button type="등록하기" class="btn btn-primary" id ="additems">Submit</button>
    </form>
</body>
<script>
    function readImage(input) {
        if (input.files && input.files[0]) {

            const reader = new FileReader();

            reader.onload = e => {
                const previewImage = document.getElementById("preview-image");
                previewImage.src = e.target.result;
            }
            reader.readAsDataURL(input.files[0])
        }
    }
    const inputImage = document.getElementById("input-image")
    inputImage.addEventListener("change", e => {
        readImage(e.target)
    })

    $(document).ready(function (){
        $("#additems").click(function (){
            common.additems();
        })
    })
</script>
</html>
