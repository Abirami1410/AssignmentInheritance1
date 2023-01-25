package org.student;

import org.department.Department;

//week3.day2
//Assignmet 2

public class Student extends Department {
    public void studentName() {
		System.out.println("Student name is Abirami");

	}
    public void studentDept() {
		System.out.println("Student dept is IT");

	}
    public void studentId() {
    	System.out.println("RollNo is 002");
    }
    public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
}
