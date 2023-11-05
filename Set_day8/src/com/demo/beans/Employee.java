package com.demo.beans;

import java.time.LocalDate;

abstract public class Employee extends Person{
	private String dept;
	private String desig;
	private LocalDate doj;
	public Employee() {
		super();
	}
	public Employee(int id, String pname, String mobile,String dept, String desig, LocalDate doj) {
		super(id,pname,mobile);
		this.dept = dept;
		this.desig = desig;
		this.doj = doj;
	}
	public Employee(int id) {
		super(id);
	}
	public double calculation()
	{
		return 0;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desig=" + desig + ", doj=" + doj + "]";
	}
	
	
}
