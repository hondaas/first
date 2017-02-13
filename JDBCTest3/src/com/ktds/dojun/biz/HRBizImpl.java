package com.ktds.dojun.biz;

import java.util.List;

import com.ktds.dojun.dao.HRDao;
import com.ktds.dojun.dao.HRDaoImpl;
import com.ktds.dojun.vo.DepartmentsVO;
import com.ktds.dojun.vo.EmployeesVO;
import com.ktds.dojun.vo.LocationsVO;

public class HRBizImpl implements HRBiz {

	private HRDao hrDao;

	public HRBizImpl() {
		hrDao = new HRDaoImpl();
	}

	public void getAllEmployeesDpAndJobAndCity() {
		List<EmployeesVO> employees = hrDao.getAllEmployeesDpAndJobAndCity();
		DepartmentsVO departmentsVO = null;

		for (EmployeesVO employeesVO : employees) {
			departmentsVO = employeesVO.getDepartmentsVO();
			System.out.printf("%d\t%s\t%s\t%s\n", employeesVO.getEmployeeId(), departmentsVO.getDepartmentName(),
					employeesVO.getJobsVO().getJobTitle(), departmentsVO.getLocationsVO().getCity());

		}

	}

	@Override
	public void getAllEmployeesBelongDP(int departmentId) {
		List<EmployeesVO> employees = hrDao.getAllEmployeesBelongDP(departmentId);
		for (EmployeesVO employeesVO : employees) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\t%d\t%d\n", employeesVO.getEmployeeId(),
					employeesVO.getFirstName(), employeesVO.getLastName(), employeesVO.getEmail(),
					employeesVO.getPhoneNumber(), employeesVO.getHireDate(), employeesVO.getJobId(),
					employeesVO.getSalary(), employeesVO.getCommissionPct(), employeesVO.getManagerId(),
					employeesVO.getDepartmentId());
		}

	}

	@Override
	public void getAllEmployeesWorkInCity(String city) {
		List<EmployeesVO> employees = hrDao.getAllEmployeesWorkInCity(city);
		DepartmentsVO departmentsVO = null;

		for (EmployeesVO employeesVO : employees) {
			departmentsVO = employeesVO.getDepartmentsVO();

			System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\t%d\t%d\t%d\t%s\t%d\t%d\t%d\t%s\t%s\t%s\t%s\t%s\n",
					employeesVO.getEmployeeId(), employeesVO.getFirstName(), employeesVO.getLastName(),
					employeesVO.getEmail(), employeesVO.getPhoneNumber(), employeesVO.getHireDate(),
					employeesVO.getJobId(), employeesVO.getSalary(), employeesVO.getCommissionPct(),
					employeesVO.getManagerId(), employeesVO.getDepartmentId(), departmentsVO.getDepartmentId(),
					departmentsVO.getDepartmentName(), departmentsVO.getManagerId(), departmentsVO.getLocationId(),
					departmentsVO.getLocationsVO().getLocationId(), departmentsVO.getLocationsVO().getStreetAddress(),
					departmentsVO.getLocationsVO().getPostalCode(), departmentsVO.getLocationsVO().getCity(),
					departmentsVO.getLocationsVO().getStateProvince(), departmentsVO.getLocationsVO().getCountryId());
		}

	}

	@Override
	public void getAllEmployeesInDepartmentRevert() {
		
		
		
		
		
	}
}
