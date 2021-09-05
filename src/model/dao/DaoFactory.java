package model.dao;

import db.DB;
import model.dao.impl.SellerDao_JDBC;



public class DaoFactory {

	public static SellerDao creatSelleDao() {
		return new SellerDao_JDBC(DB.getConnection());
	}
	
	
}
