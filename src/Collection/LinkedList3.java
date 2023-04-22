package Collection;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
      
		ll.add("Cat");
		ll.add("dog");
		ll.add("elephant");
		ll.add("cat");
		
		System.out.println(ll);
		ll.add("tiger");
		System.out.println(ll);
		
		// ADDFIRST METHOD
		ll.addFirst("lion");
		System.out.println(ll);
		
		// AddLast method
		ll.addLast("deer");
		System.out.println(ll);
		
		//GetFirst method
		System.out.println(ll.getFirst());
		
		//GetLast
		System.out.println(ll.getLast());
	}

}
