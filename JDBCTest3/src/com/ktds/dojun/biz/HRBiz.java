package com.ktds.dojun.biz;

public interface HRBiz {
	
	
	public void getAllEmployeesDpAndJobAndCity();
	
	public void getAllEmployeesBelongDP(int departmentId);
	
	public void getAllEmployeesWorkInCity(String city);
	
	public void getAllEmployeesInDepartmentRevert();

}
