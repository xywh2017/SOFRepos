/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var form = $('#form1');
form.submit(function () {
 
$.ajax({
type: form.attr('method'),
url: form.attr('action'),
data: form.serialize(),
success: function (data) {
var result=data;
$('#result').attr("value",result);
 
}
});
 
return false;
});