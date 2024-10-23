package List_interface;
import java.util.*;
public class  Arraylist_example {	 
	//  private Random random = new Random();  
public static void main(String args[]){  
ArrayList <String>obj=new ArrayList <String>();  //Creating arraylist  
obj.add("Ravi");                                //Adding object in arraylist  
obj.add("1");  
obj.add("Ravi");  
obj.add("Ajay");  
obj.add(null);
//list.remove("Ravi");                            // Removing object
//Here, element iterates in reverse order     
ListIterator<String> list1= obj.listIterator(obj.size());  
while(list1.hasPrevious())  
{  
String str=list1.previous();  
System.out.println(str);  
}
}
}

