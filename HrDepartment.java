package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		
		departmentname = "Hr Department";
		
		return departmentname;
		
	}
	
	public String getTodaysWork() {
		
		gettodaywork = "Fill today's timesheet and mark your attendance";
		
		return gettodaywork;
		
	}

	public String getWorkDeadline() {
	
		getworkdeadline = "Complete by EOD";
	
		return getworkdeadline;
	
	}

	public String doActivity() {
	
		String doactivity = "team Lunch";
	
		return doactivity;
	
	}

}
