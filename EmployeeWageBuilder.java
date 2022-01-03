package com.bridgelab.employeewage;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	 public static int NUM_OF_WORKING_DAYS = 20; 
	    int empHrs = 0;
	    int empWage = 0;
	    int totalEmpWage=0;
	
	public static void main(String[] args) {
		System.out.println("Welcome To EmployeeWage Programms");
		EmployeeWageBuilder empWage=new EmployeeWageBuilder();
		empPresentOrAbsent();
		empWage.empDailyWages();
		empWage.empPartTimeWage();
		empWage.empPartTimeSwitchCase();
		empWage.empMonthWage();
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
	 
	 public void empPartTimeWage() {
	    	double empCheck = Math.floor(Math.random()*10)%3;
			if (empCheck == IS_FULL_TIME) {
				empHrs = 8;
			}
			else if (empCheck == IS_PART_TIME) {
				empHrs = 4;
			}
			else
				empHrs = 0;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage: " + empWage);   	
	}
	 
	 public void empPartTimeSwitchCase() {
	    	int empCheck = (int)Math.floor(Math.random()*10)%3;
	    	switch (empCheck) {
	    		case IS_FULL_TIME:
	    				empHrs = 8;
	    				break;
	    		case IS_PART_TIME:
	            		empHrs = 4;
	            		break;
	    		default:
	    				empHrs = 0;
	    	}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage: " + empWage);   	
	}
	 
	 public void empMonthWage() {
	    	for (int day = 0; day <  NUM_OF_WORKING_DAYS; day++) {
	    		int empCheck = (int)Math.floor(Math.random()*10)%3;
	    		switch (empCheck) {
	    			case IS_FULL_TIME:
	    					empHrs = 8;
	    					break;
	    			case IS_PART_TIME:
	    					empHrs = 4;
	    					break;
	    			default:
	    					empHrs = 0;
	    		}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " + empWage);  
	    	}
	    	System.out.println("Total Emp Wage: " + totalEmpWage);
	    }
}
	
    	
