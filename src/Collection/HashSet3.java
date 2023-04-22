package Collection;

import java.util.HashSet;

public class HashSet3 {
public static void main(String[] args) {
	HashSet<Integer> hs = new HashSet<Integer>();
	
	hs.add(100);
	hs.add(200);
	hs.add(31);
	hs.add(45);
	hs.add(57);
	hs.add(33);
	hs.add(27);
	
	System.out.println("HashSet :"+hs);
	
	HashSet<Integer> hs1 = new HashSet<Integer>();
	hs1.add(100);
	hs1.add(200);
	hs1.add(31);
	
	System.out.println("HashSet :"+hs1);
	
	
	// Union--------------------------- only unique elements are displayed
	
	hs.addAll(hs1);
	System.out.println(hs);
	
	// Retainall (intersection)-------- shows only common elements in between two hashsets
	
	hs.retainAll(hs1);
	System.out.println("common elements in twe HashSets is :"+hs);
	
	 //difference
	
	hs.removeAll(hs1);        // this shows proper o/p when we comment addall and retain all method , it shows unique values 
	System.out.println(hs);
	
	// Subset
	System.out.println(hs.containsAll(hs1));    // this shows proper o/p when we comment when ypu comment removeall , it gives you true o/p
	
}
}
