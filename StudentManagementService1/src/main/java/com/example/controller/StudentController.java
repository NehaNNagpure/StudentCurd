package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired 
	private StudentService studentService;
	
	@PostMapping("insert")
	public Student SaveStudentsDetails(@RequestBody Student student)
	{
		return studentService.SaveStudentsDetails(student);
	}

	
	@GetMapping("/select")
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
	
	@GetMapping("/selectid/{stud_id}")
	public Student getByID(@PathVariable("stud_id") int stud_id)
	{
		return studentService.getByID(stud_id);
	}
	
	@DeleteMapping("/delete/{stud_id}")
	public void deleteId(@PathVariable("stud_id") int stud_id)
	{
		studentService.deleteId(stud_id);
	}
	
	@PutMapping("/update/{stud_id}")
	public Student updateStudentById(@PathVariable("stud_id") int stud_id,@RequestBody Student newstudent)
	{
		return studentService.updateStudentById(stud_id, newstudent);
	}
}
