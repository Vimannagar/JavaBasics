package stringdisc;

import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		
		char c = 'a';
		
		
		HashMap<Character, Integer> hm  = new HashMap<Character, Integer>();
		
		hm.put(c, 2);
		
		
		System.out.println(hm);
		
		boolean isPresent = hm.containsKey('f');
		
		System.out.println(isPresent);
		
		Integer value = hm.get(c)+1;
		
		System.out.println(value);
		
		
	}

}
