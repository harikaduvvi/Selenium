package List_interface; 
import java.util.Iterator;
import java.util.Vector;
public class Vector {
public static void main(String args[]){  
Vector <String> obj=new Vector<String>();  
obj.add("Ayush");  
obj.add("Amit"); 
obj.add("Garima");
obj.add("Ashish");   
//    v.remove("Ayush");
//    v.removeAllElements();
Iterator<String> itr=obj.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}


