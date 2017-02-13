package com.ktds.dojun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktds.dojun.daosupport.JDBCDaoSupport;
import com.ktds.dojun.daosupport.QueryHandler;
import com.ktds.dojun.daosupport.annotation.BindData;
import com.ktds.dojun.vo.BooksVO;

public class BSDaoImpl extends JDBCDaoSupport implements BSDao {

	@Override
	public List<BooksVO> getAllBooks() {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {

				StringBuffer query = new StringBuffer();
				query.append(" SELECT      BOOK_ID "         );
				query.append("            , BOOK_TITLE "     );
				query.append("            , SUB_TITLE "      );
				query.append("            , AUTHOR "         );
				query.append("            , PUBLISHER "      );
				query.append("            , PAGES "          );
				query.append("            , ISSUE_DATE "     );
				query.append(" FROM BOOKSHOP "              );

				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			@Override
			public Object getData(ResultSet rs) {
				BooksVO booksVO = new BooksVO();
				BindData.bindData(rs, booksVO);

				return booksVO;

			}
		});

	}

}
