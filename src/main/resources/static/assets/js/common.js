 if(!window.common)common = {};

common={
    additems :function(){
        var itemname = $("#name").val();
        var kakaoitems = $("form[name=itemform]").serialize();
        console.log(kakaoitems);  
        $.ajax({
            type: "POST",
            url: "../admin/additems/register",
            dataType: "json",
            data: kakaoitems,
            success: function(data){
	
				if (data.status.code == "200") {
					alert("카카오 아이템" + itemname + "이 등록 되었습니다");
					window.location.reload();
				} else {
						alert("카카오 아이템" + itemname + "이 등록실패 되었습니다");
					window.location.reload();
				}
			},
            error: function(err){
                alert("Error:카카오 아이템"+itemname+"이 등록실패!!");
                console.log(err);

            }
        });
    },
    login:function(){
			
	},
	
	addbags : function(){
		$.ajax({
            type: "POST",
            url: "../shop/addbags",
            dataType: "json",
            data: { },
            success: function(data){
	
				if (data.status.code == "200") {
					
				} else {
					
				}
			},
            error: function(err){
                alert("Error:카카오 아이템"+itemname+"이 등록실패!!");
                console.log(err);

            }
        });
	},
	
	baglists : function(){
		$.ajax({
            type: "POST",
            url: "../bagslist",
            dataType: "json",
            data: JSON.stringify({ useremail:'barbara0419@naver.com' }),
            contentType: "application/json",
            success: function(data){
	
				if (data.status.code == "200") {
					if(data.body == ""){
						html = '<div class="check_list check_list_none">';
                    	html += '<img src="/assets/img/my/none-img02.png">';
                    	html += '<p>아직 관심 상품이 없네요!<br>귀여운 프렌즈 상품을 추천드릴게요</p></div>';
                    	
                    	$(".check_list").append(html);
					}else{
						html = ' <div class="check_box all_choice">';
                   		html += '<input type="checkbox" name="checkbox" id="check01">';
                  		html += '<label for="check01">';
                  		html += '<img class="off" src="/assets/img/check_off.png">';
                  		html += '<img class="on" src="/assets/img/check_on.png">';
                  		html += '<p>전체선택</p></label></div>';
                  		html += '<div class="check_area"><div class="contents"><div class="check_box">';
                        html += '<input type="checkbox" name="checkbox" id="check02" checked>';
                      	html += '<label for="check02">';
                      	html += '<img class="off" src="/assets/img/check_off.png">';
                      	html += '<img class="on" src="/assets/img/check_on.png"></label></div>';
                     /*  <div style="background-image: url('/assets/img/my/img01.png')" class="img"></div>
                       <p>비접촉 스캔 체온계 어피치<br>69,000원</p>
                       <div class="btn_area">
                           <a class="btn on">구매하기</a>
                           <a class="btn on">삭제하기</a>
                       </div>*/
                   		html += '</div></div><a class="bottom_btn">장바구니</a>';
						
					}
				} else {
					console.log("errr")
				}
			},
            error: function(err){
                console.log(err);

            }
        });
	}
}
