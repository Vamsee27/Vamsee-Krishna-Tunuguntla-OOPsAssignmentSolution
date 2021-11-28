package com.greatlearning.model;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		
		departmentname = "Tech Department";
		
		return departmentname;
		
	}
	
	public String getTodaysWork() {
		
		gettodaywork = "Complete coding of module 1";
		
		return gettodaywork;
		
	}

	public String getWorkDeadline() {
	
		getworkdeadline = "Complete by EOD";
	
		return getworkdeadline;
	
	}

	public String getTechStackInformation() {
	
		String getTechStackInformation = "core Java";
	
		return getTechStackInformation;
	
	}

}
