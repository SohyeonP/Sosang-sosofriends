 if(!window.common)common = {};

common={
	id: "",
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
	
	addbags : function(name, price, num ){
		var data = { 
						useremail: common.id,
						product_name: name,
						product_price: price,
						product_cnt : '1',
						product_num : num
					}
					console.log(data)
		$.ajax({
            type: "POST",
            url: "../addbags",
            dataType: "json",
            data: JSON.stringify(data),
            contentType:"application/json",
            success: function(data){
	
				if (data.status.code == "200") {
					alert("장바구니에 상품이 담겼습니다!");
					console.log(data)
				} else {
					console.log("!2312123123")
				}
			},
            error: function(err){
                console.log(err);

            }
        });
	},
	
	baglists : function(){
		$.ajax({
            type: "POST",
            url: "../bagslist",
            dataType: "json",
            data: JSON.stringify({ useremail: common.id }),
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
                      	
                      	var items = data.body;
                      	console.log(items);
                      	
                      	items.forEach(function(item){
	
	                  		html += '<div class="check_area"><div class="contents"><div class="check_box">';
	                        html += '<input type="checkbox" name="checkbox" id="check02" checked>';
	                      	html += '<label for="check02">';
	                      	html += '<img class="off" src="/assets/img/check_off.png">';
	                      	html += '<img class="on" src="/assets/img/check_on.png"></label></div>';
							html += '<div style="background-image: url(\'/assets/itemimages/'+ item.kpi_cate_img +'\')" class="img"></div>';
							html += '<p>'+ item.ksp_name +'<br>'+ item.ksp_price +'원</p>';
							html += '<div class="btn_area"><a class="btn on">구매하기</a><a class="btn on">삭제하기</a></div></div>';
						})
						
                   		html += '</div><a class="bottom_btn" onclick="location.href=\'Porder\'">구매하기</a>';
                   		
                   		$(".check_list").append(html);
						
					}
				} else {
					console.log("errr")
				}
			},
            error: function(err){
                console.log(err);

            }
        });
	},
	
	orderlist :function(){
			$.ajax({
            type: "POST",
            url: "../bagslist",
            dataType: "json",
            data: JSON.stringify({ useremail: common.id }),
            contentType: "application/json",
            success: function(data){
	
				if (data.status.code == "200") {
                      	var items = data.body;
                      	console.log(items);
                      	html = '';
                      	var price = 0;
                      	items.forEach(function(item){
	
	                  		html += '<tr><td style="width:700px;"><div class="orderimg" style="background-image: url(\'/assets/itemimages/'+ item.kpi_cate_img +'\')"></div>';
	                  		html += '<p class="ordertext">'+ item.ksp_name +'</p></td>';
	                  		html += '<td>-</td><td>1</td><td>-</td><td>'+ item.ksp_price + '원</td></tr>';
	                  		
	                  		const iprice = item.ksp_price.replace(",", "");
	                  		price += Number(iprice);
						})
                   		$(".tbody").append(html);
                   		$(".price").text(price.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ","));
				} else {
					console.log("errr")
				}
			},
            error: function(err){
                console.log(err);

            }
        });
	},
	
	order : function(price, address){
		$.ajax({
			type:'post', 
			url: "../order",
            dataType: "json",
            data: JSON.stringify({ useremail: common.id, kfs_pay: price, order_address: address }),
            contentType: "application/json",
            success: function(data){
				if (data.status.code == "200") {
					alert("주문이 완료 되었습니다.");
					location.href="../shopping";
				}else{
					console.log("err")
				}
			},
			 error: function(err){
                console.log(err);

            }
	
		})
	}
}
