package com.ktds.dojun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktds.dojun.daosupport.JDBCDaoSupport;
import com.ktds.dojun.daosupport.QueryHandler;
import com.ktds.dojun.daosupport.annotation.BindData;
import com.ktds.dojun.vo.DepartmentsVO;
import com.ktds.dojun.vo.DepartmentsVO;
import com.ktds.dojun.vo.EmployeesVO;
import com.ktds.dojun.vo.JobsVO;
import com.ktds.dojun.vo.LocationsVO;

public class HRDaoImpl extends JDBCDaoSupport implements HRDao {

	@Override
	public List<EmployeesVO> getAllEmployeesDpAndJobAndCity() {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {

				StringBuffer query = new StringBuffer();
				query.append(" SELECT  ");
				query.append("    E.EMPLOYEE_ID ");
				query.append("    , E.FIRST_NAME ");
				query.append("    , E.LAST_NAME ");
				query.append("    , E.EMAIL ");
				query.append("    , E.PHONE_NUMBER ");
				query.append("    , E.HIRE_DATE ");
				query.append("    , E.JOB_ID ");
				query.append("    , E.SALARY ");
				query.append("    , E.COMMISSION_PCT ");
				query.append("    , E.MANAGER_ID ");
				query.append("    , E.DEPARTMENT_ID ");
				query.append("    , J.JOB_ID J_JOB_ID ");
				query.append("    , J.JOB_TITLE ");
				query.append("    , J.MAX_SALARY ");
				query.append("    , J.MIN_SALARY ");
				query.append("    , D.DEPARTMENT_ID D_DEPARTMENT_ID ");
				query.append("    , D.DEPARTMENT_NAME ");
				query.append("    , D.MANAGER_ID ");
				query.append("    , D.LOCATION_ID D_LOCATION_ID ");
				query.append("    , L.LOCATION_ID L_LOCATION_ID ");
				query.append("    , L.STREET_ADDRESS ");
				query.append("    , L.POSTAL_CODE ");
				query.append("    , L.CITY ");
				query.append("    , L.STATE_PROVINCE ");
				query.append("    , L.COUNTRY_ID ");
				query.append(" FROM EMPLOYEES E ");
				query.append("     , DEPARTMENTS D ");
				query.append("     , LOCATIONS L ");
				query.append("     , JOBS J ");
				query.append(" WHERE  E.DEPARTMENT_ID = D.DEPARTMENT_ID ");
				query.append(" AND    D.LOCATION_ID = L.LOCATION_ID ");
				query.append(" AND    E.JOB_ID = J.JOB_ID ");

				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);

				DepartmentsVO departmentsVO = employeesVO.getDepartmentsVO();
				BindData.bindData(rs, departmentsVO);

				LocationsVO locationsVO = departmentsVO.getLocationsVO();
				BindData.bindData(rs, locationsVO);

				JobsVO jobsVO = employeesVO.getJobsVO();
				BindData.bindData(rs, jobsVO);

				return employeesVO;

			}
		});

	}

	@Override
	public List<EmployeesVO> getAllEmployeesBelongDP(int departmentId) {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {

				StringBuffer query = new StringBuffer();
				query.append(" SELECT   EMPLOYEE_ID ");
				query.append("          , FIRST_NAME ");
				query.append("          , LAST_NAME ");
				query.append("          , EMAIL ");
				query.append("          , PHONE_NUMBER ");
				query.append("          , JOB_ID ");
				query.append("          , HIRE_DATE ");
				query.append("          , SALARY ");
				query.append("          , COMMISSION_PCT ");
				query.append("          , MANAGER_ID ");
				query.append("          , DEPARTMENT_ID ");
				query.append(" FROM     EMPLOYEES     ");
				query.append(" WHERE    DEPARTMENT_ID = ? ");

				return query.toString();

			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setInt(1, departmentId);
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}
		});

	}

	@Override
	public List<EmployeesVO> getAllEmployeesWorkInCity(String city) {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();

				query.append("SELECT  ");
				query.append("    E.EMPLOYEE_ID ");
				query.append("    , E.FIRST_NAME ");
				query.append("    , E.LAST_NAME ");
				query.append("    , E.EMAIL ");
				query.append("    , E.PHONE_NUMBER ");
				query.append("    , E.HIRE_DATE ");
				query.append("    , E.JOB_ID ");
				query.append("    , E.SALARY ");
				query.append("    , E.COMMISSION_PCT ");
				query.append("    , E.MANAGER_ID ");
				query.append("    , E.DEPARTMENT_ID ");
				query.append("    , D.DEPARTMENT_ID D_DEPARTMENT_ID ");
				query.append("    , D.DEPARTMENT_NAME ");
				query.append("    , D.MANAGER_ID ");
				query.append("    , D.LOCATION_ID D_LOCATION_ID ");
				query.append("    , L.LOCATION_ID L_LOCATION_ID ");
				query.append("    , L.STREET_ADDRESS ");
				query.append("    , L.POSTAL_CODE ");
				query.append("    , L.CITY ");
				query.append("    , L.STATE_PROVINCE ");
				query.append("    , L.COUNTRY_ID ");
				query.append("FROM EMPLOYEES E ");
				query.append("     , DEPARTMENTS D ");
				query.append("     , LOCATIONS L ");
				query.append("WHERE  E.DEPARTMENT_ID = D.DEPARTMENT_ID ");
				query.append("AND    D.LOCATION_ID = L.LOCATION_ID ");
				query.append("AND    L.CITY = ? ");

				return query.toString();

			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setString(1, city);
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);

				DepartmentsVO departmentsVO = employeesVO.getDepartmentsVO();
				BindData.bindData(rs, departmentsVO);

				LocationsVO locationsVO = departmentsVO.getLocationsVO();
				BindData.bindData(rs, locationsVO);

				return employeesVO;
			}
		});

	}

}
