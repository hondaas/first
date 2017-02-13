package com.ktds.dojun;

import com.ktds.dojun.biz.HRBiz;
import com.ktds.dojun.biz.HRBizImpl;

public class HRController {

	public void start() {

		HRBiz hrBiz = new HRBizImpl();

		hrBiz.getAllEmployeesBelongDP(120);
		hrBiz.getAllEmployeesWorkInCity("Seattle");
		hrBiz.getAllEmployeesDpAndJobAndCity();

	}

	public static void main(String[] args) {
		new HRController().start();
	}

}