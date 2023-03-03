package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRespository;
	@Override
	public Student SaveStudentsDetails(Student student) {
		// TODO Auto-generated method stub
		return studentRespository.save(student);
	}
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRespository.findAll();
	}

	@Override
	public Student getByID(int stud_id) {
		Optional<Student> stu= studentRespository.findById(stud_id);
		return stu.get();
		
	}

	@Override
	public void deleteId(int stud_id) {
		// TODO Auto-generated method stub
		studentRespository.deleteById(stud_id);
	}

	@Override
	public Student updateStudentById(int stud_id, Student newstudent) {
		// TODO Auto-generated method stub
		Student availablestu=studentRespository.findById(stud_id).get();
		if(availablestu != null)
		{
			if(newstudent.getStud_name() != null )
			{
				availablestu.setStud_name(newstudent.getStud_name());
			}
			if(newstudent.getStud_address() != null )
			{
				availablestu.setStud_address(newstudent.getStud_address());
			}
			if(newstudent.getStud_marks() != 0)
			{
				availablestu.setStud_marks(newstudent.getStud_marks());
			}
			studentRespository.save(availablestu);
		}
	return availablestu;
		
	}
	

	
}
