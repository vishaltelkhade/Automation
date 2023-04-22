package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	//CONVERT SIMPLE ARRAY INTO ARRAYLIST
	
public static void main(String[] args) {
	String arr[]= {"dog","cat","monkey"};
	
	//to read and print the data from array we use for each loop (here value is variable to store arr's data)
	for(String value:arr) {
		System.out.println(value);
		}
	ArrayList AL = new ArrayList(Arrays.asList(arr));
	System.out.println(AL);
	
}
}

