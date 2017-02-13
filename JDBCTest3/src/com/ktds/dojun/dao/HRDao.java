package com.ktds.dojun.dao;

import java.util.List;

import com.ktds.dojun.vo.DepartmentsVO;
import com.ktds.dojun.vo.EmployeesVO;

public interface HRDao {
	
	public List<EmployeesVO> getAllEmployeesDpAndJobAndCity();
	
	public List<EmployeesVO> getAllEmployeesBelongDP(int departmentId);
	
	public List<EmployeesVO> getAllEmployeesWorkInCity(String city); 
	
	// public List<DepartmentsVO> getAllDepartments();

}
