package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
    StudentRepository repo;
	
	
	@Override
	public void addStudentDetails(Student st) {
		repo.save(st);
		
	}

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	

	@Override
	public Student getSingleStudent(int id) {
		Optional<Student> optstudt=repo.findById(id);
		return optstudt.get();
	}

	@Override
	public void updateStudentFess(int studentid, float ammount) {
		Optional<Student> opStudent=repo.findById(studentid);
		Student st=opStudent.get();
		st.setFeesPaid(st.getFeesPaid()+ammount);
		repo.save(st);
		
	}

	@Override
	public void removeStudent(int sid) {
		repo.deleteById(sid);
		
	}

	@Override
	public void updateBatchNUmber(int studentid, String batchNumber) {
		Optional<Student> opStudent=repo.findById(studentid);
		Student st=opStudent.get();
		st.setBatchNumber(batchNumber);
		repo.save(st);
		
	}

	@Override
	public List<Student> searchStudentByBatchNumberAndMode(String batchNumber, String batchMode) {
		return repo.findAllByBatchNumberAndBatchMode(batchNumber, batchMode);
	}

	

}
