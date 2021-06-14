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
			
	}
}
