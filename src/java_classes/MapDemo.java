package java_classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap();
		
		map.put(1, "Java");//entry
		map.put(1, "Hello"); //entry
		map.put(2, "Selenium");
		map.put(null, "data");
		map.put(null, "Test");
	
		//System.out.println(map.get(1));
		
		/*for(String i : map.values())
		{
			System.out.println(i);
		}*/
		
		for(Entry entry : map.entrySet())
		{
			
			System.out.println(entry.getKey() + " :" + entry.getValue());
		}
	}

}
