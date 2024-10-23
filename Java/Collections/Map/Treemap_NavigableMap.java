package Map;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Treemap_NavigableMap {
 public static void main(String args[]) {
	 NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
	 map.put(100,"Amit");   			//put() it add the element
	 map.put(102,"Ravi");
	 map.put(101,"Vijay");
	 map.put(103,"Rahul");
	 	System.out.println("descending order" + map.descendingMap());
	 	System.out.println("headMap: "+map.headMap(102,true));
	 	System.out.println("tailMap: "+map.tailMap(102,true));
	 	System.out.println(" subMap: " +map.subMap(102, false,102,true));
	 for (Map.Entry m:map.entrySet()){ 	// for iteration
	 	System.out.println(m.getKey()+""+m.getValue());  //getKey():it gets value
}
}
}

