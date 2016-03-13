//var rowCount = 1;
//function addMoreRows(frm) {
//rowCount ++;
//var recRow = '<p id="rowCount'+rowCount+'"><tr id="rowId"><td><select name="lecturerFullname" id="lecturerFullname" style="width:70%"><option>Monday</option><option>Tuesday</option><option>Wednesday</option><option>Thursday</option><option>Friday</option></select></td><td><input name="" type="time"  value="" /></td><td><input name="" type="time"  value="" /></td></tr><a href="javascript:void(0);" onclick="removeRow('+rowCount+');">Delete</a></p>';
//jQuery('#addedRows').append(recRow);
//}
//
//function removeRow(removeNum) {
//jQuery('#rowCount'+removeNum).remove();
//}
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
                        
			$(document).ready(function(){
                                
				$('.del').live('click',function(){
					$(this).parent().parent().remove();
				});
				
				$('.add').live('click',function(){
					$(this).val('Delete');
					$(this).attr('class','del');
					//Removed id from below <tr> because that will create duplicate #test id in dom 
					var appendTxt = "<tr><td><input type='hidden' name='id' value='pre_id'/><select name='presentationDay' id='' style='width:100%;'><option selected disabled >Choose day</option><option>Monday</option><option>Tuesday</option><option>Wednesday</option><option>Thursday</option><option>Friday</option></select></td><td><input type='time' name='presentationStart' style='padding: 2px 2px 2px 2px; margin-bottom:5px; margin-left:30px; height:90%; border-color:#e5e5e5; border-width: 2px; border-style: solid; background-color:white;'/></td><td><input type='time' name='presentationEnd' style='padding: 2px 2px 2px 2px; margin-bottom:5px; margin-left:0px; height:90%; border-color:#e5e5e5; border-width: 2px; border-style: solid; background-color: white;'/></td><td><input type='button' class='add' name='action' value='Add More' style='padding: 5px 0px 4px 5px; font-size:12pt; text-align:center; width:100%;'/></td></tr>";
					$("tr:last").after(appendTxt);			
				});        
			});
                        
