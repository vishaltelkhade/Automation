package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.annotation.processing.SupportedSourceVersion;

public class ArrayList2 {
public static void main(String[] args) {
	ArrayList AL = new ArrayList();
	AL.add("a");
	AL.add("d");
	AL.add("c");
	AL.add("b");
	System.out.println(AL);
	
	ArrayList duplicate = new ArrayList ();
	
	// Addall
	duplicate.addAll(AL);
	System.out.println(duplicate);

	// Remove all
	duplicate.removeAll(AL);
	System.out.println("After removing all elements :"+duplicate);

	//	AL.sort(null);
    //System.out.println(AL);
	
    //Collection method
	
	//sort
	System.out.println("array list before sort :"+AL);
	Collections.sort(AL);
	System.out.println("Arraylist after sort :"+AL);
	
	//Reverse order
	Collections.sort(AL, Collections.reverseOrder());
	System.out.println(AL);
	
	
	//Shuffle                                 
	Collections.shuffle(AL);
	System.out.println(AL);
	
	
}
}
	