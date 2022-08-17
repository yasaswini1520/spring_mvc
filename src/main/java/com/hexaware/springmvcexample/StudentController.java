package com.hexaware.springmvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hexaware.springmvcexample.model.Student;

@Controller
public class StudentController {
	
	Student st = null;
	public StudentController() {
		st = new Student(4567, "Rama");
	}
	
	@RequestMapping(value = "/student",method = RequestMethod.GET)
	public String studentDetails(Model model) {
		model.addAttribute("studentDetails",st);
		return "studentprofile";
		
	}
	
	@RequestMapping(value = "/registerstudent",method = RequestMethod.POST)
	public String enterStudentDetails(@Validated Student newStudent, Model model) {
		System.out.println("Register Student Details Page Requested....");
		model.addAttribute("studentId",newStudent.getStudentId());
		model.addAttribute("studentName",newStudent.getStudentName());
		return "studentprofile";
		
	}

}
