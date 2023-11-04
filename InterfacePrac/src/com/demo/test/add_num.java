package com.demo.test;
import com.demo.service.addition;
import com.demo.bean.cl1;
import com.demo.service.addition_interface1;
public class add_num {

	public static void main(String[] args)
	{
//		addition obj2 = new addition();
//		int ans = obj2.add();
		addition obj5 = new addition();
//		addition_interface1 obj3= new addition();
//		cl1 obj4 = new cl1();
//		int ans =  obj3.add();
		obj5.add();
		System.out.println(obj5.getX());
//		System.out.println(ans);
		addition_interface1.f1();
		
		
		
	}


	
}
