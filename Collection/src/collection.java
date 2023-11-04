import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class collection {

	public static void main(String[] args) {
//		int[] arr = {12,10,25,16};
//		//System.out.println(Arrays.asList(arr));
//		for(int num:arr) {
//			System.out.println("before"+num);
//		}
//		Arrays.sort(arr);
//		for(int num:arr) {
//			System.out.println("after"+num);
//		}
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(10);
		alist.add(45);
		alist.add(65);
//		for(int x:alist)
//		{
//			System.out.println(x);
//		}
		int pos = alist.indexOf(new Integer(65));
		System.out.println(pos);
//		int arr1 =16;
		
//		System.out.println(Arrays.binarySearch(arr, arr1));
	}
}
