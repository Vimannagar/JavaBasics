package stringdisc;

public class StringMethods {
	
	
	public static void main(String[] args) {
		
		String s = "abcdef";
		
		char c = s.charAt(2);
		
		System.out.println(c);
		
		int count = s.length();
		
		System.out.println(count);
		
		
		String s1 = "abcsoftware";
		
		String s2 = "abcSoftware";
		
		boolean s3 = s1.equals(s2);
		
		System.out.println(s3);
		
		boolean s4 = s1.equalsIgnoreCase(s2);
	
			System.out.println(s4);
			
			String s5 = "Pune";
			
			String s6 = s5.toUpperCase();
	
			System.out.println(s6);	
			
			
			String s7 = s5.toLowerCase();
			
			System.out.println(s7);
			
			String s8 = "abcdefdhi";
			
			String s9 = s8.replace('d', 'c');
			
			System.out.println(s9);
			
			String s10 = "HyderabaD";
			
			String s11 = s10.replace("Hyder", "Ahmed");
			
			System.out.println(s11);
			
			String s12 = s11.replaceAll("[A-D]", "a");
			
			System.out.println(s12);
			
			String s13 = s11.replaceAll("[^A-Z]", "a");
			
			System.out.println(s13);
			
			String s14 = s11.replaceAll("[a-h]", "z");
			
			System.out.println(s14);
			
			String s15 = s11.replaceAll("[A-Za-h]", "@");
			
			System.out.println(s15);
			
			String s16 = s11.replaceAll("[a-z]", "");
			
			System.out.println(s16);
			
			String s17 = "ta@$m$%4534^%$pa";
	
		String	s18 = s17.replaceAll("[^a-z]", "");
			
			System.out.println(s18);
			
			String s19 = "@#$%^&34543d";
			
			String s20 = s19.replaceAll("[^0-9]", "");
			
			System.out.println(s20);
			
			
			String s21 = "56"+2;
			
			System.out.println(s21);
			
			int s22 = Integer.parseInt(s21);
			
			System.out.println(s22+2);
			
			String s23 = "false";
			
			boolean b = Boolean.parseBoolean(s23);
			
			System.out.println(b);
			
			
			int i = 90;
			
			String s24 = String.valueOf(i);
			
			System.out.println(s24);
			
			char c1 = 'f';
			
			boolean isalphabet = Character.isAlphabetic(c1);
			System.out.println(isalphabet);
			
			
			char c2 = '9';
			
			boolean isnumber = Character.isDigit(c2);
			
		System.out.println(isnumber);
		
		
	}

}
