package coding_pretice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListTest20200922 {
	public static void main(String[] args) {
		
		// Object Map List: variable Value test Code

		ArrayList <HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
	
		list.add( new HashMap<String, Object>() {{
	        put("a", "b");
	        put("c", "d");
	    }});
		
		System.out.println("----------------------------");
		System.out.println("  Map:     String Value     ");
		System.out.println("----------------------------");
		list.forEach(e -> {
			System.out.println(e);
				
		});	
			
		List<String> valueList = new ArrayList<>();
		valueList.add("AAA");
		valueList.add("BBB");
		valueList.add("CCC");
	
		HashMap< String, Object > objectMap = new HashMap<>();
		objectMap.put("1", valueList);
		objectMap.put("2", new HashMap<String, String>() {{
	        put("a", "b");
	        put("c", "d");
	    }});
		objectMap.put("3", "hihihi!");
		
		
		System.out.println("----------------------------");
		System.out.println("  Map:     Object Value     ");
		System.out.println("----------------------------");
		Iterator<String> keys = objectMap.keySet().iterator(); 
		while( keys.hasNext() ){ 
			String key = keys.next(); 
			System.out.println( "key : " + key + ", value : " + objectMap.get(key));
		}
		
		list.add(objectMap);
		System.out.println("----------------------------");
		System.out.println("            result          ");
		System.out.println("----------------------------");
		list.forEach(e -> {
			System.out.println(e);
		});	
	
	}
}
