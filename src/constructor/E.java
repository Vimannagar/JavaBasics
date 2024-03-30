package constructor;

public class E extends B{
	
	public void m5()
	{
		c.m1();
		d.m4();
	}
	
	
	public void m6()
	{
		c.m2();
		d.m3();
	}
	
	
	public static void main(String[] args) {
		
		E e = new E();
		
		e.m5();
		e.m6();
		
	}

}
