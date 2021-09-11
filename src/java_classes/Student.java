package java_classes;

public class Student extends Parent {

	String studentName;
	static String schoolName = "Selenium";
	int rollNumber;
	
	int a=50;

	public static void main(String[] args) {

		Student st1 = new Student("Automation", 25);
		System.out.println(st1.a);
		System.out.println(st1.studentName);
		
		Student st2 = new Student("Automation1", 250);
	}

	public Student(String studentName, int rollNumber) {
		
		/*int a =60;
		System.out.println(this.a);*/
		System.out.println(super.a);
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}

}
