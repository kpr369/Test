package java_classes;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		int values [] = new int[5];
		
		values[0]= 5;
		values[1]=45;
		values[2]=10;
		values[3]=20;
		
		double[] d = {1.0,2.0};
		
		boolean b[] = {true,false,true};
		
		String city [] = {"Hyderabad","Bang","Tamilandau"};
	
			for(int i=0;i<values.length;i++)
				System.out.println(values[i]);
			
			Arrays.sort(values);
			
			System.out.println("*******************");
			
			
			for(int i=0;i<values.length;i++)
				System.out.println(values[i]);
				
	}

}

