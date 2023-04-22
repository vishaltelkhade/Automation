package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
public static void main(String[] args) {
	// same methods are present in linkedhashet as of hashset
	// duplicate elements are not allowed
	// insertion order is preserved
	// size of linkedhashset is 16 and load factor is 0.75
	
	LinkedHashSet<Integer> lhs = new LinkedHashSet();   // hetrogenious linkedhashset
	LinkedHashSet hs1 = new LinkedHashSet();            // homogegenious likedhashset 
	
	 lhs.add(100);
	 lhs.add(200);
	 lhs.add(900);
	 lhs.add(400);
	 lhs.add(500);
	 lhs.add(600);
	 lhs.add(700);
	 
	 
	// duplicate elements are not allowed ,,lets see
	 System.out.println(lhs.add(300));    //    shows false in o/p, means it do not allowed duplicates
	 
	// insertion order is preserved,, lets see
	 System.out.println(lhs);
	 
}
}
