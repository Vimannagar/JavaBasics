package arrays;

public class Array2 {

	public void getValue(int[] a) {
		System.out.println("Method first line");

		int b = a[2] + 2;
		System.out.println(b);
	}

	public static void main(String[] args) {

		int i[] = { 5, 6, 8, 2 };
		
		
		Array2 a2 = new Array2();
		
		a2.getValue(i);

	}

}
