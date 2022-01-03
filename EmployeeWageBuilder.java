package com.bridgelab.employeewage;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME=1;
	public static final int EMP_RATE_PER_HOUR=20;
	int empHrs=0;
	int empWage=0;
	
	public static void main(String[] args) {
		System.out.println("Welcome To EmployeeWage Programms");
		EmployeeWageBuilder empWage=new EmployeeWageBuilder();
		empPresentOrAbsent();
		empWage.empDailyWages();	
	}
	
	public static void empPresentOrAbsent() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck==IS_FULL_TIME) { 
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}
	
	 public void empDailyWages() {
	    	double empCheck = Math.floor(Math.random()*10)%2;
	        if (empCheck == IS_FULL_TIME){
	                empHrs = 8;
	        }else{
	                System.out.println("Employee is Absent");
	        }
	        empWage = empHrs * EMP_RATE_PER_HOUR;
	        System.out.println("Emp Wage: " + empWage);
	    }    
}
	
    	
