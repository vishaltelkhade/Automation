package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	   Vector<Integer> VC = new Vector<Integer>();
	   VC.add(2);
	   VC.add(1);
	   VC.add(4);
	   VC.add(3);
	   VC.add(10);
	   VC.add(0);
	   VC.add(11);
	   VC.add(15);
	   VC.add(10);
	   
	   // PRINT THE VECTOR
	   System.out.println(VC);
	   
	   // SIZE -------------------------------------- TO KNOW THE SIZE OF VECTOR OR HOW MUCH ELEMENTS PRESENT IN VECTOR
	   System.out.println(VC.size());  
	   
	   // GET --------------------------------------- TO KNOW WHICH VALUE OR ELEMENT PRESENT ON THE PERTICULAR INDEX NUMBER                              
	   System.out.println(VC.get(2));   
	   
	   // REMOVE ------------------------------------ TO REMOVE THE ELEMENT OR VALUE FROM VECTOR BY PUTING INDEX NUMBER IN REMOVE METHOD
	   VC.remove(0);
	   System.out.println(VC);
	   
	   // ADD --------------------------------------- TO ADD ANY ELEMENT OR VALUE IN VECTOR BY PUTTING INDEX NUMBER AND THE VALUE WE WANT TO ADD 
	   VC.add(0, 2);
	   System.out.println(VC);
	   
	   // UPDATE 1. SET ----------------------------- TO ADD ANY ELEMENT OR VALUE IN VECTOR BY PUTTING INDEX NUMBER AND THE VALUE WE WANT TO ADD 
	   VC.set(3, 100);
	   System.out.println(VC);
	   
	   // FOR LOOP
	   System.out.println("vector element using for loop");
	   for(int i=0; i<VC.size(); i++) {
		   
		   System.out.println(VC.get(i));
	   }
	   
	   // FOR EACH LOOP OR ADVANCE FOR LOOP
	   System.out.println("vector elements using for each loop");
	   for(Integer Vec: VC) {
		   System.out.println(Vec);
	   }
	   
	   // ITERATOR
	   System.out.println("vector elements using Iterator");
	   Iterator M = VC.iterator();
	   while(M.hasNext()) {
		   System.out.println(M.next());
	   }
	}

}
