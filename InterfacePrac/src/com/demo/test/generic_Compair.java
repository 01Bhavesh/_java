package com.demo.test;

import com.demo.service.Interface3;

public class generic_Compair {

	public static void main(String[] args) {
	Interface3<Integer> obj1 = (x,y)->{return x>y?x:y;};
	System.out.println(obj1.compair(15, 30));
	Interface3<String> obj2 = (x,y)->{int a =x.compareTo(y);
	return a>0?x:y;};
	System.out.println(obj2.compair("bhavesh","vinay"));
	}

}
