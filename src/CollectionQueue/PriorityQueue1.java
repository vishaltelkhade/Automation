package CollectionQueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// Insertion order is not  preserved according to me 
		// duplicates are allowed
		// only homogeneous data or element allowed
		
		PriorityQueue pq = new PriorityQueue();
		
      // Adding Elemnts 
	  // 1.Add
		
		pq.add("A");
        pq.add("Z");
        pq.add("D");
        pq.add("B");
        pq.add("N");
       System.out.println(pq);
        
     // 2. Offer
        pq.offer("E");
        System.out.println(pq);
        
        pq.offer("F");
        System.out.println(pq);
        
      // GET HEAD ELEMENTS
      
           //  1. element ----------------- to know first value in the priorityqueue but, it shows exception when PriorityQueue is empty
       System.out.println(pq.element());
       
           // 2. peek --------------------- to know first value in the priorityqueue and it shows null in o/p when PriorityQueue is empty
       System.out.println(pq.peek());
        
      // REMOVING HEAD ELEMENTS MEANS FIRST ELEMENT IN priorityqueue IS GET REMOVED
      
           // 1. Remove : REMOVING HEAD ELEMENTS MEANS FIRST ELEMENT IN priorityqueue ,,IT THROWS EXCEPTION IF priorityqueue IS EMPTY
       pq.remove();
       System.out.println(pq);
          
           // 2. Poll : REMOVING HEAD ELEMENTS MEANS FIRST ELEMENT IN priorityqueue ,, IT SHOWS NOTHING ON THE CONSOLE
       pq.poll();
       System.out.println(pq);
       
       
       // GET METHOD IS NOT APPLICABLE FOR priorityqueue SO WE CANT USE FOR LOOP
       
       // FOR EACH LOOP
       for(Object obj:pq) {
    	   System.out.println(obj);
       }
	}

}
