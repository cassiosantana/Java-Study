package application;

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
	}

}
