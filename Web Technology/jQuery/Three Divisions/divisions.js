//WRITE YOUR jQUERY CODE HERE
$(document).ready(function(){
    $("#button1").click(function(){
        $("div[name$='Intelligence']").css("background-color","yellow");
    });
});