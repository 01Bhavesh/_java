package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee{
	private int amount;
	private int empnum;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int id, String pname, String mobile,String dept, String desig, LocalDate doj, int amount, int empnum) {
		super(id,pname,mobile,dept,desig,doj);
		this.amount = amount;
		this.empnum = empnum;
	}
	public ContractEmp(int id)
	{
		super(id);
	}
	public double calculation()
	{
		return amount*(0.2)*empnum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getEmpnum() {
		return empnum;
	}
	public void setEmpnum(int empnum) {
		this.empnum = empnum;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [amount=" + amount + ", empnum=" + empnum + "]";
	}
	
}
