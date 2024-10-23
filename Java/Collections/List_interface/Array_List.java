package List_interface;
/*ArrayList: It is like an array, but there is no size limit.
* We can add or remove elements any time ,It store the duplicate element */
 
import java.util.*;
 
public class Array_List {
 
//  private Random random = new Random();
 
public static void main(String args[]){
List<String> obj = new ArrayList<String>(); // Creating arraylist
obj.add("Ravi"); // Adding object in arraylist
obj.add("1");
obj.add("Ravi");
obj.addAll(1, obj);//adding different data type.it is used to add all of the specified elements to the specified collection.
obj.remove("Ravi"); // Removing object
for(int i=0;i<obj.size();i++){  
System.out.println( obj.get(i));   
}  
}
}
