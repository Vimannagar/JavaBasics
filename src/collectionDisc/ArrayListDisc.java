package collectionDisc;

import java.util.ArrayList;

public class ArrayListDisc {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Pune");
		al.add("Mumbai");
		al.add("Delhi");
		al.add("Chennai");
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		al.remove(1);
		
		System.out.println(al);
		
		al.set(2, "Bangalore");
		
		System.out.println(al);
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Noida");
		al2.add("Ghaziabad");
		al2.add("Gurgaon");
		
		
		al2.addAll(al);
		
		System.out.println(al2);
		
		
		String secondIndexPosition = al2.get(2);
		
		System.out.println(secondIndexPosition);
		
		boolean areContentPresent = al2.containsAll(al);
		
		System.out.println(areContentPresent);
		
		boolean isKanpurPresent = al2.contains("Kanpur");
		
		System.out.println(isKanpurPresent);
		
//		al2.removeAll(al);
//		
//		System.out.println(al2);
		
		al2.retainAll(al);
		
		System.out.println(al2);
		
		
	}

}
