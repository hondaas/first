package com.ktds.dojun;

import com.ktds.dojun.biz.BSBiz;
import com.ktds.dojun.biz.BSBizImpl;

public class BSController {

	public void start() {

		BSBiz bsBiz = new BSBizImpl();

		bsBiz.getAllBooks();
		

	}

	public static void main(String[] args) {
		new BSController().start();
	}

}