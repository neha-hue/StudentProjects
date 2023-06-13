package com.stud.services;

import com.stud.exceptions.StudentException;
import com.stud.model.Student;

import java.util.List;


public interface StudentService {
public Student createStudent(Student student);
public Student updateStudent(Student student,Integer studentId) throws StudentException;
public Student getStudentById(Integer studentId) throws StudentException;
public List<Student> getAllStudent();
public String deleteStudent(Integer studentId) throws StudentException;

}
