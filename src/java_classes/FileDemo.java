package java_classes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		/*
		File f = new File("Z:\\eclipse");
		
	
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.length());
		
		for(String fileName : f.list())
		{
			System.out.println(fileName);
		}
		
		
			for(File s: f.listFiles())
			{
				System.err.println(s.getAbsolutePath());
			}*/
		
			
			Scanner scanner  = new Scanner(System.in);
			
			System.out.println("Enter Data");
			String data = scanner.nextLine();
			
			System.out.println(data.toUpperCase());
		
	}

}
