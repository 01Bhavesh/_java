package com.demo.service;
import java.util.Scanner;
import com.demo.bean.cl1;
public class addition extends cl1 implements addition_interface1{

	
	public addition() {
		super();
	
	}

	public addition(int x, int y) {
		super(x, y);

	}
@Override
	public int add() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
//		addition ad = new addition(x,y);
		cl1 obj1 = new cl1(x,y);
		obj1.setX(x);
		int add =x+y;
		System.out.println(obj1.getX());
//		int add = ad.getX()+ad.getY();
		return add;
	}

	
}
