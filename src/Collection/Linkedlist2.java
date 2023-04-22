package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist2 {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	
	ll.add("A");
	ll.add("B");
	ll.add("D");
	ll.add("C");
	ll.add("Z");
	ll.add("S");
	
	System.out.println(ll);
	
	// ADDALL METHOD
	LinkedList llnew = new LinkedList();   
	llnew.addAll(ll);                        // TO COPY OR TO MAKE DUPLICATE LINKEDLIST
	System.out.println(llnew);
	
	// REMOVE ALL METHOD
	llnew.removeAll(ll);
	System.out.println(llnew);
	
	// COLLECTION METHOD : 1. SORT---collections.sort();
	System.out.println("before sort linkedlist element :"+ll);
	Collections.sort(ll);
	System.out.println("after sort linkedlist element :"+ll);
	
	// 2. REVERSE ORDER METHOD
	Collections.sort(ll,Collections.reverseOrder());
	System.out.println(ll);
	
	// 3. SHUFFLE
	Collections.shuffle(ll);
	System.out.println(ll);
}
}

