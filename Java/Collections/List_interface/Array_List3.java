package List_interface;
 
import java.util.*;
public class Array_List3 {
 
//  private Random random = new Random();  
public static void main(String args[]){  
ArrayList <String>obj=new ArrayList<String>();  //Creating arraylist  
obj.add("Ravi");                                //Adding object in arraylist  
obj.add("1");  
obj.add("Ravi");  
obj.add("Ajay");  
obj.add(null);
//list.remove("Ravi");                            // Removing object
//Here, element iterates in reverse order     

//        ListIterator<String> list1= obj.listIterator(obj.size());  
//            while(list1.hasPrevious())   {  
//                String str=list1.previous();  
//                System.out.println(str);  
//            }
 
         // traversing or Looping list through Iterator  
Iterator itr=obj.iterator();     //iterator() it is interface iterate a collection of objects
while(itr.hasNext()){              //hasNext()  It returns true if Iterator has more element to iterate
System.out.println(itr.next());   //next();  It returns the next element in the collection until the hasNext()method return
}                  
}
}  
