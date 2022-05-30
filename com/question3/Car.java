package com.question3;
import java.util.Scanner;
public class Car {

	int numberOfPassenger;
	int numberOfKms;
}
class Sedan extends Car{
	final int farePerKm =20;
	
	void calculateBill(int numberOfKms) {
		double fare=numberOfKms*farePerKm;
		System.out.println("The total fare amount is "+fare);
	}
}
class HatchBack extends Car{
	final int farePerKm =15;
	void calculateBill(int numberOfKms) {
		double fare=numberOfKms*farePerKm;
		System.out.println("The total fare amount is"+fare);
	}
}
class Ola{
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3){
			HatchBack h=new HatchBack();
			h.calculateBill(numberOfKMs);
			return h;
		}else {
			Sedan s=new Sedan();
			s.calculateBill(numberOfKMs);
			return s;
		}
	}
}
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Write logic to get numberOfPassenger and numberOfKms
		System.out.println("Enter the no of passenger ");
		int p=sc.nextInt();
		System.out.println("Enter the no of kilometer");
		int k=sc.nextInt();
		
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(p, k);
		
	}
}