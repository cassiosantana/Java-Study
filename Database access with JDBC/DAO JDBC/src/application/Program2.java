package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = null;
		
		System.out.println("=== TEST 1: department insert ===");
		dep = new Department(null, "Home");
		departmentDao.insert(dep);
		System.out.println(dep);

		System.out.println("=== TEST 2: department findById ===");
		dep = departmentDao.findById(4);
		System.out.println(dep);
		
		System.out.println("=== TEST 3: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		list.forEach(System.out::println);
	}

}
