package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SaleriedEmp;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImp;

public class EmployeeServiceImp implements EmployeeService{
private EmployeeDao emp = new EmployeeDaoImp();
	@Override
	public void addEmployee(int id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.println("enter employee name");
		String ename = sc.nextLine();
		System.out.println("enter number");
		String mobile = sc.nextLine();
		System.out.println("enter dept");
		String dept = sc.nextLine();
		System.out.println("enter designation");
		String desg = sc.nextLine();
		System.out.println("enter date in form (dd/MM/yyyy)");
		String doj = sc.nextLine();
		LocalDate dt = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e;
		switch(id)
		{
		case 1:
			System.out.println("enter salary");
			int sal = sc.nextInt();
			System.out.println("enter bonus");
			int bonus = sc.nextInt();
			e = new SaleriedEmp(eid,ename,mobile,dept,desg,dt,sal,bonus);
			this.emp.save((Employee)e);
			break;
		case 2:
			System.out.println("enter amount");
			int amount = sc.nextInt();
			System.out.println("enter employee num");
			int empnum = sc.nextInt();
			e = new ContractEmp(eid,ename,mobile,dept,desg,dt,amount,empnum);
			this.emp.save((Employee)e);
			break;
		}
		
		
	}
	@Override
	public Map<Integer, Employee> displayAll() {
		return this.emp.findAll();
	}
	@Override
	public Employee displayById(int id) {
		return emp.findById(id);
	}
	@Override
	public boolean deleteById(int id) {
		return emp.deleteById(id);
	}
	@Override
	public boolean updateSal(int id, int sal) {
		return emp.modifySal(id,sal);
	}
	@Override
	public Set<Employee> sortByName() {
		return emp.sortByName();
	}
	@Override
	public List<Employee> sortBySal() {
		return emp.sortBySal();
	}
	@Override
	public Employee[] findTopMost(int n) {
		return emp.findTopMost(n);
	}
	

}
