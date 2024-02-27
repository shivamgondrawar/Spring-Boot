package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int StudentId;
	@Column(length=30)
	private String studentFullName;
	@Column(length=30)
	private String studentEmail;
	@Column(length=10)
	private int studentAge;
	@Column(length=30)
	private String studentCollageName;
	@Column(length=10)
	private String studentCourse;
	@Column(length=10)
	private String batchNumber;
	@Column(length=10)
	private String batchMode;
	@Column(length=10)
	private float feesPaid;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentFullName() {
		return studentFullName;
	}
	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentCollageName() {
		return studentCollageName;
	}
	public void setStudentCollageName(String studentCollageName) {
		this.studentCollageName = studentCollageName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getBatchMode() {
		return batchMode;
	}
	public void setBatchMode(String batchMode) {
		this.batchMode = batchMode;
	}
	public float getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(float feesPaid) {
		this.feesPaid = feesPaid;
	}
	public Student() {
		super();
	}
	public Student(int studentId, String studentFullName, String studentEmail, int studentAge,
			String studentCollageName, String studentCourse, String batchNumber, String batchMode, float feesPaid) {
		super();
		StudentId = studentId;
		this.studentFullName = studentFullName;
		this.studentEmail = studentEmail;
		this.studentAge = studentAge;
		this.studentCollageName = studentCollageName;
		this.studentCourse = studentCourse;
		this.batchNumber = batchNumber;
		this.batchMode = batchMode;
		this.feesPaid = feesPaid;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentFullName=" + studentFullName + ", studentEmail="
				+ studentEmail + ", StudentAge=" + studentAge + ", studentCollageName=" + studentCollageName
				+ ", studentCourse=" + studentCourse + ", batchNumber=" + batchNumber + ", batchMode=" + batchMode
				+ ", feesPaid=" + feesPaid + "]";
	}
	
}
