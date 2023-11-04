package com.demo.test;

import com.demo.service.Interface2;

public class compair_num {

	public static void main(String[] args) {
	
		Interface2 obj1 = (x,y)->{return x>y?x:y;};
		System.out.println(obj1.compair(10, 15));
	
	}

}
