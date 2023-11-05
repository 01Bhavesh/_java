package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SaleriedEmp;

public class EmployeeDaoImp implements EmployeeDao{
	public EmployeeDaoImp() {}
	static Set<Employee> elist = new HashSet<>();
	static {
		elist.add(new SaleriedEmp(1,"bhavesh","651551","MSC","Teacher",LocalDate.of(2021, 10, 12),15000,2000));
		elist.add(new ContractEmp(2,"vinay","486425","HM","PHD",LocalDate.of(2020, 11, 15),16000,45));
		elist.add(new SaleriedEmp(3,"Sanskar","654112","Doctor","working",LocalDate.of(2023, 12, 20),20000,1000));
		elist.add(new ContractEmp(4,"mayur","245642","IT","emp",LocalDate.of(2019, 10, 14),14000,30));
	}
	@Override
	public void save(Employee e) {
		elist.add(e);
		
	}
	@Override
	public Set<Employee> findAll() {
		
		return elist;
	}
	@Override
	public Employee findById(int id) {
		for(Employee e :elist)
		{
			if(e.getId()==id)
			{
				return e;
			}
		}
		return null;
	}
	@Override
	public boolean deleteById(int id) {
		return elist.remove(new SaleriedEmp(id));
	}
	@Override
	public boolean modifySal(int id, int sal) {
		Employee e = findById(id);
		if(e!=null)
		{
			if(e instanceof SaleriedEmp)
			{
				((SaleriedEmp) e).setSal(sal);
			}
		else
			{
			((ContractEmp)e).setAmount(sal);
			}
		return true;
		}
		else
		{
			return true;
		}
	}
	@Override
	public Set<Employee> sortByName() {
		Set<Employee> lst= new TreeSet<>();
		for(Employee e:elist)
		{
			lst.add(e);
		}
		return lst;
	}
	@Override
	public Set<Employee> sortBySal() {
		Comparator<Employee> mysal = (o1,o2)->
		{
			double sal1 = 0;
			double sal2 = 0;
			if(o1 instanceof SaleriedEmp)
			{
				sal1 = ((SaleriedEmp)o1).getSal();
			}
			else
			{
				sal1 = ((ContractEmp)o1).getAmount();
			}
			if(o2 instanceof SaleriedEmp)
			{
				sal2 = ((SaleriedEmp)o2).getSal();
			}
			else
			{
				sal2 = ((ContractEmp)o2).getAmount();
			}
			return (int) (sal1-sal2);
		};
		TreeSet<Employee> ts = new TreeSet<>(mysal);
		for(Employee e:elist)
		{
			ts.add(e);
		}
		return ts;
	}
	@Override
	public Employee[] findTopMost(int n) {
		Set<Employee> ts = sortBySal();
		Employee[] emp = new Employee[n];
		int count = 0;
		for(Employee e:ts)
		{
			emp[count]=e;
			if(count == n)
			{
				break;
			}
		}
		return emp;
		
	}
	
}
