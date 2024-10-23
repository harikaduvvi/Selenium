package Map;
import java.util.TreeMap;
import java.util.Map;
public class Tree_Map {
public static void main(String args[]){
TreeMap<Integer,String> map=new TreeMap<Integer,String>();
map.put(100,"Amit");   			//put() it add the element
map.put(102,"Ravi");
map.put(101,"Vijay");
map.put(103,"Rahul");
// map.put(null, null);		.
map.remove(103); 		// for removing the element
for (Map.Entry m:map.entrySet()){ 	// for iteration
	System.out.println(m.getKey()+""+m.getValue());  //getKey():it gets value
}
}
}
