package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {

	public Student SaveStudentsDetails(Student student);
	public List<Student> getAllStudent();
	public Student getByID(int stud_id);
	public void deleteId(int stud_id);
	public Student updateStudentById(int stud_id, Student newstudent);
}
