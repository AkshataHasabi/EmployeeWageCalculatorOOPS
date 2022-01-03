package com.bridgelab.employeewage;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME=1;
	
	public static void main(String[] args) {
		System.out.println("Welcome To EmployeeWage Programms");
		empPresentOrAbsent();	
	}
	
	public static void empPresentOrAbsent() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck==IS_FULL_TIME) { 
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}
}
	
    	
