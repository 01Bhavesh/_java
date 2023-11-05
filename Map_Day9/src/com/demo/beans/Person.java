package com.demo.beans;


public class Person implements Comparable<Employee>{
	private int id;
	private String pname;
	private String mobile;
	public Person() {
		super();
	}
	public Person(int id, String pname, String mobile) {
		super();
		this.id = id;
		this.pname = pname;
		this.mobile = mobile;
	}
	
	@Override
	public int hashCode() {
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
	return this.id == ((Person)obj).id;
	}
	public Person(int id2) {
		this.id = id2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + ", mobile=" + mobile + "]";
	}
	@Override
	public int compareTo(Employee arg0) {
		return this.pname.compareTo(((Person)arg0).pname);
	};
	
}

