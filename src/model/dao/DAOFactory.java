package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DAOFactory {
	
	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDAO createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
