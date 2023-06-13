package com.stud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stud.exceptions.StudentException;
import com.stud.model.Student;
import com.stud.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student createStudent(Student student) {
		 
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student, Integer studentId) throws StudentException {
		Student updateStudent = studentRepo.findById(studentId)
				.orElseThrow(() -> new StudentException("student not found"));
		updateStudent.setStudentName(student.getStudentName());
		updateStudent.setAddress(student.getAddress());
		updateStudent.setStudentEmail(student.getStudentEmail());
		updateStudent.setMobileNumber(student.getMobileNumber());
		return studentRepo.save(updateStudent);
	}

	@Override
	public Student getStudentById(Integer studentId) throws StudentException {
		Student student = studentRepo.findById(studentId)
				.orElseThrow(() -> new StudentException("student not found with this studentId" + studentId));
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepo.findAll();
	}

	@Override
	public String deleteStudent(Integer studentId) throws StudentException {

		Student deleteStudent = studentRepo.findById(studentId)
				.orElseThrow(() -> new StudentException("student not found with this studentId" + studentId));
		studentRepo.delete(deleteStudent);
		return "Student deleted sucessfully";
	}

}
