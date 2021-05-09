 if(!window.common)common = {};

common={
    additems :function(){
        var itemname = $("#name").val();
        var kakaoitems = $("form[name=itemform]").serializeToString();
        console.log(kakaoitems);
        /*$.ajax({
            type: "POST",
            url: "../additems.do",
            dataType: "json",
            data: kakaoitems,
            success: function(data){
                if(data.isSuccessful){
                    $("#api_key").text(data.body.apikey);
                    showalarm('reissuance');
                } else {
                    if(data.status.code == "E10") {
                        alert("카카오 아이템"+itemname+"이 등록 되었습니다");
                        window.location.reload();
                    } else {
                        alert("카카오 아이템"+itemname+"이 등록실패하였습니다.");
                        window.location.reload();
                    }
                }

            },
            error: function(err){
                alert("카카오 아이템"+itemname+"이 등록실패하였습니다. 에러남!");
                console.log(err);

            }
        });*/

    }
}
