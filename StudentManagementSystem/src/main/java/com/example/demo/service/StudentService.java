package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.bean.Student;

public interface StudentService {


	public void addStudentDetails(Student st);

	public List<Student> getAllStudent();

	public List<Student> searchStudentByBatchNumberAndMode(String batchNumber, String batchMode);

	public Student getSingleStudent(int id);

	public void updateStudentFess(int studentid, float ammount);

	public void removeStudent(int sid);

	public void updateBatchNUmber(int studentid, String batchNumber);
}
