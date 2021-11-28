package com.greatlearning.model;

public class SuperDepartment {
	
	String departmentname = null;
	String gettodaywork = null;
	String getworkdeadline = null;
	String istodayaholiday = null;
	
	public String departmentName() {
		
		departmentname = "Super Department";
		
		return departmentname;
		
	}
	
	public String getTodaysWork() {
		
		gettodaywork = "No work as of now";
		
		return gettodaywork;
		
	}

	public String getWorkDeadline() {
	
		getworkdeadline = "Nil";
	
		return getworkdeadline;
	
	}

	public String isTodayAHoliday() {
	
		istodayaholiday = "Today is not a holiday";
	
		return istodayaholiday;
	
	}

}
