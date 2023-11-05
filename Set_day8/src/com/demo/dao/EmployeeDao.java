package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;
import com.demo.beans.Person;

public interface EmployeeDao {

	void save(Employee e);

	Set<Employee> findAll();

	Employee findById(int id);

	boolean deleteById(int id);

	boolean modifySal(int id, int sal);

	Set<Employee> sortByName();

	Set<Employee> sortBySal();

	Employee[] findTopMost(int n);

}
