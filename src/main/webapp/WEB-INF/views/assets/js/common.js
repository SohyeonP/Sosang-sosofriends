$(document).ready(function() {
    $('.tab01').click(function(){
        $('.tab01').addClass('on');
        $('.tab02').removeClass('on');
        $('.tab01').css('border-right','1px solid #FF731B');
        $('.tabDiv01').css('display', 'block');
        $('.tabDiv02').css('display', 'none');
    });
});
    
$(document).ready(function() {
    $('.tab02').click(function(){
        $('.tab02').addClass('on');
        $('.tab01').removeClass('on');
        $('.tab01').css('border-right','none');
        $('.tabDiv02').css('display', 'block');
        $('.tabDiv01').css('display', 'none');
    });
});

$(document).ready(function() {
    $('.detailTab01').click(function(){
        $('.detailTab01').addClass('on');
        $('.detailTab02').removeClass('on');
        $('.detailTab03').removeClass('on');
        $('.detailTabCon01').css('display', 'block');
        $('.detailTabCon02').css('display', 'none');
        $('.detailTabCon03').css('display', 'none');
    });
});

$(document).ready(function() {
    $('.detailTab02').click(function(){
        $('.detailTab02').addClass('on');
        $('.detailTab01').removeClass('on');
        $('.detailTab03').removeClass('on');
        $('.detailTabCon02').css('display', 'block');
        $('.detailTabCon01').css('display', 'none');
        $('.detailTabCon03').css('display', 'none');
    });
});

$(document).ready(function() {
    $('.detailTab03').click(function(){
        $('.detailTab03').addClass('on');
        $('.detailTab01').removeClass('on');
        $('.detailTab02').removeClass('on');
        $('.detailTabCon03').css('display', 'block');
        $('.detailTabCon01').css('display', 'none');
        $('.detailTabCon02').css('display', 'none');
    });
});

$(document).ready(function() {
    $('.my_side_menu ul li.on').next().children().css('border-top','none');
});

$(document).ready(function() {
    
    
    // 체크박스 전체 선택
    /*function checkAll(){
        if(document.getElementById('check01').checked == true){
            for(var i=0; i<5; i++) document.getElementsByName('checkbox')[i].checked=true;
        };
        if(document.getElementById("check01").checked == false){
            for(var i=0; i<5; i++) document.getElementsByName("checkbox")[i].checked=false;
        };
    };
    $('#check01').click(function(){
        checkAll();
    });*/
});

$(document).ready(function() {
    $('.popup .popup_area .close').click(function(){
        $('.popup').css('display', 'none');
    });
});

