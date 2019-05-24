package application;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	
	public static void main(String[] args) {
		DepartmentDAO depDao = DAOFactory.createDepartmentDao();
		//Seller sel = sellerDao.findById(3);
		//List<Department> list = depDao.findAll();
		Department dep = depDao.findById(3);
		//List<Seller> list = sellerDao.findAll();
		//Seller seller = sellerDao.findById(1);
		//Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.00,dep);
		
		
		System.out.println(dep);
	}
	
}
