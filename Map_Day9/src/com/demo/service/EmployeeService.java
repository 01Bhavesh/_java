package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService{

	void addEmployee(int x);

	Map<Integer, Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	boolean updateSal(int id, int sal);

	Set<Employee> sortByName();

	List<Employee> sortBySal();

	Employee[] findTopMost(int n);

}
