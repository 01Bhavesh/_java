package com.demo.test;
import com.demo.service.Interface1;
import com.demo.service.ToCompairNumclass;
public class CompairMain {
	public static void main(String[] args) {
		Interface1 obj1 = new ToCompairNumclass();
		int x =obj1.compair();
		System.out.println(x);
	}
}
