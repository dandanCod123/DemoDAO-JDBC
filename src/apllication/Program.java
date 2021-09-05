package apllication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		SellerDao sellerDao = DaoFactory.creatSelleDao();
		
		System.out.println("=== TEST1: SELLER findById ===");
		Seller seller = sellerDao.finById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: SELLER findByDepartment ===");
		Department depart = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(depart);
		for(Seller obj: list) {
			System.out.println(obj);
		
		}	
	
		System.out.println("\n=== TEST 3: SELLER findByDepartment ===");
		list  = sellerDao.findALL();
		for(Seller obj: list) {
			System.out.println(obj);
	
	
			System.out.println("\n=== TEST 4: SELLER INSERT ===");	
	        Seller newSeller = new Seller(null ,"Greg", "greg@gmai.com", new Date(), 4000.0, depart);
			sellerDao.insert(newSeller);
			System.out.println("Inserted! new id= " + newSeller.getId());
	}
		
		System.out.println("\n=== TEST 5: SELLER UPDATE ===");	
		 seller = sellerDao.finById(1);
		 seller.setName("Daniel Moura");
		 sellerDao.update(seller);
		 System.out.println("Update completed: ");
	
		 
		 System.out.println("\n=== TEST 6: SELLER DELETE ===");	
		 System.out.println("enter id: " );
		 int id = sc.nextInt();
		 sellerDao.deleteById(id);
		 System.out.println("deleted completed: ");
		 
		 sc.close();
    }

}