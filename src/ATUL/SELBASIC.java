mport java.util.LinkedList;

e public class ListSet {

public static void main(String[] args) {

// Create a LinkedList

LinkedList<String> 1st = new LinkedList<String>();

1st.add("Cobol");

1st.add("JCL"); I

1st.add("C++");

1st.add("C#");

1st.add("Java");

1st.set(2, "Python");

for (String str2: 1st){

System.out.println(str2);

}