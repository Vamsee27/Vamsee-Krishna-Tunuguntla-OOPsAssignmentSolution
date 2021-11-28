package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		
		departmentname = "Admin Department";
		
		return departmentname;
		
	}
	
	public String getTodaysWork() {
		
		gettodaywork = "Complete your documents Submission";
		
		return gettodaywork;
		
	}

	public String getWorkDeadline() {
	
		getworkdeadline = "Complete by EOD";
	
		return getworkdeadline;
	
	}


}
