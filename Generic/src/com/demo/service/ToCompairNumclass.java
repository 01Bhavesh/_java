package com.demo.service;
import java.util.Scanner;
import com.demo.beans.ToCompairClass;

public class ToCompairNumclass extends ToCompairClass implements Interface1{
	public int compair()
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		ToCompairClass c1 =new ToCompairClass(x, y);
		return c1.getX()>c1.getY()?c1.getX():c1.getY();
	}
}
