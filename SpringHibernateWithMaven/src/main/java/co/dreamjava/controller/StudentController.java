package co.dreamjava.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.dreamjava.entity.StudentEntity;
import co.dreamjava.service.StudentService;

@Controller
public class StudentController {

	
	@Resource
	@Qualifier("studentHandler")
	private StudentService studentHandler;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String listStudentAll(ModelMap map){
		
		map.addAttribute("student", new StudentEntity());
		map.addAttribute("studentList",studentHandler.getAllEmployees());
		
		return "editStudentList";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addMoreStudent(@ModelAttribute(value="student") StudentEntity student,BindingResult result){
		studentHandler.addStudent(student);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{studentid}")
	public String deleteStudent(@PathVariable("studentid") int studid){
		studentHandler.deleteStudent(studid);
		return "redirect:/";
	}

	public void setStudentHandler(StudentService studentHandler) {
		this.studentHandler = studentHandler;
	}
	
	
	
}
