//WRITE YOUR jQUERY CODE HERE
$(document).ready(function(){
    $(".add-row").click(function(){
        var name = $("#name").val();
        var markup = "<tr><td><input type='checkbox'name='record'></td><td>" + name + "</td></tr>";
        $("table tbody").append(markup);
    });
$(".delete-row").click(function(){
    $("table tbody").find('input[name="record"]').each(function(){ 
        if($(this).is(":checked")){
            $(this).parents("tr").remove();
}
    
});
    
});
});   
