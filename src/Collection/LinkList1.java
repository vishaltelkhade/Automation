package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList1 {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();   // it is for hetrogenious data type
	
	LinkedList<Integer> ll1 = new LinkedList<Integer>();  // It is for only integer type data type
	
	// ADD INTO ll
	
	ll.add(100);
	ll.add("welcome");
	ll.add(15.5);
	ll.add('A');
	ll.add(true);
	ll.add(false);
	
	System.out.println(ll);
	
	// REMOVE FROM LINKLIST
	ll.remove(4);
	System.out.println("after removing element :"+ll);
	
	// ADD INTO LINKLIST
	ll.add(4, "TRUE");
	System.out.println("After add at index four :"+ll);
	
	// GET METHOD IS USE TO RETRIVE DATA FROM LINKEDLIST by index number
	System.out.println(ll.get(4));
	
	//  SET METHOD IS USE TO REPLACE MODIFIED OR UPDATE OR CHANGE THE ELEMENT FROM THE LINKLIST
	ll.set(4,57704);
	System.out.println("after replace the value :"+ ll);
	
	// CONTAINS METHOD SHOWS ELEMNT WE ENTER IS PRESENT IN LINKLIST OR NOT WITH BOOLEAN OUTPUT
	System.out.println(ll.contains("welcome"));
	System.out.println(ll.contains("JAVA"));
	
	// isEmpty METHOD RETURNS TRUE IF THE LINKEDLIST IS EMPTY
	 System.out.println(ll.isEmpty());
	  
	    System.out.println("READING DATA USING FOR LOOP");
	 
	//   READING DATA USING FOR LOOP
	 for(int i=0; i<ll.size(); i++) {
		 System.out.println(ll.get(i));
	 }
	 
	 //  READING DATA USING FOR EACH LOOP OR ADVANCE FOR LOOP
	  System.out.println("READING DATA USING FOR EACH LOOP");
	 for(Object m:ll) {                                          // WE TAKE OBJECT HERE BECAUSE THE DATA PRESENT IN LINKLIST IS HETROGENIOUS
		System.out.println(m); 
	 }
	 
	 //  READING DATA USING ITRATOR
	 System.out.println("READING DATA USING ITERATOR");
	 Iterator obj = ll.iterator();
	 while(obj.hasNext())  {                                     // IF THE NEXT VALUE IS PRESENT IT SHOWS TRUE
		 System.out.println(obj.next());                                               
	 }
	 
	 //  CONTAINS METHOD
	  System.out.println(ll.contains("TRUE"));       // o/p will be false becuse in linkedlist "TRUE" Is not present
	  System.out.println(ll.contains("welcome"));    // O/P Will be true because in linkedlist "welcome" is present.
	  
	 // ISEMPTY METHOD
	  System.out.println(ll.isEmpty());              // o/p will be false because linkedlist is not empty.
	                                                 // if it is empty then the o/p will be true.
	
}
}
