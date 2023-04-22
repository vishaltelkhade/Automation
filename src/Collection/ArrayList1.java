package Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1{

    //default size of arraylist array is 10...
	// but if we add 10 elements in array then it creates new array of differnt size 
	//the size of next array is we can calculate with this formula : CURRENT ARRAY SIZE * 3/2
	//                                                             :                 10 * 3/2 = 16
	//  next array size should be 16 as we calculate

	public static void main(String[] args) {
	      
		//int a[] = new int [5];             // STATIC ARRAY + IT CAN STORE HOMOGENIOUS DATA(similar type of data)
		
		ArrayList al = new ArrayList();    // DYNAMIC ARRAY + IT CAN STORE HETROGENIOUS DATA (different type of data)
		
		al.add(100);               // int
        al.add("welcomw back");    //string
        al.add('A');               //char
        al.add(15.3);              //double
        al.add(true);              //boolean
        al.add(null);
        al.add('A');               //char
        al.add(15.3);              //double
        al.add(true);              //boolean
        al.add(null);
                     
       
        System.out.println(al);

		
      
           //6. Size
        System.out.println("no of element store in given array is :"+al.size());  //to get size of array
        
           //remove 
           // 1. remove by index
            al.remove(5);
            System.out.println(al);  //15.3 is of index no 3 which removed
              
           al.add(10000);
           System.out.println(al);
            
          // 2. Remove by object
            al.remove(al);
            System.out.println(al);
            
          // 3. insert new element
            al.add(3, 15.3);
            System.out.println(al);
        
           al.add(8, "java");
           System.out.println(al);
            
          // 4. retreive specific element 
           System.out.println(al.get(2));
           
          // 5. replece element or change
           al.set(8, "python");
           System.out.println(al);
           
          // 7. contains - search element : true false
          System.out.println(al.contains("python"));  
          
          // 8. isempty
          
          System.out.println(al.isEmpty());
          System.out.println();
          
          //9 read or print the data using for loop
          
           for(int i=0; i<al.size();i++) {
        	   System.out.println(al.get(i));
           }
           
          // reading and printing data using for each loop 
           System.out.println("reading element using for each loop");
           for (Object obj:al) {                          //for each loop
        	   System.out.println(obj);
           }
           
         
           
           //iterator 
           System.out.println("printing and reading data using iterator");
           Iterator ab=al.iterator();
           while(ab.hasNext()) {
        	   System.out.println(ab.next());
           }
          
   }

}
