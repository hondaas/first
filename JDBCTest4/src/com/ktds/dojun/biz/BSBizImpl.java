package com.ktds.dojun.biz;

import java.util.List;

import com.ktds.dojun.dao.BSDao;
import com.ktds.dojun.dao.BSDaoImpl;
import com.ktds.dojun.vo.BooksVO;

public class BSBizImpl implements BSBiz {

	private BSDao bsDao;

	public BSBizImpl() {
		bsDao = new BSDaoImpl();
	}

	public void getAllBooks() {
		List<BooksVO> books = bsDao.getAllBooks();

		for (BooksVO booksVO : books) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%d\t%s\n", booksVO.getBookId(), booksVO.getBookTitle(),
					booksVO.getSubTitle(), booksVO.getAuthor(), booksVO.getPublisher(), booksVO.getPages(),
					booksVO.getIssueDate());

		}

	}
}