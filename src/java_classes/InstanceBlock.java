package java_classes;

public class InstanceBlock extends Parent {
	
	
	static int count =0;
	public static void main(String[] args) {
		
		InstanceBlock ib1 = new InstanceBlock();
		InstanceBlock ib2 = new InstanceBlock();
		InstanceBlock ib3 = new InstanceBlock();
		//InstanceBlock ib4 = new InstanceBlock();
		
		System.out.println(count);
	}

	
	{	// instance block
		count++;
		System.out.println("Hello");	
	}
	
	
	public InstanceBlock() {
	
		System.out.println("Constructor");
	}
	
	
}
