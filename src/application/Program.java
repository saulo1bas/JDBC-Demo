package application;

import java.util.Arrays;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	
	public static void main(String[] args) {
		SellerDAO sellerDao = DAOFactory.createSellerDao();
		
		//Seller sel = sellerDao.findById(3);
		
		//Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findAll();
		
		System.out.println(Arrays.toString(list.toArray()) + "\n");
	}
	
}
