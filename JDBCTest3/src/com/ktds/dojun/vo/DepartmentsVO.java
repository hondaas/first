package com.ktds.dojun.vo;

import java.util.List;

import com.ktds.dojun.daosupport.annotation.Types;

public class DepartmentsVO {

	@Types(alias = "D_DEPARTMENT_ID")
	private int departmentId;
	@Types
	private String departmentName;
	@Types
	private int managerId;
	@Types
	private int locationId;
	@Types
	private LocationsVO LocationsVO;
	@Types
	private List<EmployeesVO> employeesVO; 

	public List<EmployeesVO> getEmployeesVO() {
		return employeesVO;
	}

	public void setEmployeesVO(List<EmployeesVO> employeesVO) {
		this.employeesVO = employeesVO;
	}

	public void setLocationsVO(LocationsVO locationsVO) {
		LocationsVO = locationsVO;
	}

	public LocationsVO getLocationsVO() {
		if (LocationsVO == null) {
			LocationsVO = new LocationsVO();
		}
		return LocationsVO;
	}

	public void setEmployeesVO(LocationsVO employeesVO) {
		this.LocationsVO = employeesVO;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

}
