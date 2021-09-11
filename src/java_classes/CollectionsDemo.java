package java_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList();

		list.add("Java");
		list.add("Selenium");
		list.add("Automation");
		list.add(1, "TestNG");
		list.add("Automation");
		
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		for(String s: list)
		{
			System.out.println(s);
		}
		
		Map<String,List<String>> map;
		/*System.out.println(list.indexOf("Automation"));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.set(1, "JUnit");
		System.out.println(list);
		//list.clear();
		
		List<String> list2 = new ArrayList<>();
		list2.add("Test");
		list2.addAll(0, list);
		System.out.println(list2.containsAll(list)); //list2 5
*/		/*String[] array = {"TT","TT","TSD","SDFAS","SAFD"};
		Set<String> set = new HashSet(Arrays.asList(array));
		
		System.out.println(set);*/
		
		/*for(String s: set)
		{
			System.out.println(s);
		}*/

	/*	System.out.println(list);

		List<String> list2 = new ArrayList<>();
		list2.add("Test");
		list2.addAll(0, list);
		System.out.println(list2);
		
		List<String> list3 = new ArrayList(list2);
		
		System.out.println(list3);
		
		String[] array = {"TT","TSD","SDFAS","SAFD"};
		
		List<String> list4 = new ArrayList(Arrays.asList(array));
		
		System.out.println(list4);*/
	}

}
