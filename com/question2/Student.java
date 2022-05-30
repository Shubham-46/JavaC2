package com.question2;
import java.util.Scanner;
public class Student {

	int roll;
	String name;
	String address;
	int marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	void details() {
		System.out.println("Your roll no "+roll);
		System.out.println("Your name "+name);
		System.out.println("Your addres is "+address);
		System.out.println("Your marks is "+marks);
	}
	void average(int count) {
		double e=marks/count;
		System.out.println("Average is "+e);
	}
	
	
	
}
class Demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		double avg=0;
		Student[] st=new Student[num];
		Student s=new Student();
		for(int i=1;i<=st.length;i++) {
			System.out.println("Enter the no roll");
			int n=sc.nextInt();
			System.out.println("Enter the name");
			String na=sc.next();
			System.out.println("Enter the add");
			String add=sc.next();
			System.out.println("Enter the marks");
			int ma=sc.nextInt();
		
			s.setRoll(n);
			s.setName(na);
			s.setAddress(add);
			s.setMarks(ma);
			s.details();
			avg+=s.getMarks();
		}
		System.out.println("Average is "+avg/st.length);
	}
}
