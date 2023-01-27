package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = null;
		
		System.out.println("=== TEST 1: department insert ===");
		dep = new Department(null, "Home");
		departmentDao.insert(dep);
		System.out.println(dep);

		System.out.println("\n=== TEST 2: department findById ===");
		dep = departmentDao.findById(4);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 3: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 4: seller deleteById ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		System.out.println("\n=== TEST 5: seller update ===");
		dep = departmentDao.findById(12);
		dep.setName("Pet");
		departmentDao.update(dep);
		System.out.println("Update Completed!");
		
		sc.close();
	}

}
