import java.util.*;
public class vector {

	public static void main(String[] args) {
		//Vector v=new Vector();
		
		Vector<Integer> v=new Vector<>();
		System.out.println(v.size());
		System.out.println(v.capacity());//10 by default cap
		System.out.println(v.add(10));
		System.out.println(v);
		System.out.println(v.size());
		int i;
		
		for(i=1;i<11;i++ ) {
			
			v.add(10+i);
		
		}
		System.out.println(v.capacity());
		
		System.out.println(v);
		
//		for (Integer num:v)
//		{
//			System.out.println(num);
//		}

		Vector <Integer> v1= new Vector<>(7,5);
		v1.add(10);//1
		v1.add(20);
		v1.add(30);
		v1.add(45);
		v1.add(70);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(45);
		v1.add(70);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(45);
		v1.add(70);
		v1.add(140);
		v1.add(70);
		v1.add(140);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
	}
	

}
