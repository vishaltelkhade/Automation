package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashList1 {

	public static void main(String[] args) {
		
		// DEFAULT CAPACITY OF HASGSET IS 16 AND LOAD FACTOR IS 0.75
		HashSet hs2 = new HashSet();     // HETROGENIOUS HASHSET
		
		   // IF WE WANT TO CHANE THE SIZE AND FACTOR OF THE HASHSET THEN WE HAVE TAKE OBJECT OF HASHSET LIKE THAT
		   //HashSet hs1 = new HashSet(100 ,(float) 0.90);
		
		   // HOMOGENIOUS HASHSET of INTEGER DATA TYPE
	       //HashSet<Integer> hs2 = new HashSet<Integer>();
		 
		 hs2.add(100);
		 hs2.add("welcome");
		 hs2.add('A');
		 hs2.add(30.3);
		 hs2.add(true);
		 hs2.add(false);
		 hs2.add("java");
		 hs2.add(null);
		 
		 //PRINTING HASHSET-------------o/p is not in order we declared element in hashset it shuffles according it want
		 //                              i.e insertion order is not preserved in hashset                                 
		 System.out.println(hs2);
		 
		 // Duplicate values are not allowed in HashSet for example
		 // It do not show error also it is not add in hashset by duplicatly
		 // if we want to cheak it do not allow duplicate value we do given below
		 // if duplicate present in hashset it gives false it gives o/p in boolean i.e it gives false 
		 // but if duplicate is not present then it shows true in o/p ..to cheak comment line no 20
		 System.out.println(hs2.add('A'));
		 
		 // REMOVE
		 hs2.remove("java");
		 System.out.println(hs2);
		 
		 // ***GET and SET*** METHOD IS NOT PRESENT IN HASHSET SO THERE IS NO INDEXING CONCEPT IN HASHSET AND SO WE CANT USE FOR LOOP IN HASHSET .
		 
		 
		 // CONTAINS ---------------O/P IN BOOLEAN
		 System.out.println(hs2.contains("welcome"));      // o/p : true
		 System.out.println(hs2.contains("wel"));          // o/p : false
		 
		 // ISEMPTY
		 System.out.println(hs2.isEmpty());
		 
		 // READING ELELMENT OR OBJ FROM  HASHSET 
		  System.out.println("READING ELELMENT OR OBJ FROM  HASHSET USING for each loop");
		 for(Object obj:hs2) {
			 System.out.println(obj);
		 }
		 
		  System.out.println("READING ELELMENT OR OBJ FROM  HASHSET using Iterator");
		  Iterator  I = hs2.iterator();
		  while(I.hasNext()){
			  System.out.println(I.next());
		  }
		 
		 

	}

}
