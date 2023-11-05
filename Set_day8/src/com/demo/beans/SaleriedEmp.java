package com.demo.beans;

import java.time.LocalDate;

public class SaleriedEmp extends Employee{
	private int sal;
	private int bonus;
	public SaleriedEmp() {
		super();
	}
	public SaleriedEmp(int id, String pname, String mobile,String dept, String desig, LocalDate doj, int sal, int bonus) {
		super(id,pname,mobile,dept,desig,doj);
		this.sal = sal;
		this.bonus = bonus;
	}
	public SaleriedEmp(int id) {
		super(id);
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getBonus() {
		return bonus;
	}
	public double calculation()
	{
		return sal*bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SaleriedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
}
