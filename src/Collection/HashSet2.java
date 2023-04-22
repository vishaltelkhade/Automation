package Collection;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
	
		HashSet<Integer> hs = new HashSet<Integer> ();
      
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(20);
		hs.add(45);
		hs.add(12);
		hs.add(21);
		
		System.out.println(hs);
		
		// to duplicate 
		// Addall method
		
		HashSet<Integer> hs1 = new HashSet<Integer> ();
        hs1.addAll(hs);
        System.out.println("new HashSet :"+hs1);
        
        
        
        //removeall
        
        hs1.removeAll(hs);
        System.out.println(hs1);
        
        
        
        

	}

}
