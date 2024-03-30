package collectionDisc;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDisc {
	
	
	public static void main(String[] args) {
		
		TreeSet<String> lhs = new TreeSet<>();
		
		lhs.add("Pune");
		lhs.add("Delhi");
		lhs.add("Noida");
		lhs.add("Bangalore");
		lhs.add("Noida");
		lhs.add(null);
		
		System.out.println(lhs);
		
		
		NavigableSet<String> desendingOrder = lhs.descendingSet();
		
		System.out.println(desendingOrder);
	}

}
