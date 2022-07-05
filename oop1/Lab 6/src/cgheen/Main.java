package cgheen;


public class Main {

	public static void main(String[] args) {
		Student Sun = new Student();
		Student Xzu = new Student();
		Student Joy = new Student();
		int mark1[] = {60, 60 , 60, 60, 60, 60 , 60};
		int mark2[] = {30, 87, 66, 77, 89, 90, 43};
		int mark3[] = {88, 91, 86, 89, 94, 89, 70}; 
		Sun.setName("Mahamudur Rahaman Khan");
		Sun.setID(170042017);
		Sun.setMarks(mark1);
		Xzu.setName("S M Xuvaer Alam");
		Xzu.setID(170042051);
		Xzu.setMarks(mark2);
		Joy.setName("Md. Ashiqur Rahman");
		Joy.setID(170042085);
		Joy.setMarks(mark3);
		
		System.out.println("ID: "+Sun.getID());
		System.out.println("GPA: "+Sun.getCG());
		
		System.out.println("ID: "+Xzu.getID());
		System.out.println("GPA:"+Xzu.getCG());
		
		System.out.println("ID: "+Joy.getID());
		System.out.println("GPA: "+Joy.getCG());
		}
}

