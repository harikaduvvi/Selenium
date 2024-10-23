package Map;
import java.util.HashMap;
import java.util.Map;

public class Hash_map {
public static void main(String args[]) {
	Map<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(100, "Amit");   			//put() it add the element
	hm.put(103, "mit");
	hm.put(102, "Rahul");
	hm.put(101, "mit");
	hm.put(null, null);				//it allows null values and the null key.
	hm.remove(101);				//by using keys we remove the element
	hm.replace(102, "Rahul", "Pavan");		//replace() by using replace method
	//System.out.println("Initial list of elements: "+hm);
	for(Map.Entry MapObj:hm.entrySet()) {
		System.out.println(MapObj.getKey()+" "+ MapObj.getValue());
	}
}
}
