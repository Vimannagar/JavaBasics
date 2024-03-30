package arrays;

import java.util.Arrays;

public class ArrayDisc {
	
	public static void main(String[] args) {
		
//		way 1:
		
		int [] a = new int[5];
		
		a[0] = 2;
		a[1]= 6;
		a[2] = 4;
		a[3] = 10;
		a[4]= 20;
		
		int b = a.length;
		
		System.out.println(b);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		
		String s[] = {"a", "b", "c"};
		
		for(String ss:s)
		{
			System.out.println(ss);
		}
		
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
