package collectionDisc;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDisc {
	
	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Pune");
		hs.add("Delhi");
		hs.add("Noida");
		hs.add("Bangalore");
		hs.add("Noida");
		hs.add(null);
		
		
		System.out.println(hs);
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Pune");
		lhs.add("Delhi");
		lhs.add("Noida");
		lhs.add("Bangalore");
		lhs.add("Noida");
		lhs.add(null);
		
		System.out.println(lhs);
	}

}
