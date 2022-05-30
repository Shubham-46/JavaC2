package com.question4;

public class Person {
	String name;
	String gender;
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}	
}
class Address {
	String city;
	String state;
	int pinCode;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
}
class  Instructor extends Person{
	int instructorID;
	int salary;
	@Override
	public String toString() {
		return "Instructor [instructorID=" + instructorID + ", salary=" + salary + "]";
	}
	
}
class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
		+ "]";
	}
}

class Main3{
	public static Person generatePerson(Person person) {
		Person pe=new Person();
		return pe;
	}
	public static Person genertePerson(Person person) {
		Student st=new Student();
		return st;
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.studentId=1;
		stu.courseEnrolled="YES";
		stu.courseFee=7000;
		Instructor ia= new Instructor();
		ia.instructorID=121;
		ia.salary=670000;
		Person newStudent = generatePerson(new Student());
		newStudent.toString();

		Person newTeacher = generatePerson(new Instructor());
		newTeacher.toString();
		System.out.println(newStudent);
		System.out.println(newTeacher);
		}
}

